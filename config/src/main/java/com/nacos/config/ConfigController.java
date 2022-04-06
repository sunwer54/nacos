package com.nacos.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private String age;
    @RequestMapping("/testConfigCentre")
    public String testConCen(){
        return  "姓名："+name+"---年龄："+age;
    }
}
