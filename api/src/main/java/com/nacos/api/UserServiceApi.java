package com.nacos.api;

import com.nacos.pojo.TUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserServiceApi {
    /**
     *  使用 Post 请求传递参数。
     * @param uname 请求参数之前必须加@RequestParam(value = "name") ,参数名不能省略
     * @param pwd 请求参数之前必须加@RequestParam(value = "pwd") ,参数名不能省略
     * @return
     */
    @PostMapping(value = "/loginuser")
    public TUser loginUser(@RequestParam("uname") String uname, @RequestParam("pwd") String pwd);
}
