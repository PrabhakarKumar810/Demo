package com.example.demo.myconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration

@ComponentScan("working.config")
public class MyConfig1 {

   @Bean
    public BCryptPasswordEncoder passwordEncoder(){
       return new BCryptPasswordEncoder();
   }
}
