package com.example.ecommerce.domain.cart.controller;

import com.example.ecommerce.domain.cart.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;
}
