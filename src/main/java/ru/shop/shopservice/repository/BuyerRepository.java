package ru.shop.shopservice.repository;

import org.springframework.stereotype.Repository;
import ru.shop.shopservice.dto.Buyer;

@Repository
public class BuyerRepository extends UserRepository<Buyer> {


    @Override
    public Buyer getUserByLogin(String searchLogin) {
        return null;
    }
}

