package com.Dzung.ecommerce_backend;

public enum OrderStatus {
    PENDING,      // Đơn hàng đang chờ xử lý
    PROCESSING,   // Đơn hàng đang được xử lý/chuẩn bị
    DELIVERED,    // Đơn hàng đã giao thành công
    CANCELLED     // Đơn hàng đã bị hủy (thêm tùy chọn)
}