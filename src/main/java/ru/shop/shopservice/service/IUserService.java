package ru.shop.shopservice.service;

import ru.shop.shopservice.dto.BaseUser;
import ru.shop.shopservice.dto.RegistrationDto;


public interface IUserService<T extends BaseUser> extends ICrudService<T> {
    T login(String login, String password);

    boolean register(RegistrationDto registrationDto);

}
