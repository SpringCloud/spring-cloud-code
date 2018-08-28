package cn.springcloud.book.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.springcloud.book.common.intercepter.UserContextHolder;

@RestController
public class ProviderController {
	
	@GetMapping("/provider/test")
	public String test(HttpServletRequest request) {
		System.out.println("auth success, the user is : " + UserContextHolder.currentUser().getUserName());
		System.out.println("----------------success access provider service----------------");
		return "success access provider service!";
	}
}
