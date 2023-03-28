package ru.shop.shopservice.controller;

import org.springframework.web.bind.annotation.*;
import ru.shop.shopservice.dto.LongIdDto;
import ru.shop.shopservice.service.ICrudService;

public abstract class CrudController<T extends LongIdDto> {

    public abstract ICrudService<T> getService();

    @PostMapping
    public T save(@RequestBody T dtoToSave) {
        return getService().save(dtoToSave);
    }

    @PutMapping
    public T update(@RequestBody T dtoToUpdate) {
        return getService().update(dtoToUpdate);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        getService().delete(id);
    }

    @GetMapping("/{id}")
    public T get(@PathVariable Long id) {
        return getService().get(id);
    }

}
