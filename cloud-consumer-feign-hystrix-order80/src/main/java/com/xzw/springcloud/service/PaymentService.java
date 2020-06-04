package com.xzw.springcloud.service;

import com.xzw.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE", fallback = PaymentFallbackService1.class)
public interface PaymentService {
    @GetMapping("/payment/get/{id}")
    CommonResult get(@PathVariable("id") Integer id);
}
