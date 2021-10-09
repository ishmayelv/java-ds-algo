package com.ruthtech.exception;

public class HeapUnderFlowException  extends RuntimeException {
    public HeapUnderFlowException(String errorMessage ) {
        super(errorMessage);
    }
}