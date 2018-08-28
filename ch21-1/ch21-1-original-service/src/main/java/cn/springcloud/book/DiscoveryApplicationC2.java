package cn.springcloud.book;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DiscoveryApplicationC2 {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "c2");

        new SpringApplicationBuilder(DiscoveryApplicationC2.class).run(args);
    }
}