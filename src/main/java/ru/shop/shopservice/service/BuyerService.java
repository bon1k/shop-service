package ru.shop.shopservice.service;


import ru.shop.shopservice.dto.Buyer;
import ru.shop.shopservice.repository.ICrudRepository;

public class BuyerService extends CrudService<Buyer> {

    private ICrudRepository crudRepository;

    public BuyerService(ICrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    @Override
    public ICrudRepository<Buyer> getRepository() {
        return crudRepository;
    }

    @Override
    public void validate(Buyer buyer) {

    }

}
