package com.Dzung.ecommerce_backend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products") // Tất cả API trong file này sẽ bắt đầu bằng /api/products
public class ProductController {

    @Autowired // Tự động "tiêm" ProductRepository vào
    private ProductRepository productRepository;

    // API 1: Lấy tất cả sản phẩm (GET http://localhost:8080/api/products)
    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // API 2: Lấy 1 sản phẩm theo ID (GET http://localhost:8080/api/products/1)
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productRepository.findById(id).orElse(null); // Trả về null nếu không tìm thấy
    }

    // API 3: Thêm 1 sản phẩm mới (POST http://localhost:8080/api/products)
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
}