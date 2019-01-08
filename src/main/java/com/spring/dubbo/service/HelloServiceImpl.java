package com.spring.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by wangjun on 2019/1/8.
 */


@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String SayHello(String name) {
        return "Hello , "+name;
    }
}
