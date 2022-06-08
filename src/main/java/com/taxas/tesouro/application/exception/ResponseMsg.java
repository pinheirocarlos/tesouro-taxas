package com.taxas.tesouro.application.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ResponseMsg {
    private LocalDateTime timestamp;
    private String description;
}
