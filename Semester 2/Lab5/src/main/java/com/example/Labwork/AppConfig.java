package com.example.Labwork;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.example.Labwork")
@PropertySource("classpath:application.properties")
public class AppConfig {
}