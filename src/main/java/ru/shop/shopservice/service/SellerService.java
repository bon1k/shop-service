package ru.shop.shopservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shop.shopservice.dto.RegistrationDto;
import ru.shop.shopservice.dto.Seller;
import ru.shop.shopservice.dto.UserDetails;
import ru.shop.shopservice.repository.ISellerRepository;

@Service
public class SellerService extends UserService<Seller> implements ISellerService {

    @Autowired
    private ISellerRepository sellerRepository;
    @Autowired
    private UserDetailsContextService userDetailsContextService;

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
        return sellerRepository.findOne(id);
    }

    @Override
    public Seller login(String login, String password) {
        return null;
    }

    @Override
    public boolean register(RegistrationDto registrationDto) {
        Seller seller = new Seller();
        seller.setLogin(registrationDto.getLogin());
        seller.setPassword(registrationDto.getPassword());
        sellerRepository.save(seller);


        UserDetails userDetails = new UserDetails();
        userDetails.setLogin(registrationDto.getLogin());
        userDetailsContextService.setUserDetails(userDetails);

        return true;
    }

    @Override
    public Seller findByOrganization(String organizationName) {
        return null;
    }
}
