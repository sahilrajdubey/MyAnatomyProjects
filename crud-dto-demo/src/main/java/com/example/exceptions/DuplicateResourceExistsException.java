package com.example.exceptions;

public class DuplicateResourceExistsException extends RuntimeException {
     public DuplicateResourceExistsException(String message) {
        super(message);
     }
}
