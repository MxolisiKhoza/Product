package com.javalocity.productdemo.DAO;

import com.javalocity.productdemo.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductData {
    List<Product> prodlist;
    public ProductData(){
        prodlist = new ArrayList<Product>();
        prodlist.add(new Product("1", "Lemons", 15.99f));
        prodlist.add(new Product("2", "Apples", 23.99f));
        prodlist.add(new Product("3", "Tomatoes", 13.99f));
    }
    public List<Product> findAll() {
        return prodlist;
    }
    public boolean add(Product product){
        return prodlist.add(product);
    }
    public Product findById(String prodId) {
        Product product = null;
        for (Product prodItem : prodlist) {
            if (prodItem.getProdid().equalsIgnoreCase(prodId) ) {
                product = prodItem;
                break;
            }
        }
        return product;
    }

}
