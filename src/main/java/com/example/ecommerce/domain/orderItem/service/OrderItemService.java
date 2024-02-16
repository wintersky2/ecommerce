package com.example.ecommerce.domain.orderItem.service;

import com.example.ecommerce.domain.orderItem.repository.OrderItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderItemService {
    private final OrderItemRepository orderRepository;
}
