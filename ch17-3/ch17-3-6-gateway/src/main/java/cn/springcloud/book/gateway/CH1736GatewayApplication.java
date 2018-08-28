package cn.springcloud.book.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class CH1736GatewayApplication {

	@Bean
	public RouteLocator retryRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("retry_route", r -> r.path("/test/retry")
						.filters(f ->f.retry(config -> config.setRetries(2).setStatuses(HttpStatus.INTERNAL_SERVER_ERROR)))
						.uri("http://localhost:8071/retry?key=abc&count=2"))
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(CH1736GatewayApplication.class, args);
	}
}
