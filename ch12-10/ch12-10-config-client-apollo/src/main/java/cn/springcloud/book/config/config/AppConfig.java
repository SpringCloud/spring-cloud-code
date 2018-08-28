package cn.springcloud.book.config.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Configuration;

/**
 * @author zunfa.zhong
 * @date 2018-7-15 19:44:44
 */
@Configuration
@EnableApolloConfig(value = "application", order = 10)
public class AppConfig {
}
