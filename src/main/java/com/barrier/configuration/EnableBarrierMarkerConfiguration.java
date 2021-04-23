package com.barrier.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnableBarrierMarkerConfiguration {

    @Bean
    public Marker enableBarrierMarkerBean() {
        return new Marker();
    }

    static class Marker {

    }
}
