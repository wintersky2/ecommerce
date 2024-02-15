package com.example.ecommerce.domain.cart.repository;

import com.example.ecommerce.domain.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepositoty extends JpaRepository<Cart, Long> {
}
