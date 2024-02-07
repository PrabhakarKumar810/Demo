package com.example.demo.Service;

import com.example.demo.cardService.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CategoryService {

    @Autowired
    @Qualifier("Cart2")
    private CartService cartService;
    @Autowired
    private ProductService productService;

    public CartService getCartService() {
        return cartService;
    }

    public void setCartService(CartService cartService) {
        this.cartService = cartService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public ProductService getProductService() {
        return productService;
    }
}
