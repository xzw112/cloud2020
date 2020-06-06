package com.xzw.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 动态刷新gitHub中央配置
public class ConfigClientController {
    @Value("${config.info}")
    private String port;

    @GetMapping("/getGitHubPort")
    public String getGitHubPort() {
        return "gitHub上的端口为：" + port;
    }

}
