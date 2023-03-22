package ru.shop.shopservice.service;

import org.springframework.stereotype.Service;
import ru.shop.shopservice.dto.Seller;
import ru.shop.shopservice.repository.ICrudRepository;

@Service
public class SellerService extends CrudService<Seller> {


    private ICrudRepository crudRepository;

    @Override
    public ICrudRepository getRepository() {
        return crudRepository;
    }

    @Override
    public void validate(Seller seller) {

    }
}
