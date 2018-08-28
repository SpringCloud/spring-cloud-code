package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch34EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch34EurekaClientApplication.class, args);
	}
}
