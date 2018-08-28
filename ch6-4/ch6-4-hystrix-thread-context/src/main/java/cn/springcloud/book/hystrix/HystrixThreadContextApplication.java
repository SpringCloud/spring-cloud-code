package cn.springcloud.book.hystrix;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * spring cloud 中国社区
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class HystrixThreadContextApplication {

	@Bean
	@LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
    public static void main(String[] args) {
        SpringApplication.run(HystrixThreadContextApplication.class, args);
    }
    
}
