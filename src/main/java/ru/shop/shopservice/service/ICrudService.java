package ru.shop.shopservice.service;

import ru.shop.shopservice.dto.LongIdDto;


public interface ICrudService<T extends LongIdDto> {

    T save(T dtoToSave);

    T update(T dtoToUpdate);

    void delete(Long id);

    T get(Long id);
}
