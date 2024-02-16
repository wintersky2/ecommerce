package com.example.ecommerce.domain.orderItem.controller;

import com.example.ecommerce.domain.orderItem.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class OrderItemController {
    private final OrderItemService orderService;
}
