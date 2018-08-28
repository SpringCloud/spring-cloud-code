package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Ch32EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch32EurekaClientApplication.class, args);
	}
}
