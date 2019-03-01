package com.example.sh_enterprises;


import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class DatatAdapter extends RecyclerView.Adapter<DatatAdapter.ProductViewHolder> {
    private Context mCtx;
    private List<pro_data> productList;
    public TextView textv;
    public String topic;

    public DatatAdapter(Context mCtx, List<pro_data> productList ,String str) {
        this.mCtx = mCtx;
        this.productList = productList;
        this.topic = str;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.data_list, null);


        return new ProductViewHolder(view);

    }


    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        pro_data product = productList.get(position);


        holder.pro_name.setText(product.getPro_name());
        holder.weight.setText("WEIGHT : "+product.getWeight());
        holder.ammount.setText(product.getTotal_amount()+"Rs");


        //String imageUrl = "https://premnathindia.000webhostapp.com/pro_images/tamanna.jpeg";

        Picasso.get().load(product.getPro_url()).into(holder.iv);

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView pro_name, weight,  ammount;
        ImageView iv;

        public ProductViewHolder(View itemView) {
            super(itemView);

            pro_name = itemView.findViewById(R.id.pro_name);
            weight = itemView.findViewById(R.id.pro_weight);
            ammount = itemView.findViewById(R.id.pro_amt);

             iv = itemView.findViewById(R.id.imageView);




        }
    }


}
