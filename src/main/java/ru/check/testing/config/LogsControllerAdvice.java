package ru.check.testing.config;

import com.fasterxml.jackson.core.JacksonException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LogsControllerAdvice {
    @ExceptionHandler(JacksonException.class)
    public ResponseEntity<String> responseJacksonException() {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Wrong request!");
    }
}
