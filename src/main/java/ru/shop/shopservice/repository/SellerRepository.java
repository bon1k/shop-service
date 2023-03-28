package ru.shop.shopservice.repository;


import org.springframework.stereotype.Repository;
import ru.shop.shopservice.dto.Seller;
import ru.shop.shopservice.exception.NotFoundException;

@Repository
public class SellerRepository extends UserRepository<Seller> implements ISellerRepository {

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
}
