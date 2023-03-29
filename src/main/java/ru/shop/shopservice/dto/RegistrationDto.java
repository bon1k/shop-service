package ru.shop.shopservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationDto {
    private String login;
    private String password;
    private String passwordCheck;


}
