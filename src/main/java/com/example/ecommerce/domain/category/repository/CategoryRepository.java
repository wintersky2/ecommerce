package com.example.ecommerce.domain.category.repository;

import com.example.ecommerce.domain.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
