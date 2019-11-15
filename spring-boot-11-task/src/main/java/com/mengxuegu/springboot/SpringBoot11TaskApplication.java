package com.mengxuegu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling//启动任务
@EnableAsync// 标识开启异步处理
@SpringBootApplication
public class SpringBoot11TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot11TaskApplication.class, args);




    }
}
