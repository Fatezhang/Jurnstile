package com.jiaheng.jurnstile.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("jurnstile")
@Configuration
@Getter
@Setter
public class JurnstileProperties {
    private String prefix;
    private String suffix;

}
