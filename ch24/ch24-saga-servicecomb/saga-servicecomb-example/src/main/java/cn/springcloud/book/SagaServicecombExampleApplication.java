package cn.springcloud.book;

import org.apache.servicecomb.saga.omega.spring.EnableOmega;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableOmega
public class SagaServicecombExampleApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SagaServicecombExampleApplication.class);
        app.setWebApplicationType(WebApplicationType.SERVLET);
        app.run(args);
    }
}
