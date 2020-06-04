package com.xzw.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/getGitHubPort")
    public String getGitHubPort() {
        return "gitHub上的端口为：" + port;
    }
}