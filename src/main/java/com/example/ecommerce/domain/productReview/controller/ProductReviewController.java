package com.example.ecommerce.domain.productReview.controller;

import com.example.ecommerce.domain.productReview.service.ProductReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ProductReviewController {
    private final ProductReviewService productReviewService;
}
