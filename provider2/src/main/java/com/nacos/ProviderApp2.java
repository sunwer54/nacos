package com.nacos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //开启nacos的服务注册功能
@MapperScan("com.nacos.mapper")
public class ProviderApp2 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApp2.class,args);
    }
}
