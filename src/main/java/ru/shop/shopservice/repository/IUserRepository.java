package ru.shop.shopservice.repository;

import ru.shop.shopservice.dto.BaseUser;

public interface IUserRepository<T extends BaseUser> extends ICrudRepository<T> {
    T getUserByLogin(String searchLogin);

}
