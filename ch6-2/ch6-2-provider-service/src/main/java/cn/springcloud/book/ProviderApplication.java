package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author www.springcloud.cn
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
