package com.jiaheng.jurnstile.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(JurnstileUnAuthorizationException.class)
    public ResponseEntity<String> handlerUnAuthorizationException(Throwable tx) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(tx.getLocalizedMessage());
    }
}
