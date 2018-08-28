package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ch2221ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch2221ConfigServerApplication.class, args);
    }
}
