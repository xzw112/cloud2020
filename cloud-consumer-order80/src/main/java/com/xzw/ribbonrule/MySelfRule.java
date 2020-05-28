package com.xzw.ribbonrule;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均和策略
 *
 * ps：此类不能被 @ComponentScan扫描到，否则无效
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule(); // 定义负载均衡策略为： 随机
    }
}
