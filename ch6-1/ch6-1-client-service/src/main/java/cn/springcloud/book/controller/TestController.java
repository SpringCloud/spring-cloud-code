package cn.springcloud.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.springcloud.book.service.IUserService;

@RestController
public class TestController {

	@Autowired
	private IUserService userService;
	
	@GetMapping("/getUser")
	public String getUser(@RequestParam String username) throws Exception{
		return userService.getUser(username);
	}
}
