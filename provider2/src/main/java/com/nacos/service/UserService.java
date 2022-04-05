package com.nacos.service;

import com.nacos.pojo.TUser;

public interface UserService {
    public TUser loginUser(String uname, String pwd);
}
