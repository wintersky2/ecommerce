package com.example.ecommerce.domain.productReview.repository;

import com.example.ecommerce.domain.productReview.entity.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReviewRepository extends JpaRepository<ProductReview,Long> {
}
