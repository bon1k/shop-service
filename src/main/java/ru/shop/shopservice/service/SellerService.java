package ru.shop.shopservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shop.shopservice.dto.Seller;
import ru.shop.shopservice.repository.ISellerRepository;

@Service
public class SellerService extends UserService<Seller> implements ISellerService {

    @Autowired
    private ISellerRepository sellerRepository;

    @Override
    public Seller save(Seller dtoToSave) {
        return null;
    }

    @Override
    public Seller update(Seller dtoToUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Seller get(Long id) {
        return null;
    }

    @Override
    public Seller login(String login, String password) {
        return null;
    }

    @Override
    public boolean register(String login, String password) {
        Seller seller = new Seller();
        seller.setLogin(login);
        seller.setPassword(password);
        sellerRepository.save(seller);
        return true;
    }

    @Override
    public Seller findByOrganization(String organizationName) {
        return null;
    }
}
