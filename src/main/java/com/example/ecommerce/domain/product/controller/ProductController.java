package com.example.ecommerce.domain.product.controller;

import com.example.ecommerce.domain.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
}
