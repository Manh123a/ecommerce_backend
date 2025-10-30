package com.Dzung.ecommerce_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin(origins = "http://localhost:3000/")
@RestController // handle HTTP request (like Get, Post, etc)
@RequestMapping("/api/products") // tell this controller where to start with (/api/products)
public class ProductController {
    @Autowired // able to create and inject an instance of ProductRepository
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll(); // get all products from database
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        return productRepository.findById(id).orElse(null);
    }
    @PostMapping // Post Request
    public void createProduct(@RequestBody Product product){ // convert json to Product object
        productRepository.save(product);
    }
}