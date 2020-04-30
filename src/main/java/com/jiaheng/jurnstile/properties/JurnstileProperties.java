package com.jiaheng.jurnstile.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(value = "jurnstile")
@Configuration
@Getter
@Setter
public class JurnstileProperties {

    private final String enabled = "true";
}
