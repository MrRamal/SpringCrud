package com.example.demo.config;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Data
@Configuration
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "app")
public class AppConfig {

    private AppDeveloper appDeveloper;
    private String name;
    private double appVersion;
    @Data
    public static class AppDeveloper {

        private String front;
        private String back;

    }

}
