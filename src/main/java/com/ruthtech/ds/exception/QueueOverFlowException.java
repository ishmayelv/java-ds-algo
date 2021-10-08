package com.ruthtech.ds.exception;

public class QueueOverFlowException  extends RuntimeException {
    public QueueOverFlowException(String errorMessage) {
        super(errorMessage );
    }
}