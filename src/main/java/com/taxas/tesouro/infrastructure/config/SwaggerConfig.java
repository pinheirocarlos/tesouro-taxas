package com.taxas.tesouro.infrastructure.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer {
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("Tesouro-Direto-Taxas")
                .packagesToScan("com.taxas.tesouro.application.controller")
                .pathsToMatch("/**")
                .build();
    }
}