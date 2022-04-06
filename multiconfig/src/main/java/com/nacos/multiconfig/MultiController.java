package com.nacos.multiconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope
public class MultiController {
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
