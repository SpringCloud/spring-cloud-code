package cn.springcloud.book;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import cn.springcloud.book.extension.MyDiscoveryEnabledAdapter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class DiscoveryApplicationZuul {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "zuul");

        new SpringApplicationBuilder(DiscoveryApplicationZuul.class).run(args);
    }

    @Bean
    public MyDiscoveryEnabledAdapter myDiscoveryEnabledAdapter() {
        return new MyDiscoveryEnabledAdapter();
    }
}