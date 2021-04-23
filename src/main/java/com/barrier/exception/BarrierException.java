package com.barrier.exception;

public class BarrierException extends RuntimeException {

    public BarrierException(String message) {
        super(message);
    }

    public BarrierException(String message, Throwable cause) {
        super(message, cause);
    }
}
