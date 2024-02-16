package com.example.ecommerce.domain.member.role;

import lombok.Getter;

@Getter
public enum MemberRole {
    ADMIN("ROLE_ADMIN"),
    SELLER("ROLE_SELLER"),
    BUYER("ROLE_BUYER");

    MemberRole(String value) {
        this.value = value;
    }

    private String value;
}
