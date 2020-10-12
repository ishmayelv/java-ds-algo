package com.ruth.ds.exception;

public class QueueOverFlowException  extends RuntimeException {
    public QueueOverFlowException(String errorMessage) {
        super(errorMessage );
    }
}