package cn.springcloud.book;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableResourceServer
@RestController
public class ClientAApplication extends ResourceServerConfigurerAdapter {
	
    public static void main(String[] args) {
        SpringApplication.run(ClientAApplication.class, args);
    }
    
	@RequestMapping("/test")
	public String test(HttpServletRequest request) {
		System.out.println("----------------header----------------");
		Enumeration headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String key = (String) headerNames.nextElement();
			System.out.println(key + ": " + request.getHeader(key));
		}
		System.out.println("----------------header----------------");
		return "hellooooooooooooooo!";
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/**").authenticated()
		.antMatchers(HttpMethod.GET, "/test")
		.hasAuthority("WRIGTH_READ");
	}

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		resources
		.resourceId("WRIGTH")
		.tokenStore(jwtTokenStore());
	}

	@Bean
	protected JwtAccessTokenConverter jwtTokenConverter() {
		JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
		converter.setSigningKey("springcloud123");
		return converter;
	}

	@Bean
	public TokenStore jwtTokenStore() {
		return new JwtTokenStore(jwtTokenConverter());
	}
}
