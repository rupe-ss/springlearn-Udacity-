package com.udacity.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.management.MXBean;

@SpringBootApplication
@Configuration
public class SpringlearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringlearnApplication.class, args);
    }

    @Bean
    public String message(){
        System.out.println("Inside message");
        return "Hello String";
    }

    @Bean
    public String compoundMessage(){
        System.out.println("This is compound message");
        return "Compund Message";
    }


}
