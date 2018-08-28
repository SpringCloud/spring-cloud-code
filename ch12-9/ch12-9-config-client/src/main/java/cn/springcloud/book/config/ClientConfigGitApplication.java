package cn.springcloud.book.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: zunfa.zhong
 * @date: 2018/7/7
 * @time: 22:45
 * @description : do some thing
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ClientConfigGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientConfigGitApplication.class, args);
    }
}
