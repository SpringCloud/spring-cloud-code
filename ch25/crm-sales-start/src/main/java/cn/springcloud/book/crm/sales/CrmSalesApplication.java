package cn.springcloud.book.crm.sales;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot应用的入口类
 *
 * @author xujin
 */
@MapperScan("cn.springcloud.book.crm.sales.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class CrmSalesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmSalesApplication.class, args);
    }
}
