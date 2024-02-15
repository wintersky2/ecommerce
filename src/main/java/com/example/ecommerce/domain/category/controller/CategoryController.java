package com.example.ecommerce.domain.category.controller;

import com.example.ecommerce.domain.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
}
