package com.javalocity.productdemo.Service;

import com.javalocity.productdemo.DAO.ProductData;
import com.javalocity.productdemo.Model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    ProductData productData = new ProductData();
    public List<Product> findAll(){ return productData.findAll();
    }
    public boolean add(Product product){
        return productData.add(product);
    }
    public Product getProduct(String prodId){
        return productData.findById(prodId);
    }
}
