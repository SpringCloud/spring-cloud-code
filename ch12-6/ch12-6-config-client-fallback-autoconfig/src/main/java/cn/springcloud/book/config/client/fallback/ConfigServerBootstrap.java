package cn.springcloud.book.config.client.fallback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.client.ConfigClientProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author: zzf
 * @date: 2018/6/17
 * @time: 1:22
 * @description : 客户端自动配置依赖启动
 */

@Configuration
@EnableConfigurationProperties
@PropertySource(value = {"configClient.properties", "file:${spring.cloud.config.fallbackLocation:}/fallback.properties"}, ignoreResourceNotFound = true)
public class ConfigServerBootstrap {

    public static final String FALLBACK_FILE_NAME = "fallback.properties";

    @Autowired
    private ConfigurableEnvironment environment;

    @Value("${spring.cloud.config.fallbackLocation:}")
    private String fallbackLocation;

    @Bean
    public ConfigClientProperties configClientProperties(){

        ConfigClientProperties clientProperties = new ConfigClientProperties(this.environment);
        clientProperties.setEnabled(false);
        return clientProperties;
    }

    @Bean
    public FallbackableConfigServicePropertySourceLocator fallbackableConfigServicePropertySourceLocator(){

        ConfigClientProperties client = configClientProperties();
        FallbackableConfigServicePropertySourceLocator fallbackableConfigServicePropertySourceLocator
                = new FallbackableConfigServicePropertySourceLocator(client, fallbackLocation);
        return fallbackableConfigServicePropertySourceLocator;
    }
}
