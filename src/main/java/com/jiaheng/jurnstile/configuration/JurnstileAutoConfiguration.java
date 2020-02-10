package com.jiaheng.jurnstile.configuration;

import com.jiaheng.jurnstile.core.JurnstileCoreService;
import com.jiaheng.jurnstile.core.JurnstileInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ConditionalOnBean(EnableJurnstileMarkerConfiguration.Marker.class)
public class JurnstileAutoConfiguration implements WebMvcConfigurer {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "jurnstile", value = "enabled", havingValue = "true")
    public JurnstileCoreService jurnstileCoreService() {
        return new JurnstileCoreService();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JurnstileInterceptor()).addPathPatterns("/*/**");
    }
}
