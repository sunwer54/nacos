package com.nacos.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * nacos配置中心可以用来管理不同的微服务中需要共同使用的数据
 * 实现修改一处即修改了所有的
 */
@RestController
@RefreshScope //开启动态更新(nacos config中的数据修改了，这里会动态的更新)
public class ConfigController {
    /**
     * 从nacos的配置中心动态的取值
     */
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private String age;
    @RequestMapping("/testConfigCentre")
    public String testConCen(){
        return  "姓名："+name+"---年龄："+age;
    }
}
