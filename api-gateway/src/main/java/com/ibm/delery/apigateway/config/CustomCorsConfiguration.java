package com.ibm.delery.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CustomCorsConfiguration {

    @Bean
    public CorsFilter corsFilter() {
        // Create a new CorsConfiguration
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        // Set allowed origins
        corsConfiguration.addAllowedOrigin("http://localhost:4200");
        corsConfiguration.addAllowedOrigin("http://34.27.82.55");
        corsConfiguration.addAllowedOrigin("http://34.27.82.55:80");

        // Set allowed methods
        corsConfiguration.addAllowedMethod("*");

        // Set allowed headers
        corsConfiguration.addAllowedHeader("*");

        // Set allow credentials
        corsConfiguration.setAllowCredentials(true);

        // Set max age
        corsConfiguration.setMaxAge(3600L);

        // Register the CorsConfiguration for all your endpoints
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);

        // Return a new CorsFilter with the configured source
        return new CorsFilter(source);
    }
}
