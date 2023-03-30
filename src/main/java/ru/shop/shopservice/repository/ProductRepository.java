package ru.shop.shopservice.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.shop.shopservice.dto.Product;
import ru.shop.shopservice.mapper.ProductMapper;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository extends CrudRepository<Product> {
    @Autowired
    private ProductMapper productMapper;

    public ProductRepository() {
        super(Product.class);
    }

    public List<Product> findByName(String productName) {
        List<Product> productResult = new ArrayList<>();

        for (Product p : database) {
            if (p.getName().contains(productName)) {
                productResult.add(p);
            }
        }
        return productResult;
    }

    @Override
    RowMapper<Product> getRowMapper() {
        return productMapper;
    }
}
