package com.jiaheng.jurnstile.annotation;

import com.jiaheng.jurnstile.configuration.EnableJurnstileMarkerConfiguration;
import org.springframework.context.annotation.Import;

@Import(EnableJurnstileMarkerConfiguration.class)
public @interface EnableJurnstile {
}
