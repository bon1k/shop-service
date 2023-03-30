package ru.shop.shopservice.repository;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.shop.shopservice.dto.Buyer;

@Repository
public class BuyerRepository extends UserRepository<Buyer> {


    public BuyerRepository() {
        super(Buyer.class);
    }

    @Override
    public Buyer getUserByLogin(String searchLogin) {
        return null;
    }

    @Override
    RowMapper<Buyer> getRowMapper() {
        return null;
    }
}

