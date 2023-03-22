package ru.shop.shopservice.service;

import ru.shop.shopservice.dto.Order;
import ru.shop.shopservice.repository.ICrudRepository;


public class OrderService extends CrudService<Order> {

    private ICrudRepository crudRepository;

    public OrderService(ICrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    @Override
    public ICrudRepository<Order> getRepository() {
        return crudRepository;
    }

    @Override
    public void validate(Order order) {

    }
}
