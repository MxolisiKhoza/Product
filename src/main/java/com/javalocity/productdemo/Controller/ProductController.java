package com.javalocity.productdemo.Controller;

import com.javalocity.productdemo.Model.Product;
import com.javalocity.productdemo.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {
    ProductService productService = new ProductService();

    @GetMapping("/productList")
    public List<Product> productList() {
        return productService.findAll();
    }

    @PostMapping(value="/findproduct/{prodId}")
    public Product getbyID(@PathVariable String prodId) {
        Product product = productService.getProduct(prodId);
        return product;
    }
    //post--sending info
    @PostMapping("/addnew")
    public List<Product> add(@RequestBody Product product){
        productService.add(product);
        return productService.findAll();
    }
}
