package com.Dzung.ecommerce_backend;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public class ProductRepository {
    private List<Product> products = new ArrayList<>();
    public ProductRepository(){
        products.add(new Product(1, "iPhone 15", "Latest Apple phone", 1200.0, 10, "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/iphone-15-model-select-202309-6-7inch_AV1?wid=5120&hei=2880&fmt=jpeg&qlt=90&.v=1692999087350"));
        products.add(new Product(2, "MacBook Pro", "Apple laptop with M3 chip", 2000.0, 5, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/mbp16-silver-select-202310?wid=5120&hei=2880&fmt=jpeg&qlt=90&.v=1697311054297"));
        products.add(new Product(3, "iPad Air", "10.9-inch Liquid Retina display", 800.0, 15, "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/ipad-air-select-wifi-blue-202203?wid=470&hei=556&fmt=png-alpha&.v=1645066749394"));
        products.add(new Product(4, "Apple Watch Series 9", "Smartwatch with fitness tracking", 450.0, 20, "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/MR9X3ref_VW_34FR+watch-case-45-alum-starlight-nc-9s_VW_34FR_WF_CO+watch-face-45-alum-starlight-nc-9s_VW_34FR_WF_CO_GEO_SG?wid=940&hei=1112&fmt=p-jpg&qlt=95&.v=1693014660373"));
        products.add(new Product(5, "AirPods Pro 2", "Noise cancelling earbuds", 250.0, 30, "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/airpods-pro-2nd-gen-hero-202209?wid=940&hei=1112&fmt=jpeg&qlt=90&.v=1660803972361"));

        products.add(new Product(6, "Samsung Galaxy S24", "Flagship Android phone", 999.0, 12, "https://images.samsung.com/is/image/samsung/p6pim/levant/galaxy-s24/gallery/levant-galaxy-s24-s928-479491-sm-s928bzagegy-539832270?$650_519_PNG$"));
        products.add(new Product(7, "Samsung Galaxy Tab S9", "11-inch AMOLED tablet", 850.0, 9, "https://images.samsung.com/is/image/samsung/p6pim/levant/galaxy-tab-s9/gallery/levant-galaxy-tab-s9-11-inch-sm-x710-sm-x710nzaameb-538050071?$650_519_PNG$"));
        products.add(new Product(8, "Samsung QLED TV", "4K Smart TV 55-inch", 1100.0, 4, "https://images.samsung.com/is/image/samsung/p6pim/levant/qled-q60c/gallery/levant-qled-q60c-qn55q60cauxzn-535315239?$650_519_PNG$"));
        products.add(new Product(9, "Samsung Galaxy Watch 6", "Smart fitness watch", 399.0, 18, "https://images.samsung.com/is/image/samsung/p6pim/levant/galaxy-watch6/lev-galaxy-watch6-44mm-sm-r940nzsagea-frontgreen-thumb-538961307?$650_519_PNG$"));
        products.add(new Product(10, "Samsung SSD 1TB", "Fast NVMe solid state drive", 130.0, 40, "https://images.samsung.com/is/image/samsung/p6pim/levant/ssd-970-evo-plus/gallery/levant-ssd-970-evo-plus-mz-v7s1t0bw-frontblack-thumb-534036315?$650_519_PNG$"));

        products.add(new Product(11, "Dell XPS 15", "Premium ultrabook with OLED", 1800.0, 7, "https://i.dell.com/sites/imagecontent/products/publishingimages/xps-15-9530-laptop/laptop-xps-15-9530-bk-gallery-1.jpg"));
        products.add(new Product(12, "Lenovo ThinkPad X1", "Business laptop", 1600.0, 8, "https://p1-ofp.static.pub/medias/bWFzdGVyfHJvb3R8MzE1MTR8aW1hZ2UvanBlZ3xoYjYvaDdkLzE0NzkzNjY2NTY5Njg2LmpwZ3xkMTdiYmVhZjMwMTkxN2NhYmQzMjA2ZGVjOGNhOTQ0YzVjNjhjZWEyZjhkOTdiMzRlNTA0ZTk1ZTg4N2RmYWUx"));
        products.add(new Product(13, "Asus ROG Zephyrus G14", "Gaming laptop", 1700.0, 6, "https://dlcdnwebimgs.asus.com/gain/3E8A0B40-DA2C-4D26-A7E8-93D5B4D382C1"));
        products.add(new Product(14, "HP Envy 13", "Lightweight laptop", 1200.0, 10, "https://ssl-product-images.www8-hp.com/digmedialib/prodimg/lowres/c08276842.png"));
        products.add(new Product(15, "Acer Nitro 5", "Affordable gaming laptop", 1000.0, 9, "https://static.acer.com/up/Resource/Acer/Laptops/Nitro_5/Images/20210810/Nitro-5_AN515-45_gallery_01.png"));

        products.add(new Product(16, "Nike Air Max", "Comfortable running shoes", 150.0, 25, "https://static.nike.com/a/images/t_PDP_1280_v1/f_auto,q_auto:eco/3e49a7a1-7a5f-4bb2-8619-6f7d7203b08f/air-max-90-shoes-6n3vKB.png"));
        products.add(new Product(17, "Adidas Ultraboost", "High-performance sneakers", 180.0, 22, "https://assets.adidas.com/images/w_600,f_auto,q_auto/39a034b3b18842e9a7b7ad3c01045f33_9366/Ultraboost_1.0_Shoes_Black_HQ6352_01_standard.jpg"));
        products.add(new Product(18, "Puma Hoodie", "Casual sportswear", 80.0, 35, "https://images.puma.com/image/upload/f_auto,q_auto,b_rgb:fafafa/global/586668/01/fv/fnd/EEA/w/1000/h/1000/fmt/png"));
        products.add(new Product(19, "Levi’s 501 Jeans", "Classic denim jeans", 90.0, 40, "https://lsco.scene7.com/is/image/lsco/005010114-front-pdp"));
        products.add(new Product(20, "Uniqlo T-Shirt", "Basic cotton T-shirt", 20.0, 100, "https://image.uniqlo.com/UQ/ST3/AsianCommon/imagesgoods/457476/item/goods_00_457476.jpg"));

        products.add(new Product(21, "Sony WH-1000XM5", "Noise cancelling headphones", 400.0, 15, "https://m.media-amazon.com/images/I/61+tZJmBEfL._AC_UF894,1000_QL80_.jpg"));
        products.add(new Product(22, "Canon EOS R10", "Mirrorless camera", 1400.0, 8, "https://m.media-amazon.com/images/I/91KmxLvdGPL._AC_SL1500_.jpg"));
        products.add(new Product(23, "Logitech MX Master 3S", "Wireless mouse", 100.0, 50, "https://m.media-amazon.com/images/I/61ni3t1ryQL._AC_SL1500_.jpg"));
        products.add(new Product(24, "Razer BlackWidow V4", "Mechanical gaming keyboard", 180.0, 20, "https://assets.razerzone.com/eeimages/products/32358/razer-blackwidow-v4-hero.jpg"));
        products.add(new Product(25, "Corsair 750W PSU", "Power supply unit", 120.0, 30, "https://www.corsair.com/corsairmedia/sys_master/productcontent/RM750_01.png"));

        products.add(new Product(26, "The Great Gatsby", "Classic novel by F. Scott Fitzgerald", 15.0, 60, "https://m.media-amazon.com/images/I/81af+MCATTL._AC_UF894,1000_QL80_.jpg"));
        products.add(new Product(27, "Atomic Habits", "Self-improvement book by James Clear", 18.0, 55, "https://m.media-amazon.com/images/I/91bYsX41DVL._AC_UF894,1000_QL80_.jpg"));
        products.add(new Product(28, "Clean Code", "Programming book by Robert C. Martin", 40.0, 25, "https://m.media-amazon.com/images/I/41SH-SvWPxL._AC_UF894,1000_QL80_.jpg"));
        products.add(new Product(29, "Rich Dad Poor Dad", "Financial education book", 12.0, 70, "https://m.media-amazon.com/images/I/81bsw6fnUiL._AC_UF894,1000_QL80_.jpg"));
        products.add(new Product(30, "1984", "Dystopian novel by George Orwell", 14.0, 80, "https://m.media-amazon.com/images/I/71kxa1-0mfL._AC_UF894,1000_QL80_.jpg"));
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