package com.javalocity.productdemo.Model;

public class Product {
    private String prodid;
    private String name;
    private float price;

    public Product(String prodid, String name, float price) {
        this.prodid = prodid;
        this.name = name;
        this.price = price;
    }
    public Product(){

    }

    public String getProdid() {
        return prodid;
    }

    public void setProdid(String prodid) {
        this.prodid = prodid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodid=" + prodid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
