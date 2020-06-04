package com.xzw.springcloud.service;

import com.xzw.springcloud.entities.CommonResult;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService1 implements PaymentService {
    @Override
    public CommonResult get(Integer id) {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode(444);
        commonResult.setMessage("连接超时，请稍后再试！");
        return commonResult;
    }
}
