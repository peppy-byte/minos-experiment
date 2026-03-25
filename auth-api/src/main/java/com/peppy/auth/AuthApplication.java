package com.peppy.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 认证服务启动类
 *
 * @author liu.gang
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "com.peppy.auth.feign")
public class AuthApplication {

    /**
     * 启动方法
     *
     * @param args 入参
     */
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

}
