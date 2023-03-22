package ru.shop.shopservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shop.shopservice.dto.Product;
import ru.shop.shopservice.repository.ICrudRepository;
import ru.shop.shopservice.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService extends CrudService<Product> {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findByName(String productName) {
        return productRepository.findByName(productName);
    }

    @Override
    public ICrudRepository<Product> getRepository() {
        return productRepository;
    }

    @Override
    public void validate(Product product) {
        if (product.getName() == null) {
            throw new RuntimeException("Нельзя сохранить товар без названия");
        }

    }
}
