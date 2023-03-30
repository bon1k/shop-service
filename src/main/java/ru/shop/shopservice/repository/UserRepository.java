package ru.shop.shopservice.repository;

import org.springframework.stereotype.Repository;
import ru.shop.shopservice.dto.BaseUser;
import ru.shop.shopservice.exception.NotFoundException;

@Repository
public abstract class UserRepository<T extends BaseUser> extends CrudRepository<T> implements IUserRepository<T> {

    public UserRepository(Class<T> classType) {
        super(classType);
    }

    public T findByUserByLogin(String searchLogin) {
        for (T user : database) {
            if (user.getLogin().equalsIgnoreCase(searchLogin)) {
                return user;
            }
        }
        throw new NotFoundException();
    }
}
