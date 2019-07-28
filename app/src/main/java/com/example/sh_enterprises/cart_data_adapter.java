package com.example.sh_enterprises;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class cart_data_adapter extends RecyclerView.Adapter<cart_data_adapter.ProductViewHolder> {
    private Context mCtx;
    private List<cart_data_return> productList;
    public TextView textv;
    public String topic;


    public cart_data_adapter(Context mCtx, List<cart_data_return> productList , String str) {
        this.mCtx = mCtx;
        this.productList = productList;
        this.topic = str;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.cart_data_list, null);


        return new ProductViewHolder(view);

    }


    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        cart_data_return product = productList.get(position);

        holder.pro_name.setText(product.getPro_name());
        holder.weight.setText("QUANTITY : "+product.getQnty());
        holder.ammount.setText(product.getAmmount()+"Rs");
        holder.pro_id.setText(product.getId());


        //String imageUrl = "https://premnathindia.000webhostapp.com/pro_images/tamanna.jpeg";

        //Picasso.get().load(product.getPro_img_url()).into(holder.iv);

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView pro_name, weight,  ammount,pro_id;
        ImageView iv;

        public ProductViewHolder(View itemView) {
            super(itemView);

            pro_name = itemView.findViewById(R.id.pro_name);
            weight = itemView.findViewById(R.id.pro_weight);
            ammount = itemView.findViewById(R.id.pro_amt);
            pro_id = itemView.findViewById(R.id.pro_id);

            iv = itemView.findViewById(R.id.imageView);


        }
    }
}
