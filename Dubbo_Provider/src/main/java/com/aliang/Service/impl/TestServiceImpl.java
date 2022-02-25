package com.aliang.Service.impl;

import com.aliang.Service.TestService;
import com.alibaba.dubbo.config.annotation.Service;

@Service //使用Dubbo的Service注解，用于将服务发布到注册中心
public class TestServiceImpl implements TestService {

    @Override
    public String test(String name) {
        return name + "欢迎访问";
    }
}
