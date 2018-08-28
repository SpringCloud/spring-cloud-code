package cn.springcloud.book.filter;

import com.alibaba.fastjson.JSONObject;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import cn.springcloud.book.common.exception.BaseException;
import cn.springcloud.book.common.exception.BaseExceptionBody;
import cn.springcloud.book.common.exception.CommonError;
import cn.springcloud.book.common.util.AuthUtil;
import cn.springcloud.book.common.vo.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * 鉴权filter
 */
public class AuthFilter extends ZuulFilter {
	private static final Logger logger = LoggerFactory.getLogger(AuthFilter.class);
	
	@Override
	public boolean shouldFilter() {
		// 判断是否需要进行处理
		return true;
	}

	@Override
	public Object run() {
		RequestContext rc = RequestContext.getCurrentContext();
		authUser(rc);
		return null;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}
	
	private static Map<String, String> httpRequestToMap(HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        Map<String, String> headers = new HashMap<>();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            headers.put(headerName, request.getHeader(headerName));
        }
        return headers;
    }
	
	public static void authUser(RequestContext ctx) {
		HttpServletRequest request = ctx.getRequest();
		Map<String, String> header = httpRequestToMap(request);
		String userId = header.get(User.CONTEXT_KEY_USERID);
		if(StringUtils.isEmpty(userId)) {
			try {
				BaseException BaseException = new BaseException(CommonError.AUTH_EMPTY_ERROR.getCode(),CommonError.AUTH_EMPTY_ERROR.getCodeEn(),CommonError.AUTH_EMPTY_ERROR.getMessage(),1L);
				BaseExceptionBody errorBody = new BaseExceptionBody(BaseException);
				ctx.setSendZuulResponse(false);
				ctx.setResponseStatusCode(401);
				ctx.setResponseBody(JSONObject.toJSON(errorBody).toString());
			} catch (Exception e) {
				logger.error("println message error",e);
			}
		}else {
			for (Map.Entry<String, String> entry : header.entrySet()) {
				ctx.addZuulRequestHeader(entry.getKey(), entry.getValue());
			}
		}
	}
	
}
