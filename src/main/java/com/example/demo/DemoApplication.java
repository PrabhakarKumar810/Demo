package com.example.demo;

import com.example.demo.Service.CategoryService;
import com.example.demo.Service.ProductService;
import com.example.demo.readpropertiesfile.MyConfigValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication  //It is Core Spring Boot Annotation.

public class DemoApplication  {


	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(DemoApplication.class, args);


//		ProductService productService = container.getBean(ProductService.class);
//		System.out.println(productService.hashCode());
//
//		productService.createProduct();
//
//		CategoryService bean = container.getBean(CategoryService.class);
//		System.out.println(bean);
//		bean.getProductService().createProduct();
//
//		bean.getCartService().addToCart();

		MyConfigValues bean = container.getBean(MyConfigValues.class);
		String appName = bean.getAppName();
		String database = bean.getDatabase();
		long port = bean.getPort();
		System.out.println(appName);
		System.out.println(database);
		System.out.println(port);
	}


	}

