package com.example.sh_enterprises;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class SubListAdapter extends RecyclerView.Adapter<SubListAdapter.ProductViewHolder> {
    private Context mCtx;
    private List<sub_data> productList;
    public Button textv;

    public SubListAdapter(Context mCtx, List<sub_data> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.sub_list, null);

        //textv = view.findViewById(R.id.textViewRating);

        return new ProductViewHolder(view);

    }


    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        sub_data product = productList.get(position);

        holder.ret_id.setText(product.getRet_id());
        holder.ret_name.setText(product.getRet_name());

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView ret_id,ret_name;

        public ProductViewHolder(View itemView) {
            super(itemView);

            ret_id = itemView.findViewById(R.id.ret_id);
            ret_name = itemView.findViewById(R.id.ret_name);

        }
    }


}
