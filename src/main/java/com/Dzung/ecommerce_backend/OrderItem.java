package com.Dzung.ecommerce_backend;


public class OrderItem {

    private Product product;

    private int quantity;

    private double price;

    public OrderItem() {
    }

    /**
     * Constructor để tạo một mục chi tiết đơn hàng mới.
     * @param product  Sản phẩm được mua.
     * @param quantity Số lượng mua.
     */
    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        // Tự động lấy giá hiện tại của sản phẩm và gán vào 'price'
        // Đây là logic nghiệp vụ quan trọng
        if (product != null) {
            this.price = product.getPrice();
        }
    }


    // --- Getters and Setters ---

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    // --- Phương thức nghiệp vụ (Business Method) ---

    /**
     * Tính toán và trả về tổng số tiền cho mục hàng này (Thành tiền).
     * Công thức: số lượng * giá tại thời điểm mua.
     * @return Tổng số tiền dưới dạng BigDecimal, hoặc BigDecimal.ZERO nếu có lỗi.
     */
    public double getSubtotal() {
        if (price == 0 || quantity < 0) {
            return 0;
        }
        return price*quantity;
    }


    @Override
    public String toString() {
        return "OrderItem{" +
                "productName=" + (product != null ? product.getName() : "null") +
                ", quantity=" + quantity +
                ", price=" + price +
                ", subtotal=" + getSubtotal() +
                '}';
    }
}