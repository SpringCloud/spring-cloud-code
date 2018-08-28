package cn.springcloud.book.feign.controller;

import cn.springcloud.book.feign.model.OrderModel;
import cn.springcloud.book.feign.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    // 注入服务提供者,远程的Http服务
    @Autowired
    private UserFeignService userFeignService;

    // 服务消费者对位提供的服务
    @GetMapping("/consumer/feign")
    public String findByIdByEurekaServer() {
        return userFeignService.helloFeign();

    }

}
