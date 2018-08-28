package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by caibosi on 2018-07-29.
 */
@SpringBootApplication
@ComponentScan(basePackages = "org.apache.servicecomb.saga")
public class SagaAlphaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SagaAlphaServerApplication.class, args);
    }
}
