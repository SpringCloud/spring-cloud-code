package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author www.springcloud.cn
 *
 */
@SpringBootApplication
@EnableHystrix
@EnableDiscoveryClient
public class ClientApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
