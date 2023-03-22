package ru.shop.shopservice.service;

import ru.shop.shopservice.dto.BaseUser;


public interface IUserService<T extends BaseUser> {
    T login(String login, String password);

    boolean register(String login, String password);

    T updateUserProfile(T userToUpdate);

}
