package ru.shop.shopservice.repository;


import org.springframework.stereotype.Repository;
import ru.shop.shopservice.dto.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository extends CrudRepository<Product> {


    public List<Product> findByName(String productName) {
        List<Product> productResult = new ArrayList<>();

        for (Product p : database) {
            if (p.getName().equals(productName)) {
                productResult.add(p);
            }
        }

        return productResult;
    }
}
