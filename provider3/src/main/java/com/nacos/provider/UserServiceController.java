package com.nacos.provider;

import com.nacos.api.UserServiceApi;
import com.nacos.pojo.TUser;
import com.nacos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController implements UserServiceApi {
    @Autowired
    private UserService userService;
    @Override
    public TUser loginUser(String uname, String pwd) {
        return userService.loginUser(uname, pwd);
    }

    @Override
    public TUser loginUserByAcceptObj(TUser tUser) {
        System.out.println("provider3提供服务------>");
        return userService.loginUser(tUser.getUname(),tUser.getPwd());
    }
}
