package com.example.ecommerce.domain.member.service;

import com.example.ecommerce.domain.member.entity.Member;
import com.example.ecommerce.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public void create(String membername, String password, String nickname, String email) {
        Member member = Member.builder()
                .membername(membername)
                .password(passwordEncoder.encode(password))
                .nickname(nickname)
                .email(email)
                .build();
        this.memberRepository.save(member);
    }

    public Member findBymembername(String membername) {
        Optional<Member> _member = this.memberRepository.findByMembername(membername);
        if(_member.isEmpty()){
            return null;
        }
        return _member.get();
    }
}
