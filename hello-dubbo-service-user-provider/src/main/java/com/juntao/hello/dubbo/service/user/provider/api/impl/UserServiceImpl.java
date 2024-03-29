package com.juntao.hello.dubbo.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.juntao.hello.dubbo.service.user.api.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service(version="${user.service.version}")
public class UserServiceImpl implements UserService {

    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")})  //设置了阈值为10秒20次
    @Override
    public String sayHi() {
//        return "Hello Dubbo";
        throw new RuntimeException("Exception to show hystrix enabled.");
    }
}
