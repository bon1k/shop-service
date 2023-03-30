package ru.shop.shopservice.repository;


import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.shop.shopservice.dto.Seller;
import ru.shop.shopservice.exception.NotFoundException;
import ru.shop.shopservice.mapper.ProductMapper;

@Repository
public class SellerRepository extends UserRepository<Seller> implements ISellerRepository {

    private ProductMapper productMapper;

    public SellerRepository() {
        super(Seller.class);
    }

    @Override
    public Seller findByOrganization(String organizationName) {
        for (Seller seller : database) {
            if (seller.getOrganizationName().equalsIgnoreCase(organizationName)) {
                return seller;
            }
        }
        throw new NotFoundException();
    }

    @Override
    public Seller getUserByLogin(String searchLogin) {
        return null;
    }

    @Override
    RowMapper<Seller> getRowMapper() {
        return null;
    }
}
