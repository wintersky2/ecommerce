package com.example.ecommerce.domain.product.service;

import com.example.ecommerce.domain.member.entity.Member;
import com.example.ecommerce.domain.product.entity.Product;
import com.example.ecommerce.domain.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAllProduct() {
        return this.productRepository.findAll();
    }

    public void createProduct(Member member, String name, String information, Long price) {
        Product product = Product.builder()
                .seller(member)
                .name(name)
                .information(information)
                .price(price)
                .build();
        this.productRepository.save(product);
    }

    public Product getProduct(Long productId) {
        Optional<Product> _product = this.productRepository.findById(productId);
        if (_product.isEmpty()) {
            return null;
        }
        return _product.get();
    }
}
