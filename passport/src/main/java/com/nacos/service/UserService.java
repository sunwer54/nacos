package com.nacos.service;

import com.nacos.api.UserServiceApi;
import org.springframework.cloud.openfeign.FeignClient;
/**
 *
 * @FeignClient("provider-service")通过指定服务名称订阅远程服务
 * FeignClient底层发送的是http请求
 * http://provider-service/loginuser?name=小丽&pwd=123
 */
@FeignClient("provider-service")
public interface UserService extends UserServiceApi {
}
