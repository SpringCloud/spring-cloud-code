package cn.springcloud.book.sleuth.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * 用户交互接口,分别使用feign,restTemplate,新线程的方式请求服务端
 */
@RestController
public class ConsumerController {
    private static final Logger log = LoggerFactory.getLogger(ConsumerController.class);
    @Autowired
    private HelloService helloService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ExecutorService executorService;

    @GetMapping("/helloByFeign")
    public String helloByFeign(String name){
        log.info("client sent. Feign 方式, 参数: {}",name);

        String result = helloService.sayHello(name);

        log.info("client received. Feign 方式, 结果: {}",result);
        return result;
    }

    @GetMapping("/helloByRestTemplate")
    public String helloByRestTemplate(String name){
        log.info("client sent. RestTemplate方式, 参数: {}",name);

        String url = "http://localhost:8082/sayHello?name="+name;
        String result = restTemplate.getForObject(url,String.class);

        log.info("client received. RestTemplate方式, 结果: {}",result);
        return result;
    }

    @GetMapping("/helloByNewThread")
    public String hello(String name) throws ExecutionException, InterruptedException {
        log.info("client sent. 子线程方式, 参数: {}",name);

        Future future = executorService.submit(() -> {
            log.info("client sent. 进入子线程, 参数: {}",name);
            String result = helloService.sayHello(name);
            return result;
        });
        String result = (String) future.get();
        log.info("client received. 返回主线程, 结果: {}",result);
        return result;
    }
}
