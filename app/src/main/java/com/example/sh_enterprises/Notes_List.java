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

public class Notes_List extends AppCompatActivity {



    //this is the JSON Data URL
    //make sure you are using the correct ip else it will not work
    public  static  String URL_PRODUCTS, pass1,pass2 ;
    public static String ptopic,psubcode;
    private static ProgressDialog progressDialog;
    //a list to store all the products
    List<pro_data> productList;

    //the recyclerview
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes__list);
        Intent i = getIntent();

        pass1 = i.getStringExtra("PASS1");
        pass2 = i.getStringExtra("PASS2");

        //Toast.makeText(this,"HI THIS IS "+pass,Toast.LENGTH_SHORT).show();

        //URL_PRODUCTS = "https://premnathindia.000webhostapp.com/Api.php?p1="+pass;
        URL_PRODUCTS = "https://premnathindia.000webhostapp.com/prem/Api.php?p1="+pass1+"&p2="+pass2;


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

            /*
             * Creating a String Request
             * The request type is GET defined by first parameter
             * The URL is defined in the second parameter
             * Then we have a Response Listener and a Error Listener
             * In response listener we will get the JSON response as a String
             * */
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
        Intent i = new Intent(this,Detailes.class);
        i.putExtra("pro_id",pro_id);
        startActivity(i);
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


}