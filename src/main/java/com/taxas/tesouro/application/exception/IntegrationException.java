package com.taxas.tesouro.application.exception;

public class IntegrationException extends RuntimeException{
    public IntegrationException(String errorMessage) {
        super(errorMessage);
    }
}
