package com.ruthtech.exception;

public class QueueOverFlowException  extends RuntimeException {
    public QueueOverFlowException(String errorMessage) {
        super(errorMessage );
    }
}