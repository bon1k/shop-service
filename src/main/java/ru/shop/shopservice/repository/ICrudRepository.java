package ru.shop.shopservice.repository;

import ru.shop.shopservice.dto.LongIdDto;


public interface ICrudRepository<T extends LongIdDto> {

    T save(T dtoToSave);

    T update(T dtoToUpdate);

    void delete(Long id);

    T findOne(Long id);
}
