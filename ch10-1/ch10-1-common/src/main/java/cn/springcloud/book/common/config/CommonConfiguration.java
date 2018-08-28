package cn.springcloud.book.common.config;

import feign.Feign;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.Controller;

import com.netflix.hystrix.strategy.HystrixPlugins;
import com.netflix.hystrix.strategy.concurrency.HystrixConcurrencyStrategy;

import cn.springcloud.book.common.context.SpringCloudHystrixConcurrencyStrategy;
import cn.springcloud.book.common.intercepter.FeignUserContextInterceptor;
import cn.springcloud.book.common.intercepter.RestTemplateUserContextInterceptor;
import cn.springcloud.book.common.intercepter.UserContextInterceptor;

@Configuration
@EnableWebMvc
public class CommonConfiguration extends WebMvcConfigurerAdapter{
	/**
	 * 请求拦截器
	 */
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserContextInterceptor());
    }
	
    /**
     * 创建Feign请求拦截器，在发送请求前设置认证的用户上下文信息
     */
    @Bean
    @ConditionalOnClass(Feign.class)
    public FeignUserContextInterceptor feignTokenInterceptor() {
        return new FeignUserContextInterceptor();
    }

    /**
     * RestTemplate拦截器
     * @return
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add(new RestTemplateUserContextInterceptor());
        return restTemplate;
    }
    
    @Bean
	public SpringCloudHystrixConcurrencyStrategy springCloudHystrixConcurrencyStrategy() {
		return new SpringCloudHystrixConcurrencyStrategy();
	}
   
}
