package com.Dzung.ecommerce_backend;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class ProductRepository {
    private List<Product> products = new ArrayList<>();
    public ProductRepository(){
        products.add(new Product(1, "iPhone 15", "Latest Apple phone", 1200.0, 10, "iphone.jpg"));
        products.add(new Product(2, "MacBook Pro", "Powerful laptop", 2000.0, 5, "macbook.jpg"));
    }
    public List<Product> findAll() {
        return products;
    }
    public Optional<Product> findById(int id){
        return products.stream().filter(p -> p.getId() == id).findFirst();
    }
    public void save(Product product){
        products.add(product);
    }
    public void deleteById(int id){
        products.removeIf(p  -> p.getId() == id);
    }
}