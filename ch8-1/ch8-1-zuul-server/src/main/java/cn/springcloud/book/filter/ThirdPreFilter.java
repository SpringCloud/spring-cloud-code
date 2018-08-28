package cn.springcloud.book.filter;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class ThirdPreFilter extends ZuulFilter {
	
	@Override
	public String filterType() {
		return PRE_TYPE;
	}
	
	@Override
	public int filterOrder() {
		return 3;
	}

	@Override
	public boolean shouldFilter() {
		RequestContext ctx = RequestContext.getCurrentContext();
		//从上下文获取logic-is-success值，用于判断此Filter是否执行
		return (boolean)ctx.get("logic-is-success");
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("这是ThirdPreFilter！");
		//从RequestContext获取上下文
		RequestContext ctx = RequestContext.getCurrentContext();
		//从上下文获取HttpServletRequest
		HttpServletRequest request = ctx.getRequest();
		//从request尝试获取b参数值
		String b = request.getParameter("b");
		//如果b参数值为空则进入此逻辑
		if (null == b) {
			//对该请求禁止路由，也就是禁止访问下游服务
			ctx.setSendZuulResponse(false);
			//设定responseBody供PostFilter使用
			ctx.setResponseBody("{\"status\":500,\"message\":\"b参数为空！\"}");
			//logic-is-success保存于上下文，作为同类型下游Filter的执行开关，假定后续还有自定义Filter当设置此值
			ctx.set("logic-is-success", false);
			//到这里此Filter逻辑结束
			return null;
		}
		return null;
	}
}
