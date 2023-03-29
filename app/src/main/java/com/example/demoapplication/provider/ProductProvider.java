package com.example.demoapplication.provider;

import com.example.demoapplication.R;
import com.example.demoapplication.model.ProductModel;
import java.util.ArrayList;

public class ProductProvider {
    private final ArrayList<ProductModel> productModels = new ArrayList<>();

    public ArrayList<ProductModel> getProductModels() {

        productModels.add(new ProductModel("Shoes",200 , "Online Shop",R.drawable.shoes_discount));
        productModels.add(new ProductModel("Jean", 200, "Dona Shop",R.drawable.shirt));
        return productModels;
    }
}
