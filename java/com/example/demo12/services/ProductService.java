package com.example.demo12.services;


import com.example.demo12.model.Product;
import com.example.demo12.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    public ProductRepository repository;

    public String insertProduct(Product product){
        repository.save(product);
        return "product saved";
    }

    public  String insertAllProduct (List<Product> products){
        repository.saveAll(products);
        return "products saved";
    }
    public  List<Product> getAllProduct(){
        return repository.findAll();
    }
    public String deleteProduct(Long id){
        repository.deleteById(id);
        return  "product deleted";
    }
}
