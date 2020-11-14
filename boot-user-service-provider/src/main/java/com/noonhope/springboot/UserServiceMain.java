package com.noonhope.springboot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author onlystatic
 * @date 2020-11-14 04:30 PM
 */
@SpringBootApplication
@EnableDubbo
public class UserServiceMain {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceMain.class, args);
    }
}
