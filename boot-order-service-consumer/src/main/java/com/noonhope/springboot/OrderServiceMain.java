package com.noonhope.springboot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 开启dubbo
 * 开启服务容错
 *
 * @author onlystatic
 * @date 2020-11-14 04:37 PM
 */
@EnableDubbo
@EnableHystrix
@SpringBootApplication
public class OrderServiceMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceMain.class, args);
    }
}
