package cn.springcloud.book.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;

public class PostFilter extends ZuulFilter {
	
	@Override
	public String filterType() {
		return POST_TYPE;
	}
	
	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("这是PostFilter！");
		//从RequestContext获取上下文
		RequestContext ctx = RequestContext.getCurrentContext();
		//处理返回中文乱码
		ctx.getResponse().setCharacterEncoding("UTF-8");
		//获取上下文中保存的responseBody
		String responseBody = ctx.getResponseBody();
		//如果responseBody不为空，则说明流程有异常发生
		if (null != responseBody) {
			//设定返回状态码
			ctx.setResponseStatusCode(500);
			//替换响应报文
	        ctx.setResponseBody(responseBody);
		}
		return null;
	}
}
