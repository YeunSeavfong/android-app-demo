package com.example.demoapplication.provider;

import com.example.demoapplication.R;
import com.example.demoapplication.model.CategoryModel;

import java.util.ArrayList;

public class CategoryProvider {
    private final ArrayList<CategoryModel> categories = new ArrayList<>();

    public ArrayList<CategoryModel> getProducts(){
        categories.add(new CategoryModel("Shoes", R.drawable.shoes, 100, "Online Shop"));
        categories.add(new CategoryModel("Jean", R.drawable.jean, 100,"Dona Shop"));
        categories.add(new CategoryModel("Red Shirt", R.drawable.shirt_red, 100,"F2 Shop"));
        categories.add(new CategoryModel("Sport Shoes",R.drawable.sport_shoes , 100,"Online Shop"));
        categories.add(new CategoryModel("T-Shirt",R.drawable.t_shirt , 100, "Dona Shop"));
        categories.add(new CategoryModel("Shoes", R.drawable.shoes, 100, "Online Shop"));
        categories.add(new CategoryModel("Jean", R.drawable.jean, 100,"Dona Shop"));
        categories.add(new CategoryModel("Red Shirt", R.drawable.shirt_red, 100,"F2 Shop"));
        categories.add(new CategoryModel("Sport Shoes",R.drawable.sport_shoes , 100,"Online Shop"));
        categories.add(new CategoryModel("T-Shirt",R.drawable.t_shirt , 100, "Dona Shop"));
        return categories;
    }
 }
