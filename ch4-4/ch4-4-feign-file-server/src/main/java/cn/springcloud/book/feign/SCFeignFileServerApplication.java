package cn.springcloud.book.feign;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SCFeignFileServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SCFeignFileServerApplication.class, args);
    }
}