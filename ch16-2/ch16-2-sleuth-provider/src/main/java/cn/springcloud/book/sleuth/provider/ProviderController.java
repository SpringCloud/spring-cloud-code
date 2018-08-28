package cn.springcloud.book.sleuth.provider;

import brave.propagation.ExtraFieldPropagation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * sleuth-provider 对外服务接口
 */
@RestController
public class ProviderController {

    @GetMapping("/sayHello")
    public String hello(String name){
        return  "hello, "+name+",SessionId is "+ ExtraFieldPropagation.get("SessionId");
    }
}
