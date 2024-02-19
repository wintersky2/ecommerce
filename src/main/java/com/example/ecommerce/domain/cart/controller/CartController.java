package com.example.ecommerce.domain.cart.controller;

import com.example.ecommerce.domain.cart.service.CartService;
import com.example.ecommerce.domain.product.entity.Product;
import com.example.ecommerce.domain.product.service.ProductService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/cart")
public class CartController {
    private final CartService cartService;
    private final ProductService productService;

    @GetMapping("/add/{productId}")
    public String addProductIntoCart(@PathVariable(value = "productId")Long productId){
        Product product = this.productService.getProduct(productId);
        return "add_cart";
    }
}
