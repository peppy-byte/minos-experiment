package com.peppy.rag;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author liu.gang
 */
@SpringBootApplication
@RequiredArgsConstructor
public class RagApplication {

    /**
     * 启动方法
     *
     * @param args 入参
     */
    public static void main(String[] args) {
        SpringApplication.run(RagApplication.class, args);
    }
}
