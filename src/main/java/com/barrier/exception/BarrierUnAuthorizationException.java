package com.barrier.exception;

public class BarrierUnAuthorizationException extends BarrierException {

    public BarrierUnAuthorizationException(String message) {
        super(message);
    }

    public BarrierUnAuthorizationException(String message, Throwable cause) {
        super(message, cause);
    }
}
