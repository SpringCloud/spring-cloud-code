package cn.springcloud.book.crm.sales.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.xujin.halo.boot.Bootstrap;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xujin
 */
@Configuration
public class HaloConfig {

    @Bean(initMethod = "init")
    public Bootstrap bootstrap() {
        Bootstrap bootstrap = new Bootstrap();
        List<String> packages = new ArrayList<>();
        packages.add("cn.springcloud.book.crm.sales.command");
        packages.add("cn.springcloud.book.crm.sales.interceptor");
        packages.add("cn.springcloud.book.crm.sales.validator");
        packages.add("cn.springcloud.book.crm.sales.event.handler");
        packages.add("cn.springcloud.book.crm.marketing.domain.customer.rule");
        packages.add("cn.springcloud.book.crm.sales.domain.customer.convertor");
        packages.add("cn.springcloud.book.crm.sales.domain.customer.rule");
        bootstrap.setPackages(packages);
        return bootstrap;
    }
}
