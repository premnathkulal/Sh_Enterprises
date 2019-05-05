package com.example.sh_enterprises;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;


public class Detailes extends AppCompatActivity {



    //this is the JSON Data URL
    //make sure you are using the correct ip else it will not work
    public  static  String URL_PRODUCTS, pass1,pass2 ;
    public static String ptopic,psubcode;
    private static ProgressDialog progressDialog;
    public static String amount ;
    //a list to store all the products
    List<pro_data> productList;

    public static  prefConfig pcg;
    public static ApiInterface apiInterface;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailes);
        Intent i = getIntent();

        pass1 = i.getStringExtra("pro_id");

        //Toast.makeText(this,"HI THIS IS "+pass,Toast.LENGTH_SHORT).show();

        //URL_PRODUCTS = "https://premnathindia.000webhostapp.com/Api.php?p1="+pass;
        URL_PRODUCTS = "https://premnathindia.000webhostapp.com/prem/Api.php?p1="+pass1+"&p2=det";


        Toast.makeText(this, URL_PRODUCTS, Toast.LENGTH_SHORT).show();

        productList = new ArrayList<>();


        pcg = new prefConfig(this);
        apiInterface = apiclient.getApiclient().create(ApiInterface.class);
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
                            for (int i = 0; i < 1; i++) {

                                //getting product object from json array
                                JSONObject product = array.getJSONObject(i);


                                product.getString("pro_id");

                                String st;

                                TextView a = findViewById(R.id.pro_name);
                                TextView b = findViewById(R.id.weight);
                                TextView c = findViewById(R.id.base_amount);
                                TextView d = findViewById(R.id.mass_amonut);
                                TextView e = findViewById(R.id.brand);
                                TextView f = findViewById(R.id.catogery);
                                ImageView iv = findViewById(R.id.imageView2);



                                String st1 = product.getString("pro_name");
                                String text = "<font color=#0f0104>NAME : </font><font color=#ff4c33>"+st1+"</font>";
                                a.setText(Html.fromHtml(text));


                                st = product.getString("weight");
                                text = "<font color=#0f0104>WEIGHT  : </font><font color=#ff4c33>"+st+" grams </font>";
                                b.setText(Html.fromHtml(text));


                                st = product.getString("base_amount");
                                text = "<font color=#0f0104>BASE AMMOUNT : Rs </font><font color=#ff4c33>"+st+" per "+product.getString("pro_unit")+"</font>";
                                d.setText(Html.fromHtml(text));

                               //st = ;


                                st = product.getString("total_amount");
                                amount = st;
                                text = "<font color=#0f0104>MASS AMOUNT : Rs </font><font color=#ff4c33>"+st+"  per piece </font>";
                                c.setText(Html.fromHtml(text));

                                //st = product.getString("disc");

                                st = product.getString("brands");

                                text = "<font color=#0f0104>BRAND :</font><font color=#ff4c33>"+st+"</font>";
                                e.setText(Html.fromHtml(text));

                                st = product.getString("categories");
                                text = "<font color=#0f0104>CATEGORIES :</font><font color=#ff4c33>"+st+"</font>";
                                f.setText(Html.fromHtml(text));

                                Picasso.get().load(product.getString("pro_img_url")).into(iv);

                            }



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


    public void go_back(View view) {
        super.onBackPressed();
    }

    public void addToCart(View view) {

        String sup_id = pcg.readEmail();
        String ret_id = pcg.read_ret_id();
        String item_id = pass1;

        EditText ed = findViewById(R.id.meChoice);
        int quantity = Integer.parseInt(ed.getText().toString());
        int finamt = quantity * Integer.parseInt(amount);


        Call<cart_add> call  = Detailes.apiInterface.performCart(sup_id,ret_id,item_id,finamt,quantity);

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
}



