package ru.shop.shopservice.dto;

import lombok.Getter;
import lombok.Setter;
import ru.shop.shopservice.annotation.Table;

import java.math.BigDecimal;

@Table(name = "product")
@Getter
@Setter
public class Product extends LongIdDto {

    private String name;
    private String description;
    private Long sellerId;

    private BigDecimal price;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sellerId=" + sellerId +
                '}';
    }
}
