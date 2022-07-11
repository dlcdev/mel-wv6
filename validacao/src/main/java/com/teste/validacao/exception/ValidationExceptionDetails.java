package com.teste.validacao.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class ValidationExceptionDetails {
    private String title;
    private String message;
    private String fields;
    private String fieldsMessage;
    private LocalDateTime timestamp;
}
