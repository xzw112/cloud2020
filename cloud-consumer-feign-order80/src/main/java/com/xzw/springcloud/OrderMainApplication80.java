package com.xzw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderMainApplication80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMainApplication80.class, args);
    }
}
