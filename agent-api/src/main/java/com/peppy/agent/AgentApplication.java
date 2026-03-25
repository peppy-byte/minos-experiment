package com.peppy.agent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务启动类
 *
 * @author liu.gang
 */
@SpringBootApplication
public class AgentApplication {

    /**
     * 启动方法
     *
     * @param args 入参
     */
    public static void main(String[] args) {
        SpringApplication.run(AgentApplication.class, args);
    }

}
