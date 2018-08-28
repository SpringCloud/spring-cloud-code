package cn.springcloud.book.consul.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * consul-config 启动类主类
 * 为了简化代码，我们将 Controller 和 配置代码放在主类中，实际工作中不建议这么做
 */
@SpringBootApplication
@RestController
@RefreshScope
public class ConsulConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulConfigApplication.class,args);
    }

    // 读取远程配置
    @Value("${foo.bar.name}")
    private String name;

    // 将配置展示在页面
    @GetMapping("/getName")
    public String getName(){
        return name;
    }
}
