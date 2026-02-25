package com.example.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CategoryNotFoundException extends ResponseStatusException {
    public CategoryNotFoundException() {
        super(HttpStatus.BAD_REQUEST, "Product Not Found");
    }
}
