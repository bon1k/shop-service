package ru.shop.shopservice.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import ru.shop.shopservice.dto.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class ProductMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getLong("id"));
        product.setName(resultSet.getString("name"));
        product.setDescription(resultSet.getString("description"));
        return product;
    }
}
