package com.cskaoyan.cinema.rest;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.cskaoyan.cinema"})
@EnableDubboConfig
public class GunsPromoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GunsPromoApplication.class, args);
    }
}
