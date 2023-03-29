package ru.shop.shopservice.controller;


import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.shop.shopservice.dto.RegistrationDto;
import ru.shop.shopservice.dto.Seller;
import ru.shop.shopservice.dto.UserDetails;
import ru.shop.shopservice.service.ISellerService;
import ru.shop.shopservice.service.UserDetailsContextService;

@RestController
@RequestMapping("/seller")
public class SellerAuthenticationController {
    @Autowired
    private ISellerService sellerService;
    @Autowired
    private UserDetailsContextService userDetailsContextService;

    @PostMapping("/register")
    public boolean register(@RequestBody RegistrationDto registrationDto) {
        sellerService.register(registrationDto);
        return true;
    }

    @GetMapping("/{id}")
    public Seller getSeller(@PathVariable Long id) {
        return sellerService.get(id);
    }

    @GetMapping("/currentUser")
    public UserDetails getCurrentUserDetails() {
        return userDetailsContextService.getUserDetails();
    }

    @GetMapping("/logout")
    public void logout(HttpSession httpSession) {
        httpSession.invalidate();
    }
}
