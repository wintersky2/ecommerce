package com.example.ecommerce.domain.product.entity;

import com.example.ecommerce.domain.member.entity.Member;
import com.example.ecommerce.global.jpa.BaseEntity;
import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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
    @ManyToOne
    private Member seller;
    private String name;
    private Long price;
    private String information;
}
