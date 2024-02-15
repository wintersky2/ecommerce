package com.example.ecommerce.domain.rebate.service;

import com.example.ecommerce.domain.rebate.repository.RebateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RebateService {
    private final RebateRepository rebateRepository;
}
