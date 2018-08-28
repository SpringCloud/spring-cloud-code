package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch31EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch31EurekaClientApplication.class, args);
    }
}
