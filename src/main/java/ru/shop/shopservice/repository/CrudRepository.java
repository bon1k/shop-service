package ru.shop.shopservice.repository;

import org.springframework.stereotype.Repository;
import ru.shop.shopservice.dto.LongIdDto;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CrudRepository<T extends LongIdDto> implements ICrudRepository<T> {

    List<T> database = new ArrayList<T>();


    @Override
    public T save(T dtoToSave) {
        database.add(dtoToSave);
        return dtoToSave;
    }

    @Override
    public T update(T dtoToUpdate) {
        database.remove(dtoToUpdate);
        database.add(dtoToUpdate);
        return dtoToUpdate;
    }

    @Override
    public void delete(Long id) {
        database.removeIf(dto -> dto.getId().equals(id));
    }

    @Override
    public T findOne(Long id) {
        for (T dto : database) {
            if (dto.getId().equals(id)) {
                return dto;
            }
        }
        throw new RuntimeException("This id " + id + " is not in the database");
    }
}

