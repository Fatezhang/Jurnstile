package com.jiaheng.jurnstile.exception;

public class JurnstileUnAuthorizationException extends JurnstileException {

    public JurnstileUnAuthorizationException(String message) {
        super(message);
    }

    public JurnstileUnAuthorizationException(String message, Throwable cause) {
        super(message, cause);
    }
}
