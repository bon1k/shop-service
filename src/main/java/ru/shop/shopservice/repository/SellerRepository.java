package ru.shop.shopservice.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.shop.shopservice.dto.Seller;

@Repository
public class SellerRepository extends UserRepository<Seller> {

    private ProductRepository productRepository;

    @Autowired
    public SellerRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Seller findByOrganization(String organizationName) {
        for (Seller user : database) {
            if (user.getOrganizationName().equalsIgnoreCase(organizationName)) {
                return user;
            }
        }
        return null;
    }
}
