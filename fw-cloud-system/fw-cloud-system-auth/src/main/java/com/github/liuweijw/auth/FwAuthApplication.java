package com.github.liuweijw.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * 
 * Auth Server 中心
 * 
 * @author liuweijw
 * 
 */
@SpringBootApplication
@EnableResourceServer // 认证中心，以及获取用户信息
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan(basePackages = {"com.github.liuweijw.auth", "com.github.liuweijw.core"})
public class FwAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(FwAuthApplication.class, args);
    }
    
}
