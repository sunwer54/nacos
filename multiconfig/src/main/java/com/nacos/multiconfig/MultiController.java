package com.nacos.multiconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * nacos配置中心可以用来管理不同的微服务中需要共同使用的数据
 * 实现修改一处即修改了所有的
 */
@Controller
@RefreshScope //开启动态更新(nacos config中的数据修改了，这里会动态的更新)
public class MultiController {
    /**
     * 从nacos的配置中心动态的取值
     */
    @Value("${manager.mid}")
    private String mid;
    @Value("${manager.mname}")
    private String mname;
    @Value("${manager.mpwd}")
    private String mpwd;
    @Value("${user.uid}")
    private String uid;
    @Value("${user.uname}")
    private String uname;
    @Value("${user.upwd}")
    private String upwd;

    @RequestMapping("/testMultiConfig")
    @ResponseBody
    public String testMultiConfig(){
        return mid+"<br/>"+
               mname+"<br/>"+
               mpwd+"<br/>"+
               uid+"<br/>"+
               uname+"<br/>"+
               upwd;

    }
}
