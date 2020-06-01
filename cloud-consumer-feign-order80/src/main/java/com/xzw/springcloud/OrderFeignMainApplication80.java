package com.xzw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderFeignMainApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMainApplication80.class, args);
    }
}
