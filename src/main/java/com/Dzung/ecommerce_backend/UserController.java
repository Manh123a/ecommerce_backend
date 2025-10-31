package com.Dzung.ecommerce_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin(origins = "http://localhost:3000/")
@RestController // handle HTTP request (like Get, Post, etc)
@RequestMapping("/api/users") // tell this controller where to start with (/api/products)
public class UserController {
    @Autowired // able to create and inject an instance of ProductRepository
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllProducts() {
        return userRepository.findAll(); // get all products from database
    }
    @GetMapping("/{id}")
    public User getProductById(@PathVariable int id){
        return userRepository.findById(id).orElse(null);
    }
    @PostMapping // Post Request
    public void createProduct(@RequestBody User user){ // convert json to Product object
        userRepository.save(user);
    }
}