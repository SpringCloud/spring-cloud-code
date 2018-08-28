package cn.springcloud.book.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * Created by caibosi on 2018-08-02.
 */
@Component
public class DemoConsumer {

    @Reference
    private HelloService helloService;

    public String callHello(){
        return helloService.hello();
    }
}
