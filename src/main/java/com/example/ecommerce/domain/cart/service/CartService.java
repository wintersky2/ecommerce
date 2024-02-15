package com.example.ecommerce.domain.cart.service;

import com.example.ecommerce.domain.cart.repository.CartRepositoty;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartRepositoty cartRepositoty;
}
