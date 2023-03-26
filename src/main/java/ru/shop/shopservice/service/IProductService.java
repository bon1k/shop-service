package ru.shop.shopservice.service;

import ru.shop.shopservice.dto.Product;

import java.util.List;


public interface IProductService extends ICrudService<Product> {
    List<Product> findByName(String name);

}
