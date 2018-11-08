package cn.springcloud.book.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

@Configuration
public class ModifyRequestEntityFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		return PRE_DECORATION_FILTER_ORDER + 1;// =6
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		request.getParameterMap();
		Map<String, List<String>> requestQueryParams = ctx.getRequestQueryParams();
		if (requestQueryParams == null){
			requestQueryParams = new HashMap<>();
		}
		//这里添加新增参数的value，注意，只取list的0位
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("1wwww");
		requestQueryParams.put("test", arrayList);
		ctx.setRequestQueryParams(requestQueryParams);
		return null;
	}
}
