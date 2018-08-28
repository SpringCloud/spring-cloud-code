package cn.springcloud.book.service;

import cn.springcloud.book.HelloService;

/**
 * Created by caibosi on 2018-08-02.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello at " + System.currentTimeMillis();
    }
}
