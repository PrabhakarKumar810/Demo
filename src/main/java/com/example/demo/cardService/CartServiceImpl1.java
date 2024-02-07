package com.example.demo.cardService;

import org.springframework.stereotype.Component;

@Component("Cart1")
public class CartServiceImpl1 implements CartService{

    @Override
    public void addToCart() {
        System.out.println("Adding Cart1");
    }
}
