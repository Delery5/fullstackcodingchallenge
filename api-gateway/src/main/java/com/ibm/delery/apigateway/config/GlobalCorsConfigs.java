package com.ibm.delery.apigateway.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

public interface GlobalCorsConfigs {

    void addCorsMappings(CorsRegistry registry);
}
