package com.Dzung.ecommerce_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/products")
public class ProductController {

    // Tiêm ProductService thay vì ProductRepository
    private final ProductService productService;

    // Sử dụng Constructor Injection - đây là best practice
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * API để lấy tất cả sản phẩm còn hoạt động (available).
     */
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.findAllAvailableProducts();
        return ResponseEntity.ok(products); // Trả về 200 OK và danh sách sản phẩm
    }

    /**
     * API để lấy thông tin chi tiết một sản phẩm theo ID.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> productOptional = productService.findProductById(id);

        // Dùng biểu thức lambda để xử lý:
        // Nếu tìm thấy product, trả về 200 OK và product đó.
        // Nếu không, trả về 404 Not Found.
        return productOptional
                .map(product -> ResponseEntity.ok(product))
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * API để tạo một sản phẩm mới.
     */
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product savedProduct = productService.saveProduct(product);
        // Trả về 201 Created và thông tin sản phẩm vừa tạo
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    /**
     * API để cập nhật thông tin một sản phẩm.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        try {
            Product updatedProduct = productService.updateProduct(id, productDetails);
            return ResponseEntity.ok(updatedProduct);
        } catch (RuntimeException e) {
            // Nếu không tìm thấy sản phẩm để cập nhật, trả về 404 Not Found
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * API để "xóa mềm" một sản phẩm.
     * Sản phẩm sẽ không bị xóa khỏi CSDL mà chỉ bị đánh dấu là không còn available.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        try {
            productService.softDeleteProduct(id);
            // Trả về 204 No Content - là mã thành công cho request DELETE
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            // Nếu không tìm thấy sản phẩm để xóa
            return ResponseEntity.notFound().build();
        }
    }
}