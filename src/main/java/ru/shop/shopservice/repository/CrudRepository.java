package ru.shop.shopservice.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.shop.shopservice.annotation.Table;
import ru.shop.shopservice.dto.LongIdDto;

import java.util.ArrayList;
import java.util.List;

@Repository
@Slf4j
public abstract class CrudRepository<T extends LongIdDto> implements ICrudRepository<T> {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    abstract RowMapper<T> getRowMapper();

    private Class<T> classType;

    public CrudRepository(Class<T> classType) {
        this.classType = classType;
    }

    List<T> database = new ArrayList<T>();
    private Long idSequence = 0L;

    @Override
    public T save(T dtoToSave) {
        dtoToSave.setId(++idSequence);
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
        log.info("findOne");
        String sql = "SELECT id, name, description FROM " + getTableName() + " WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, getRowMapper(), id);
    }

    private String getTableName() {
        Table annotation = classType.getAnnotation(Table.class);
        return annotation.name();
    }
}

