package com.example.sh_enterprises;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class cart_data extends AppCompatActivity {



    //this is the JSON Data URL
    //make sure you are using the correct ip else it will not work
    public  static  String URL_PRODUCTS, pass1,pass2 ;
    public static String ptopic,psubcode;
    public static ApiInterface apiInterface;
    private static ProgressDialog progressDialog;
    //a list to store all the products
    public static  prefConfig pcg;

    List<cart_data_return> productList;

    //the recyclerview
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_data);
        Intent i = getIntent();

        pcg = new prefConfig(this);

        pass1 = pcg.read_ret_id();
        pass2 = pcg.readEmail();

        URL_PRODUCTS = "http://192.168.225.25/prem/cart_data.php?p1="+pass1+"&p2="+pass2;

        apiInterface = apiclient.getApiclient().create(ApiInterface.class);

        Toast.makeText(this, URL_PRODUCTS, Toast.LENGTH_SHORT).show();

        TextView tvv = findViewById(R.id.textView5);

        //getting the recyclerview from xml
        recyclerView = findViewById(R.id.recylcerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();

        //this method will fetch and parse json
        //to display it in recyclerview
        loadProducts();
    }

        private void loadProducts() {

            prefConfig product = new prefConfig(this);
            String str = product.read_ret_id();
            Toast.makeText(this,str,Toast.LENGTH_SHORT).show();

            progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("Please wait...");
            progressDialog.show();


            StringRequest stringRequest = new StringRequest(Request.Method.GET, URL_PRODUCTS,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                //converting the string to json array object
                                JSONArray array = new JSONArray(response);

                                for (int i = 0; i < array.length(); i++) {

                                    JSONObject product = array.getJSONObject(i);

                                    //adding the product to product list
                                    productList.add(new cart_data_return(

                                            product.getString("id"),
                                            product.getString("ret_id"),
                                            product.getString("sup_id"),
                                            product.getString("item_id"),
                                            product.getInt("ammount"),
                                            product.getInt("qnty"),
                                            product.getString("pro_img_url"),
                                            product.getString("pro_name")

                                    ));
                                }

                                //creating adapter object and setting it to recyclerview
                                cart_data_adapter adapter = new cart_data_adapter(cart_data.this, productList, ptopic);
                                recyclerView.setAdapter(adapter);

                                progressDialog.dismiss();

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }

                        },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    });

            //adding our stringrequest to queue
            Volley.newRequestQueue(this).add(stringRequest);

        }

    public void  cancel_ord(View view){

        String sup_id = pcg.readEmail();
        String ret_id = pcg.read_ret_id();
        String ord_id  = ((TextView) view).getText().toString();


        Toast.makeText(cart_data.this, sup_id+ret_id+ord_id, Toast.LENGTH_SHORT).show();

        Call<cart_add> call  = cart_data.apiInterface.performCancel_Cart(sup_id, ret_id, ord_id);

        call.enqueue(new Callback<cart_add>() {
            @Override
            public void onResponse(Call<cart_add> call, retrofit2.Response<cart_add> response) {
                if(response.body().getResponse().equals("ok")){
                    pcg.displyToast("CANCELD");
                    Intent i = new Intent(cart_data.this, cart_data.class);
                    startActivity(i);

                }

                else{
                    pcg.displyToast("SOMETHING WENT WRONG");
                }

            }

            @Override
            public void onFailure(Call<cart_add> call, Throwable t) {
                pcg.displyToast("FAILED WHILE CANCELLING");
            }
        });


    }

    public void addToCart(View view) {


        Toast.makeText(cart_data.this,"HI BVC AKSHAY",Toast.LENGTH_SHORT).show();

        String sup_id = pcg.readEmail();
        String ret_id = pcg.read_ret_id();

        int state = 1;


        Call<cart_add> call  = cart_data.apiInterface.performCart_update(sup_id, ret_id, state);

        call.enqueue(new Callback<cart_add>() {
            @Override
            public void onResponse(Call<cart_add> call, retrofit2.Response<cart_add> response) {
                if(response.body().getResponse().equals("ok")){
                    pcg.displyToast("SUCCESSFULLY CONFIRMED");
                    Intent i = new Intent(cart_data.this, cart_data.class);
                    startActivity(i);

                }
                else{
                    pcg.displyToast("SOMETHING WENT WRONG");
                }
            }

            @Override
            public void onFailure(Call<cart_add> call, Throwable t) {
                pcg.displyToast("FAILED");
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.cart_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if(id == R.id.change_retailer){

            Intent i = new Intent(this,retailer_list.class);
            startActivity(i);

            return  true;
        }

        if(id == R.id.home){

            Intent i = new Intent(this,Home_page.class);
            startActivity(i);

            return  true;
        }
        if(id == R.id.goto_cart){

            Intent i = new Intent(this,Notes_List.class);
            i.putExtra("PASS1","ALL");
            i.putExtra("PASS2","ALL");
            startActivity(i);

            return  true;
        }

        return super.onOptionsItemSelected(item);
    }


}