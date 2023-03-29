package com.example.demoapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoapplication.R;
import com.example.demoapplication.model.CategoryModel;
import com.example.demoapplication.model.ProductModel;

import java.util.ArrayList;

public class DiscountAdapter extends RecyclerView.Adapter<DiscountAdapter.ViewHolder>{
    private ArrayList<ProductModel>  products = new ArrayList<>();

    // Constructor
    public DiscountAdapter(ArrayList<ProductModel> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_discount, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ProductModel product = products.get(position);
        holder.image.setImageResource(product.getImgId());
        holder.name.setText(product.getName());
        holder.shopName.setText(product.getShopName());
        holder.price.setText(product.getPrice()+"$");

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView image;
        private final TextView name, price, shopName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageDis);
            name = itemView.findViewById(R.id.nameDiscount);
            price = itemView.findViewById(R.id.price);
            shopName = itemView.findViewById(R.id.shopName);
        }
    }
}
