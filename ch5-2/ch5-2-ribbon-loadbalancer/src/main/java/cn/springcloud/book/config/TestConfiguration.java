package cn.springcloud.book.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
@AvoidScan
public class TestConfiguration {
	
	@Autowired
    IClientConfig config;

	@Bean
	public IRule ribbonRule(IClientConfig config) {
		return new RandomRule();
	}
}