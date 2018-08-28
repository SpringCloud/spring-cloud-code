package cn.springcloud.book.eureka.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class TestController {

	/**
	 * 测试Cookies路由断言工厂
	 * @param request
	 * @param response
	 * @return
	 */
	@GetMapping("/test/cookie")
	public String testGateway(HttpServletRequest request, HttpServletResponse response){
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				System.out.println(cookie.getName()+":"+cookie.getValue());
			}
		}
		return "Spring Cloud Gateway,Hello world!";
	}


	/**
	 * 测试Head路由断言工厂
	 * @param request
	 * @param response
	 * @return
	 */
	@GetMapping("/test/head")
	public String testGatewayHead(HttpServletRequest request, HttpServletResponse response){
		String head=request.getHeader("X-Request-Id");
		return "return head info:"+head;
	}
}
