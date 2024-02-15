package com.example.ecommerce.domain.rebate.controller;

import com.example.ecommerce.domain.rebate.service.RebateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class RebateController {
    private final RebateService rebateService;
}
