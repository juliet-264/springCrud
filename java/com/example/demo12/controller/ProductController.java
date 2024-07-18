package com.example.demo12.controller;

import com.example.demo12.model.Product;
import com.example.demo12.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Product")
public class ProductController {
    @Autowired

    public ProductService service;
    @GetMapping
    public List<Product>getAll(){
        return service.getAllProduct();
    }
    @PostMapping
    public String createAll(@RequestBody List<Product> products){
      return service.insertAllProduct(products);
    }

    @PutMapping
    public String updateProduct(@RequestBody Product product){
        return service.insertProduct(product);
    }
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id){
        return service.deleteProduct(id);
    }

}
