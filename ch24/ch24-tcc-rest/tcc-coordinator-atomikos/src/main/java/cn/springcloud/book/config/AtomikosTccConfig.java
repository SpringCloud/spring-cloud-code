package cn.springcloud.book.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * com/atomikos/transactions/4.0.6/transactions-4.0.6.jar!/transactions-defaults.properties
 * com/atomikos/transactions-tcc-rest/4.0.6/transactions-tcc-rest-4.0.6-sources.jar!/com/atomikos/icatch/tcc/rest/Server.java
 * Created by caibosi on 2018-07-28.
 */
@Configuration
public class AtomikosTccConfig {

    @Bean
    public AtomikosTccSpringAdapter atomikosTccSpringAdpater(){
        return new AtomikosTccSpringAdapter();
    }

    public static class AtomikosTccSpringAdapter {
        @PostConstruct
        public void start(){
            com.atomikos.icatch.config.Configuration.init();
        }

        @PreDestroy
        public void shutdown(){
            com.atomikos.icatch.config.Configuration.shutdown(false);
        }
    }
}
