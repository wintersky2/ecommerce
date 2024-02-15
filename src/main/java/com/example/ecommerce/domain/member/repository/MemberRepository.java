package com.example.ecommerce.domain.member.repository;

import com.example.ecommerce.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
