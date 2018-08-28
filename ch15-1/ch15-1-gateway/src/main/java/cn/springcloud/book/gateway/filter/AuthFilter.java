package cn.springcloud.book.gateway.filter;

import java.net.URI;
import java.util.Map;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.support.ServerWebExchangeUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class AuthFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
    	Route gatewayUrl = exchange.getRequiredAttribute(ServerWebExchangeUtils.GATEWAY_ROUTE_ATTR);
    	URI uri = gatewayUrl.getUri();
    	ServerHttpRequest request = (ServerHttpRequest)exchange.getRequest();
    	HttpHeaders header = request.getHeaders();
    	String token = header.getFirst(JwtUtil.HEADER_AUTH);
    	Map<String,String> userMap = JwtUtil.validateToken(token);
    	ServerHttpRequest.Builder mutate = request.mutate();
    	if(userMap.get("user").equals("admin") || userMap.get("user").equals("spring") || userMap.get("user").equals("cloud")) {
    		mutate.header("x-user-id", userMap.get("id"));
        	mutate.header("x-user-name", userMap.get("user"));
        	mutate.header("x-user-serviceName", uri.getHost());
    	}else {
    		throw new PermissionException("user not exist, please check");
    	}
    	ServerHttpRequest buildReuqest =  mutate.build();
         return chain.filter(exchange.mutate().request(buildReuqest).build());
    }
}
