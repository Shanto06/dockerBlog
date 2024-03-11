package com.taslim.dockerBlog.utils;

import com.taslim.dockerBlog.dto.ExceptionDto;
import com.taslim.dockerBlog.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Global exception handler to manage exceptions across the application.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Handles exceptions to various types and returns an appropriate ResponseEntity.
     *
     * @param ex The exception to be handled.
     * @return ResponseEntity containing an ExceptionModel and an HTTP status code.
     */
    @ExceptionHandler({InvalidProductIdException.class, ProductNotFoundException.class})
    public ResponseEntity<Object> returnNotFoundException(Exception ex) {
        if (ex instanceof ProductNotFoundException) {
            return new ResponseEntity<>(new ExceptionDto(ex.getMessage()), HttpStatus.NOT_IMPLEMENTED);
        } else {
            return new ResponseEntity<>(new ExceptionDto(ex.getMessage()), HttpStatus.NOT_FOUND);
        }
    }
}
