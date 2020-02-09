package com.jiaheng.jurnstile.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnableJurnstileMarkerConfiguration {
    @Bean
    public Marker enableJurnstileMarkerBean() {
        return new Marker();
    }

    class Marker {
    }
}
