package com.example.demoapplication.model;

public class Product {
    private String name ;
    private String imgUrl;
    private double price ;

    public void setName(String name) {
        this.name = name;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, String imgUrl, double price) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public double getPrice() {
        return price;
    }
}
