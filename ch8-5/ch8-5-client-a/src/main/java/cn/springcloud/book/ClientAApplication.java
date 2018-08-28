package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientAApplication {
	//--spring.profiles.active=node1，每次启动将node1改为node2或node3，就能启动多个服务实例
    public static void main(String[] args) {
        SpringApplication.run(ClientAApplication.class, "--spring.profiles.active=node3");
    }
}
