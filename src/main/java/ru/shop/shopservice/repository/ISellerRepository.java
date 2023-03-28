package ru.shop.shopservice.repository;

import ru.shop.shopservice.dto.Seller;

public interface ISellerRepository extends IUserRepository<Seller> {
    public Seller findByOrganization(String organizationName);
}
