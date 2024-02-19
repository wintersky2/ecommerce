package com.example.ecommerce;

import com.example.ecommerce.domain.member.entity.Member;
import com.example.ecommerce.domain.member.repository.MemberRepository;
import com.example.ecommerce.domain.member.service.MemberService;
import com.example.ecommerce.domain.product.entity.Product;
import com.example.ecommerce.domain.product.repository.ProductRepository;
import com.example.ecommerce.domain.product.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class EcommerceApplicationTests {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    MemberService memberService;
    @Autowired
    ProductRepository productRepository;

    @Test
    void createAdmin() {
        this.memberService.create("admin", passwordEncoder.encode("1234"), "관리자", "admin@email.com");
    }

    @Test
    void createTestProduct(){
        Member member = this.memberService.findBymembername("admin");
        for(int i=1;i<11;i++){
            Product product = Product.builder()
                    .seller(member)
                    .name("상품"+i)
                    .information("정보"+i)
                    .price(2000L)
                    .build();
            this.productRepository.save(product);
        }
    }

}
