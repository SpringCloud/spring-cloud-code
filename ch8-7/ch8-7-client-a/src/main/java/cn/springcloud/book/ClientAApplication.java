package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class ClientAApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(ClientAApplication.class, args);
    }
    
    @Bean
	public Docket swaggerPersonApi10() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("cn.springcloud.book.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(
						new ApiInfoBuilder()
						.version("1.0")
						.title("Original Service API")
						.description("Original Service API v1.0")
						.build()
				);
	}
	
}