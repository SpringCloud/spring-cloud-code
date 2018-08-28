package cn.springcloud.book.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;

public class ErrorFilter extends ZuulFilter {
	
	@Override
	public String filterType() {
		return ERROR_TYPE;
	}
	
	@Override
	public int filterOrder() {
		return -1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		System.out.println("这是ErrorFilter");
		
		return null;
	}

}
