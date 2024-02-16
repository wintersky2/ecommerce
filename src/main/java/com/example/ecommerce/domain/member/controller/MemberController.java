package com.example.ecommerce.domain.member.controller;

import com.example.ecommerce.domain.member.entity.MemberSignupForm;
import com.example.ecommerce.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/signup")
    public String memberSignup(MemberSignupForm memberSignupForm) {
        return "signup_form";
    }

    @PostMapping("/signup")
    public String memberSignup(@Valid MemberSignupForm memberSignupForm, BindingResult bindingResult) {

        if(!memberSignupForm.getPassword1().equals(memberSignupForm.getPassword2())){
            bindingResult.rejectValue("password2","passwordInCorrect","비밀번호 불일치");
        }
        if (bindingResult.hasErrors()) {
            return "signup_form";
        }

        this.memberService.create(memberSignupForm.getMembername(), memberSignupForm.getPassword1(),
                memberSignupForm.getNickname(), memberSignupForm.getEmail());

        return "redirect:/member/login";
    }

    @GetMapping("/login")
    public String memberLogin() {
        return "login_form";
    }

}
