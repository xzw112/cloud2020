package com.xzw.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {

    @GetMapping("testA")
    public String testA(){
        return "======testA=======";
    }

    @GetMapping("testB")
    public String testB(){
        return "======testB=======";
    }
}
