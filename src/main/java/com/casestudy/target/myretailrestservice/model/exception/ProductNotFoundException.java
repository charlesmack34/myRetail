package com.casestudy.target.myretailrestservice.model.exception;

import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

public class ProductNotFoundException extends Exception {

    private HttpStatus status;
    private String message;
    private List<String> errors;

    public ProductNotFoundException(HttpStatus httpStatus, String message, String exception) {

        super();
        this.status = httpStatus;
        this.message = message;
        if (exception != null) this.errors = Arrays.asList(exception);

    }

}
