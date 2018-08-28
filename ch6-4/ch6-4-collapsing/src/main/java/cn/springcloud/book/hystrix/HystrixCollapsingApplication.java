package cn.springcloud.book.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * spring cloud中国社区
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class HystrixCollapsingApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixCollapsingApplication.class, args);
    }
   
}
