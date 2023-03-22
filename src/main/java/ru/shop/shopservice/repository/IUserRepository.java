package ru.shop.shopservice.repository;

import ru.shop.shopservice.dto.BaseUser;

public interface IUserRepository<T extends BaseUser> {
    T getUserByLogin(String searchLogin);

    T saveUser(String Login, String password);

    T updateUser(T user);
}
