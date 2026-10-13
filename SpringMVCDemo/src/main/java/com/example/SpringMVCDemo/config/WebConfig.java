package com.example.SpringMVCDemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration 
@ComponentScan (basePackages = "com.example.SpringMVCDemo")
@EnableWebMvc // only in web NVC framework of Spring, it enables the Spring MVC configuration and allows the application to handle HTTP requests and responses.
public class WebConfig {
    
}
