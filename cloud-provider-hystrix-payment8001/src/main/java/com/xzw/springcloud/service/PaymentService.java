package com.xzw.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {
    // 正常访问
    public String paymentInfo_ok(Integer id){
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_ok, id:" + id + "\t"+"O(∩_∩)O哈哈~";
    }

    public String paymentInfo_timeout(Integer id){
        int num = 3;
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_timeout, id:" + id + "\t"+"O(∩_∩)O哈哈~耗时" + num + "秒钟";
    }
}
