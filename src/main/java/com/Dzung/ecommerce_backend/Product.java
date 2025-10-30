package com.Dzung.ecommerce_backend;

//import jakarta.persistence.*;
//import lombok.Data;

//@Entity
//@Table(name = products)
public class Product {
//    @id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private double price;
    private int stock;
    private String imgUrl;

    public Product() {}
    public Product(int id, String name, String description, double price, int stock, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.imgUrl = imgUrl;
    }
    // Gettter and Setters (OOP escapsulation) can be easier with lombok
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public int getStock(){
       return stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    public String getImgUrl(){
        return imgUrl;
    }
    public void setImgUrl(String imgUrl){
        this.imgUrl = imgUrl;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stock +
                ", imageUrl='" + imgUrl + '\'' +
                '}';
    }
}