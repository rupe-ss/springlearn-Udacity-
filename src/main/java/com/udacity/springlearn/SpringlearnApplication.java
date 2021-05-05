package com.udacity.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class SpringlearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringlearnApplication.class, args);
    }

    @Bean
    public String message(){
        System.out.println("Creating message Bean.");
        return "Hello String";
    }

    @Bean
    public String uppercaseMessage(MessageService messageService){
        System.out.println("Creating uppercase message bean.");
        return messageService.uppercase();
    }

    @Bean
    public String lowercaseMessage(MessageService messageService){
        System.out.println("Creating lowercase message bean.");
        return messageService.lowercase();
    }


}
