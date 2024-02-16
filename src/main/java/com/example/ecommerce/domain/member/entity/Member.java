package com.example.ecommerce.domain.member.entity;

import com.example.ecommerce.global.jpa.BaseEntity;
import jakarta.persistence.Column;
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
public class Member extends BaseEntity {
    @Column(unique = true)
    String membername;

    @Column
    String password;

    @Column
    String role;

    @Column
    String nickname;

    @Column
    String email;
}
