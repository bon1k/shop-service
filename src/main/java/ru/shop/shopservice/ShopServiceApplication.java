package ru.shop.shopservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.shop.shopservice.dto.Product;
import ru.shop.shopservice.service.ProductService;

import java.util.List;

@SpringBootApplication
public class ShopServiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ShopServiceApplication.class, args);

        ProductService productService = run.getBean(ProductService.class);


        Product product = new Product();
        product.setId(2L);
        product.setName("Book about Java");

        Product product1 = new Product();
        product.setId(1L);
        product.setName("T-Shirt");

        productService.save(product);

        List<Product> products = productService.findByName("T-Shirt");

        System.out.println(products);

    }

}
