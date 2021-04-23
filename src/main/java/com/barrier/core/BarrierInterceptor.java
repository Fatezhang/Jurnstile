package com.barrier.core;

import com.barrier.exception.BarrierUnAuthorizationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class BarrierInterceptor implements HandlerInterceptor {

    private static final String UNAUTHORISED = "unauthorised";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if (request.getHeader("hello") != null) {
            return true;
        }
        throw new BarrierUnAuthorizationException(UNAUTHORISED);
    }
}
