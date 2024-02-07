package com.example.demo.Config;

import com.example.demo.Service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myconfig.properties")
public class MyConfig {


    @Bean  //It Automatically Create Bean For ProductService Class.
    public ProductService productService(){
        return new ProductService();
    }
}
