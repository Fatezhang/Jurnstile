package com.barrier.configuration;

import com.barrier.core.BarrierCoreService;
import com.barrier.core.BarrierInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ConditionalOnBean(EnableBarrierMarkerConfiguration.Marker.class)
public class BarrierAutoConfiguration implements WebMvcConfigurer {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "barrier", value = "enabled", havingValue = "true")
    public BarrierCoreService barrierCoreService() {
        return new BarrierCoreService();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new BarrierInterceptor()).addPathPatterns("/*/**");
    }
}
