package com.ibm.delery.apigateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200","http://35.232.9.232") // Add your allowed origins here
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Add your allowed methods here
                .allowedHeaders("Authorization", "Content-Type") // Add your allowed headers here
                .allowCredentials(true); // Allow credentials if needed
    }
}


