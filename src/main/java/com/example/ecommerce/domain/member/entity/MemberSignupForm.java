package com.example.ecommerce.domain.member.entity;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberSignupForm {
    @NotEmpty
    private String membername;
    @NotEmpty
    private String nickname;
    @NotEmpty
    private String email;
    @NotEmpty
    private String password1;
    @NotEmpty
    private String password2;
}
