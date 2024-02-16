package com.example.ecommerce.domain.product.entity;

import com.example.ecommerce.domain.member.entity.Member;
import com.example.ecommerce.global.jpa.BaseEntity;
import com.fasterxml.jackson.databind.ser.Serializers;
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
public class Product extends BaseEntity {
    private String name;
    private Integer price;
    private String information;
    private Integer stock;
    private Integer salesRate;
}
