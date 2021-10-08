package com.ruthtech.ds.exception;

public class QueueUnderFlowException  extends RuntimeException {
    public QueueUnderFlowException(String errorMessage ) {
        super(errorMessage);
    }
}