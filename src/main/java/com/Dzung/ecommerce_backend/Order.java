package com.Dzung.ecommerce_backend;

import java.math.BigDecimal; // Sử dụng BigDecimal cho các giá trị tiền tệ để đảm bảo độ chính xác
import java.time.LocalDateTime; // Sử dụng LocalDateTime để lưu cả ngày và giờ
import java.util.List; // Import List để chứa các OrderItem

public class Order {

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private User user;

    private String shippingAddress;

    private LocalDateTime orderDate;

    private BigDecimal totalAmount;

    private OrderStatus status;

    private List<OrderItem> orderItems;


    // --- Constructors ---

    public Order() {
    }

    public Order(User user, String shippingAddress, LocalDateTime orderDate, BigDecimal totalAmount, OrderStatus status) {
        this.user = user;
        this.shippingAddress = shippingAddress;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }


    // --- Getters and Setters ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    // --- toString() method ---

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + (user != null ? user.getId() : "null") + // Tránh lỗi NullPointerException
                ", shippingAddress='" + shippingAddress + '\'' +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", status=" + status +
                '}';
    }
}