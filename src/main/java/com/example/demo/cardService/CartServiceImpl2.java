package com.example.demo.cardService;

import org.springframework.stereotype.Component;

@Component("Cart2")
public class CartServiceImpl2 implements CartService {
    @Override
    public void addToCart() {
        System.out.println("Adding Cart 2");
    }
}
