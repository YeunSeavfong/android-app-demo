package com.example.demoapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoapplication.R;
import com.example.demoapplication.model.ProductModel;
import com.example.demoapplication.provider.ProductProvider;

import java.util.ArrayList;

public class BestSellAdapter extends RecyclerView.Adapter<BestSellAdapter.ViewHolder> {

    ArrayList<ProductModel> productModels = new ArrayList<>();

    public BestSellAdapter(ArrayList<ProductModel> productModels) {
        this.productModels = productModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bestsell_card_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ProductModel productModel = productModels.get(position);

        holder.imageView.setImageResource(productModel.getImgId());
        holder.shopName.setText(productModel.getShopName());
        holder.productName.setText(productModel.getName());
        holder.price.setText(String.valueOf(productModel.getPrice() + "$"));
//        holder.mainLayout.setOnClickListener(v -> );

    }

    @Override
    public int getItemCount() {
        return productModels.size();
    }

    public static class ViewHolder  extends  RecyclerView.ViewHolder{

        TextView  shopName, price, productName;
        ImageView imageView;
        CardView mainLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageBestSell);
            shopName = itemView.findViewById(R.id.shopNameBestSell);
            price = itemView.findViewById(R.id.priceBestSell);
            productName = itemView.findViewById(R.id.productNameBestSell);
            mainLayout = itemView.findViewById(R.id.mainLayoutBestSell);
        }
    }
}
