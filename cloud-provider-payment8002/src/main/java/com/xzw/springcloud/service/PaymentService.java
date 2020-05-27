package com.xzw.springcloud.service;

import com.xzw.springcloud.entities.Payment;

public interface PaymentService {

    int add(Payment payment);
    Payment getPaymentById(String id);
}
