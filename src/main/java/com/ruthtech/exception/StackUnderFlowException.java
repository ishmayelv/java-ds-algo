package com.ruthtech.exception;

public class StackUnderFlowException  extends RuntimeException {
    public StackUnderFlowException(String errorMessage ) {
        super(errorMessage);
    }
}