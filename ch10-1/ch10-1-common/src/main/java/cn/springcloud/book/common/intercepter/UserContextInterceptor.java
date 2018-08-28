package cn.springcloud.book.common.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.springcloud.book.common.context.UserContextHolder;
import cn.springcloud.book.common.util.HttpConvertUtil;
import cn.springcloud.book.common.vo.User;

public class UserContextInterceptor implements HandlerInterceptor {
	private static final Logger log = LoggerFactory.getLogger(UserContextInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse respone, Object arg2) throws Exception {
		User user = new User(HttpConvertUtil.httpRequestToMap(request));
		if(StringUtils.isEmpty(user.getUserId()) && StringUtils.isEmpty(user.getUserName())) {
			log.error("the user is null, please access from gateway or check user info");
			return false;
		}
		UserContextHolder.set(user);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse respone, Object arg2, ModelAndView arg3)
			throws Exception {
		// DOING NOTHING
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse respone, Object arg2, Exception arg3)
			throws Exception {
		UserContextHolder.shutdown();
	}
	
	
	
}
