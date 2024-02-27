package com.ibm.delery.apigateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // Allow requests from all origins
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("Authorization", "Cache-Control", "Content-Type")
                .allowCredentials(false) // Set to false if credentials are not needed
                .exposedHeaders("Authorization") // Expose additional headers if needed
                .maxAge(3600); // Cache preflight response for 1 hour
    }
}
