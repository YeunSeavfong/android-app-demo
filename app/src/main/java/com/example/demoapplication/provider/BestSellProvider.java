package com.example.demoapplication.provider;

import com.example.demoapplication.R;
import com.example.demoapplication.model.ProductModel;

import java.util.ArrayList;

public class BestSellProvider {
    private final ArrayList<ProductModel> productModels = new ArrayList<>();

    public ArrayList<ProductModel> getProductModels() {
        productModels.add(new ProductModel("Nick",200 , "Online Shop", R.drawable.bestsell_shoes1));
        productModels.add(new ProductModel("Nick",200 , "Online Shop", R.drawable.bestsell_shoes2));
        productModels.add(new ProductModel("Shirt", 100, "Dona Shop",R.drawable.bestsell_shirt1));
        productModels.add(new ProductModel("Shirt", 100, "Dona Shop",R.drawable.bestsell_shirt2));
        return productModels;
    }
}
