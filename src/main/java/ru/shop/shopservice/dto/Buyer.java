package ru.shop.shopservice.dto;

public class Buyer extends BaseUser {

    int cardNumber;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
