package cn.springcloud.book.filter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

@Component
public class ZuulFallback implements FallbackProvider{

	@Override
	public String getRoute() {
		return "*"; //可以配置指定的路由，值为serviceId，如sc-user-service
	}

	@Override
	public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
		 return new ClientHttpResponse() {
	            @Override
	            public HttpStatus getStatusCode() throws IOException {
	                return HttpStatus.INTERNAL_SERVER_ERROR;
	            }

	            @Override
	            public String getStatusText() throws IOException {
	                return HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase();
	            }

	            @Override
	            public void close() {
	            }
	           
	            @Override
	            public InputStream getBody() throws IOException {
	            	  //定义自己的错误信息
	                return new ByteArrayInputStream(("microservice error").getBytes());
	            }

	            @Override
	            public HttpHeaders getHeaders() {
	                HttpHeaders headers = new HttpHeaders();
	                headers.setContentType(MediaType.APPLICATION_JSON);
	                return headers;
	            }

				@Override
				public int getRawStatusCode() throws IOException {
					// TODO Auto-generated method stub
					return HttpStatus.INTERNAL_SERVER_ERROR.value();
				}
	        };

	}

}
