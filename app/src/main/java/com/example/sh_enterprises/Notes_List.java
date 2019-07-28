package com.example.sh_enterprises;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
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

public class Notes_List extends AppCompatActivity {



    //this is the JSON Data URL
    //make sure you are using the correct ip else it will not work
    public static  prefConfig pcg;
    public  static  String URL_PRODUCTS, URL_PRODUCT, pass1,pass2 ;
    public static String ptopic,psubcode;
    private static ProgressDialog progressDialog;
    public static String amount ;
    public static ApiInterface apiInterface;
    public EditText editText;
    //a list to store all the products
    List<pro_data> productList;

    //the recyclerview
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes__list);
        Intent i = getIntent();
        pcg = new prefConfig(this);

        apiInterface = apiclient.getApiclient().create(ApiInterface.class);

        pass1 = i.getStringExtra("PASS1");
        pass2 = i.getStringExtra("PASS2");

        //Toast.makeText(this,"HI THIS IS "+pass,Toast.LENGTH_SHORT).show();

        //URL_PRODUCTS = "https://premnathindia.000webhostapp.com/Api.php?p1="+pass;
        URL_PRODUCTS = "https://premnathindia.000webhostapp.com/prem/Api.php?p1="+pass1+"&p2="+pass2;

        URL_PRODUCT = "https://premnathindia.000webhostapp.com/prem/Api.php?p1="+pass1+"&p2="+pass2;


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

                                //traversing through all the object
                                for (int i = 0; i < array.length(); i++) {

                                    //getting product object from json array
                                    JSONObject product = array.getJSONObject(i);

                                    //adding the product to product list
                                    productList.add(new pro_data(

                                            product.getString("pro_id"),
                                            product.getString("pro_name"),
                                            product.getString("weight"),
                                            product.getString("total_amount"),
                                            product.getString("pro_img_url")

                                    ));
                                }

                                //creating adapter object and setting it to recyclerview
                                DatatAdapter adapter = new DatatAdapter(Notes_List.this, productList, ptopic);
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



    public void downme_ooi(View view) {
        String pro_id = ((TextView) view).getText().toString();
        /*Intent i = new Intent(this,Detailes.class);
        i.putExtra("pro_id",pro_id);
        startActivity(i);
        EditText ed = findViewById(R.id.meChoice);
        final  String height = ed.getText().toString();
        final int q = Integer.parseInt(height);
        int q = 100; Integer.parseInt(ed.getText().toString());*/

        String sup_id = pcg.readEmail();
        Log.d("SUP_ID ", sup_id);

        String ret_id = pcg.read_ret_id();
        Log.d("RET_ID ", ret_id);

        String item_id = pro_id;
        Log.d("PRO_ID",pro_id);

        //Toast.makeText(this, sup_id+" "+ret_id+" "+item_id, Toast.LENGTH_SHORT).show();


        EditText ed = findViewById(R.id.meChoice);
        int q = Integer.parseInt(ed.getText().toString().trim());

        //EditText et=(EditText)findViewById(R.id.meChoice);
        //String t=et.getText().toString();

        //Log.d("QUANTITY ",t+":Hello");

        int quantity = q;
        int finamt = quantity * 100;

        //Call<cart_add> call  = Detailes.apiInterface.performCart(sup_id,ret_id,item_id,finamt,quantity);

        Call<cart_add> call  = Notes_List.apiInterface.performCart(sup_id,ret_id,item_id,finamt,quantity);

        call.enqueue(new Callback<cart_add>() {
            @Override
            public void onResponse(Call<cart_add> call, retrofit2.Response<cart_add> response) {
                if(response.body().getResponse().equals("ok")){
                    pcg.displyToast("SUCCESSFULLY ADDED TO CART");
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
        getMenuInflater().inflate(R.menu.sort_by, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.sort_by_brand) {

            Intent i = new Intent(this,categories.class);
            startActivity(i);

            return true;
        }
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

            Intent i = new Intent(this,cart_data.class);
            startActivity(i);

            return  true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void callMe(View view) {

        String ret_id = ((TextView) view).getText().toString();
        pcg.ret_id(ret_id);

        Intent i = new Intent(this,Notes_List.class);
        i.putExtra("PASS1","ALL");
        i.putExtra("PASS2","ALL");
        startActivity(i);

    }

}