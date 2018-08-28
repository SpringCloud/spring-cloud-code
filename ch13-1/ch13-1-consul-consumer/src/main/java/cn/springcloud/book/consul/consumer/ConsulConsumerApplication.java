package cn.springcloud.book.consul.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * consul-consumer 的启动主类
 * 为了简化代码，我们将 Controller 代码放在主类中，实际工作中不建议这么做
 */
@RestController
@SpringBootApplication
@EnableFeignClients
public class ConsulConsumerApplication {

    /** 调用 hello 服务*/
    @Autowired
    private HelloService helloService;

    @GetMapping("/actuator/health")
    public String health(){
        return "SUCCESS";
    }

    /** 接收前端传来的参数，调用远程接口，并返回调用结果 */
    @GetMapping("/hello")
    public String hello(String name){
        return helloService.sayHello(name);
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerApplication.class,args);
    }
}
