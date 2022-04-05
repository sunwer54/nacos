package com.nacos.passport;

import com.nacos.pojo.TUser;
import com.nacos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PassportController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/loginuser",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String loginUser(String uname,String pwd){
        System.out.println(uname+pwd);
        TUser user = userService.loginUser(uname, pwd);
        System.out.println(user);
        if (user!=null){
            return "登录成功，欢迎"+user.getUname();
        }
        return "登录失败";
    }
}
