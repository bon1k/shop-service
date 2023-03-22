package ru.shop.shopservice.repository;

import org.springframework.stereotype.Repository;
import ru.shop.shopservice.dto.BaseUser;

@Repository
public abstract class UserRepository<T extends BaseUser> extends CrudRepository<T> {


    public T findByUserByLogin(String searchLogin) {
        for (T user : database) {
            if (user.getLogin().equalsIgnoreCase(searchLogin)) {
                return user;
            }
        }
        return null;
    }
}
