package com.example.ecommerce.domain.orderItem.entity;

import com.example.ecommerce.domain.member.entity.Member;
import com.example.ecommerce.domain.product.entity.Product;
import com.example.ecommerce.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderItem extends BaseEntity {
    private Integer number;
    private Integer price;
    private String paymentType;
    private String statement;
}
