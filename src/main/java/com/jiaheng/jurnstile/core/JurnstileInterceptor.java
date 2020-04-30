package com.jiaheng.jurnstile.core;

import com.jiaheng.jurnstile.exception.JurnstileUnAuthorizationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

@Slf4j
public class JurnstileInterceptor implements HandlerInterceptor {

    private final String UNAUTHORIZATION = "Unauthorization";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if (request.getHeader("hello") != null) {
            return true;
        }
        throw new JurnstileUnAuthorizationException(UNAUTHORIZATION);
    }
}
