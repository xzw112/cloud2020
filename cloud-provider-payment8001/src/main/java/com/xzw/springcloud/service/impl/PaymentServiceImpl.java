package com.xzw.springcloud.service.impl;

import com.xzw.springcloud.dao.PaymentDao;
import com.xzw.springcloud.entities.Payment;
import com.xzw.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int add(Payment payment) {
        return paymentDao.add(payment);
    }

    @Override
    public Payment getPaymentById(String id) {
        return paymentDao.getPaymentById(id);
    }
}
