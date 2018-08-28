package cn.springcloud.book.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * @author www.springcloud.cn
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClientAApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(ClientAApplication.class, args);
    }
}
