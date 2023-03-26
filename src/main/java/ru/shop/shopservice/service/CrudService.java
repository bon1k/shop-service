package ru.shop.shopservice.service;

import ru.shop.shopservice.dto.LongIdDto;
import ru.shop.shopservice.repository.ICrudRepository;


public abstract class CrudService<T extends LongIdDto> implements ICrudService<T> {
    public abstract ICrudRepository<T> getRepository();

    @Override
    public T save(T dtoToSave) {
        if (dtoToSave.getId() != null) {
            throw new RuntimeException("Ошибка сохранения");
        }
        validate(dtoToSave);
        return getRepository().save(dtoToSave);
    }

    @Override
    public T update(T dtoToUpdate) {
        if (dtoToUpdate.getId() == null) {
            throw new RuntimeException("Ошибка update");
        }
        validate(dtoToUpdate);
        return getRepository().update(dtoToUpdate);
    }

    @Override
    public void delete(Long id) {
        getRepository().delete(id);
    }

    @Override
    public T get(Long id) {
        return getRepository().findOne(id);
    }

    public abstract void validate(T dto);
}
