package com.jiaheng.jurnstile.exception;

public class JurnstileException extends RuntimeException {

    public JurnstileException(String message) {
        super(message);
    }

    public JurnstileException(String message, Throwable cause) {
        super(message, cause);
    }
}
