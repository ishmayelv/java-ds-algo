package com.ruthtech.exception;

public class StackOverFlowException  extends RuntimeException {
    public StackOverFlowException(String errorMessage) {
        super(errorMessage );
    }
}