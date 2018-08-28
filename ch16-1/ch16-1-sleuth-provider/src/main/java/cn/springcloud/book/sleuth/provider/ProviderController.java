package cn.springcloud.book.sleuth.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * sleuth-provider 对外服务接口
 */
@RestController
public class ProviderController {
    private static final Logger log = LoggerFactory.getLogger(ProviderController.class);
    @GetMapping("/sayHello")
    public String hello(String name){
        log.info("server received. 参数: {}",name);
        String result = "hello, "+name;
        log.info("server sent. 结果: {}",result);
        return result;
    }
}
