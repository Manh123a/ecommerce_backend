package com.Dzung.ecommerce_backend;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.*;
@RestController // Enable http requests
@RequestMapping("/api/orders")
public class OrderController {
    private List<Order> orders = new ArrayList<>();
    public OrderController() {
        // Sample data
        orders.add(new Order(
                1,
                101,
                Arrays.asList(
                        new OrderItem(1, "iPhone 15", 1200.0, 1),
                        new OrderItem(2, "MacBook Pro", 2000.0, 1)
                ),
                3200.0,
                "delivered",
                LocalDateTime.now().minusDays(3)
        ));

        orders.add(new Order(
                2,
                102,
                Arrays.asList(
                        new OrderItem(6, "Samsung Galaxy S24", 999.0, 2)
                ),
                1998.0,
                "shipped",
                LocalDateTime.now().minusDays(1)
        ));
    }
    @GetMapping
    public List<Order> getAllOrders(){
        return orders;
    }
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id){
        return orders.stream().filter(o -> o.getId() == id).findFirst().orElse(null);
    }
    // Using POST to create new order
    @PostMapping
    public Order createOrder(@RequestBody Order newOrder) {
        newOrder.setId(orders.size() + 1);
        newOrder.setCreatedAt(LocalDateTime.now());
        orders.add(newOrder);
        return newOrder;
    }
}
