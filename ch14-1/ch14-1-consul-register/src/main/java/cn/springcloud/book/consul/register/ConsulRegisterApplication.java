package cn.springcloud.book.consul.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * consul-server 的启动主类
 * 为了简化代码，我们将 Controller 代码放在主类中，实际工作中不建议这么做
 */
@RestController
@SpringBootApplication
public class ConsulRegisterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulRegisterApplication.class,args);
    }
    /**
     * 这里我们不使用默认的健康检测, 而是使用自己定义的接口
     * @return SUCCESS
     */
    @GetMapping("/health")
    public String health(){
        return "SUCCESS";
    }
}
