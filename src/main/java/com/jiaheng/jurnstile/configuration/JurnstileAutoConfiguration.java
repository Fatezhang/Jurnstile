package com.jiaheng.jurnstile.configuration;

import com.jiaheng.jurnstile.core.JurnstileCoreService;
import com.jiaheng.jurnstile.properties.JurnstileProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnBean(EnableJurnstileMarkerConfiguration.Marker.class)
@RequiredArgsConstructor
public class JurnstileAutoConfiguration {

    private final JurnstileProperties jurnstileProperties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "jurnstile", value = "enabled", havingValue = "true")
    public JurnstileCoreService jurnstileCoreService() {
        return new JurnstileCoreService(jurnstileProperties.getPrefix(), jurnstileProperties.getSuffix());
    }

}
