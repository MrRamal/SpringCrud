package com.example.demo.model;


import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public Student createStudent(){
        return new Student();
    }

}
