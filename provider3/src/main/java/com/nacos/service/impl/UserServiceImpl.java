package com.nacos.service.impl;

import com.nacos.mapper.UserMapper;
import com.nacos.pojo.TUser;
import com.nacos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public TUser loginUser(String uname, String pwd) {
        return userMapper.selectUser(uname, pwd);
    }
}
