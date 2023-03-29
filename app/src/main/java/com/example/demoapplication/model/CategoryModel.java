package com.example.demoapplication.model;

import androidx.annotation.Nullable;

import java.io.Serializable;

public class CategoryModel implements Serializable {
    private String name ;
    private int imgId;
    private double price ;

    public String getShopName() {
        return shopName;
    }

    public CategoryModel(String name, int imgId, double price, @Nullable String shopName) {
        this.name = name;
        this.imgId = imgId;
        this.price = price;
        this.shopName = shopName;
    }

    private String shopName;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public CategoryModel(String name, int imgId, double price) {
        this.name = name;
        this.imgId = imgId;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
