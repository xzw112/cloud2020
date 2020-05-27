package com.xzw.springcloud.controller;

import com.xzw.springcloud.entities.CommonResult;
import com.xzw.springcloud.entities.Payment;
import com.xzw.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;

    @PostMapping(value = "/payment/add")
    public CommonResult add(Payment payment){
        payment.setId(UUID.randomUUID().toString());
        int result = paymentService.add(payment);
        log.info("******插入结果：" + result + "******");
        if (result > 0) {
            return new CommonResult(200, port + "新增成功！", result);
        } else {
            return new CommonResult(444, port + "新增失败！", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") String id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果：" + payment + "*****");
        if (payment != null) {
            return new CommonResult(200, port + "查询成功", payment);
        } else {
            return new CommonResult(444, port + "查询失败", null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String element: services) {
            log.info("*****element******" + element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" +instance.getPort() + "\t" +instance.getUri());
        }
        return this.discoveryClient;
    }
}
