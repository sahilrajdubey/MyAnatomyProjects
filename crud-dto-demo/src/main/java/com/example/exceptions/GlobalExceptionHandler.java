package com.example.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.ResponseEntity;

@RestControllerAdvice 
public class GlobalExceptionHandler {


    

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException e) {
        return ResponseEntity
                .status(500)
                .body("An error occurred: " + e.getMessage());
    }
    // Last fallback for any other unhandled exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericException(Exception e) {
        return ResponseEntity
                .status(500)
                .body("Something went wrong Please try again later: " + e.getMessage());
    }

    @ExceptionHandler (DuplicateResourceExistsException.class)
    public ResponseEntity<String> handleDuplicateResourceExistsException(DuplicateResourceExistsException e) {
        return ResponseEntity
                .status(409)
                .body(e.getMessage());
    }
}
