package com.example.demoapplication.model;

public class ProductModel {
    private String name ;
    private double price;
    private String shopName;
    private int imgId;

    public ProductModel(String name, double price, String shopName, int imgId) {
        this.name = name;
        this.price = price;
        this.shopName = shopName;
        this.imgId = imgId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getShopName() {
        return shopName;
    }

    public int getImgId() {
        return imgId;
    }
}
