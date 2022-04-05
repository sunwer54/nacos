package com.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient //开启nacos的服务发现功能
@EnableFeignClients //开启openFeign服务(远程订阅服务)
public class PassportApp {
    public static void main(String[] args) {
        SpringApplication.run(PassportApp.class,args);
    }
}
