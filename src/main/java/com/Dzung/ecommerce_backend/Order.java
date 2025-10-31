package com.Dzung.ecommerce_backend;
import java.time.LocalDateTime;
import java.util.*;

public class Order {
    private int id;
    private int userId; // customer Id
    private List<OrderItem> items;
    private double totalPrice;
    private String status; // pending, paid, shipped, delivered, canceled
    private LocalDateTime createdAt;
    public Order() {}
    public Order(int id, int userId, List<OrderItem> items, double totalPrice, String status, LocalDateTime createdAt){
        this.id = id;
        this.userId = userId;
        this.items = items;
        this.totalPrice = totalPrice;
        this.status = status;
        this.createdAt = createdAt;
    }
    // Getters and Setters
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int GetUserId(){
        return userId;
    }
    public void setUserId(int userId){
        this.userId = userId;
    }
    public List<OrderItem> getItems() {
        return items;
    }
    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
