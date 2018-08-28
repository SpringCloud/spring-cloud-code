package cn.springcloud.book.filter;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class SecondPreFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		return 2;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("这是SecondPreFilter！");
		//从RequestContext获取上下文
		RequestContext ctx = RequestContext.getCurrentContext();
		//从上下文获取HttpServletRequest
		HttpServletRequest request = ctx.getRequest();
		//从request尝试获取a参数值
		String a = request.getParameter("a");
		//如果a参数值为空则进入此逻辑
		if (null == a) {
			//对该请求禁止路由，也就是禁止访问下游服务
			ctx.setSendZuulResponse(false);
			//设定responseBody供PostFilter使用
			ctx.setResponseBody("{\"status\":500,\"message\":\"a参数为空！\"}");
			//logic-is-success保存于上下文，作为同类型下游Filter的执行开关
			ctx.set("logic-is-success", false);
			//到这里此Filter逻辑结束
			return null;
		}
		//设置避免报空
		ctx.set("logic-is-success", true);
		return null;
	}
}
