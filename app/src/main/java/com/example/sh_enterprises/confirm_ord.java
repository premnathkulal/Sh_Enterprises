package com.example.sh_enterprises;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class confirm_ord extends RecyclerView.Adapter<confirm_ord.ProductViewHolder> {
    private Context mCtx;
    private List<cart_data> productList;
    public String topic;

    public confirm_ord(Context mCtx, List<cart_data> productList ,String str) {
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

        cart_data product = productList.get(position);
        holder.pro_name.setText(product.getItem_id());
        holder.pro_id.setText(product.getSup_id());
        holder.weight.setText(product.getRet_id());
        holder.ammount.setText(product.getSum_amt());


        //String imageUrl = "https://premnathindia.000webhostapp.com/pro_images/tamanna.jpeg";

        Picasso.get().load(product.getIte_url()).into(holder.iv);

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
