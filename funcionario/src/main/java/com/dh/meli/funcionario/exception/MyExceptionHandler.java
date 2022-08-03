package com.dh.meli.funcionario.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

public class MyExceptionHandler {

    @ExceptionHandler(InvalidEmployeeParam.class)
    public ResponseEntity<ExceptionDetails> handlerInvalidPersonParam(InvalidEmployeeParam ex) {
        return new ResponseEntity<>(
                ExceptionDetails.builder()
                        .titulo("Employee invalid")
                        .mensagem(ex.getMessage())
                        .timestamp(LocalDateTime.now())
                        .build(),
                HttpStatus.BAD_REQUEST);
    }


}
