package com.nacos.mapper;

import com.nacos.pojo.TUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    @Select("select * from t_user where uname = #{param1} and pwd = #{param2}")
    public TUser selectUser(String uname, String pwd);
}
