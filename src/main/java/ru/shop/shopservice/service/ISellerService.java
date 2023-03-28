package ru.shop.shopservice.service;

import ru.shop.shopservice.dto.Seller;

public interface ISellerService extends IUserService<Seller> {
    Seller findByOrganization(String organizationName);
}
