package com.taxas.tesouro.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ControllerException {

    @ExceptionHandler(IntegrationException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResponseMsg handleInvalidUserException(Exception ex) {
        return ResponseMsg.builder()
                .timestamp(LocalDateTime.now())
                .description(ex.getMessage())
                .build();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseMsg handleAllException(Exception ex) {
        return ResponseMsg.builder()
                .timestamp(LocalDateTime.now())
                .description(ex.getMessage())
                .build();
    }

}
