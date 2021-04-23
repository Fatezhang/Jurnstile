package com.barrier.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(value = "barrier", prefix = "prop")
@Configuration
@Getter
@Setter
public class BarrierProperties {

    private static final String ENABLED = "true";
}
