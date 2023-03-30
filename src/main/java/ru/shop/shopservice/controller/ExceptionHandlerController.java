package ru.shop.shopservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.shop.shopservice.dto.ErrorNotification;
import ru.shop.shopservice.exception.NotFoundException;
import ru.shop.shopservice.exception.ValidationException;

@RestControllerAdvice
@Slf4j
public class ExceptionHandlerController {

    @ExceptionHandler(ValidationException.class)
    public ErrorNotification handleValidationException(RuntimeException e) {
        ErrorNotification notification = new ErrorNotification();
        notification.setErrorMessage(e.getMessage());
        return notification;
    }

    @ExceptionHandler(RuntimeException.class)
    public ErrorNotification handleRuntimeException(RuntimeException e) {
        log.error("Ошибка", e);
        ErrorNotification notification = new ErrorNotification();
        notification.setErrorMessage("Call support");
        return notification;
    }

    @ExceptionHandler(NotFoundException.class)
    public ErrorNotification handleNotFoundException(NotFoundException e) {
        ErrorNotification notification = new ErrorNotification();
        notification.setErrorMessage("Объект не найден");
        return notification;
    }
}
