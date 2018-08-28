package cn.springcloud.book.service;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello at " + System.currentTimeMillis();
    }
}
