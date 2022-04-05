package com.nacos.api;

import com.nacos.pojo.TUser;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserServiceApi {
    /**
     *  使用 Post 请求传递参数。
     * @param uname 请求参数之前必须加@RequestParam(value = "name") ,参数名不能省略
     * @param pwd 请求参数之前必须加@RequestParam(value = "pwd") ,参数名不能省略
     * 注意：@PostMapping(value = "/loginuser")中不能加上produces = "text/html;charset=utf-8"
     *      否则服务端服务列表中的参数与消费端传入的参数不匹配，出现报错：
     *      No converter for [class com.nacos.pojo.TUser] with preset Content-Type null
     *      （没有用于[类com.nacos.pojo]的转换器。预设内容类型为空）
     * @return
     */
    @PostMapping(value = "/loginuser")
    public TUser loginUser(@RequestParam("uname") String uname, @RequestParam("pwd") String pwd);

    /**
     * 整体接受浏览器体提交的参数
     * @SpringQueryMap 这个注解的作用是吧pojo解析成k=v&k=v的参数格式，可以用来传递自定义对象参数
     * @return
     */
    @PostMapping(value = "/loginUserByAcceptObj")
    public TUser loginUserByAcceptObj(@SpringQueryMap TUser tUser);
}
