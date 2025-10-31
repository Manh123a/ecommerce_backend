package com.Dzung.ecommerce_backend;


public class OrderItem {
    private int productId;
    private String productName;
    private double price;
    private int quantity;
    public OrderItem(){}

    public OrderItem(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public int getId(){
        return productId;
    }
    public void setId(int id){
        this.productId = id;

    }
    public String getName(){
        return productName;
    }
    public void setName(String name){
        this.productName = name;

    }
    public double getPrice(){
        return price;
    }
    public void setPrioe(double price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
