package ru.shop.shopservice.dto;

import java.util.Objects;

public abstract class LongIdDto {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LongIdDto longIdDto = (LongIdDto) o;

        return Objects.equals(id, longIdDto.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
