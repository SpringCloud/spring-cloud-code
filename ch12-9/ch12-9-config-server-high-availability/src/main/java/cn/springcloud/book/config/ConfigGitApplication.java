package cn.springcloud.book.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zunfa.zhong
 * @date: 2018-7-7
 * @time: 21:30:10
 * @description :  配置的启动类, 并且作为一个服务注册到eureka 上
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigGitApplication.class, args);

    }
}
