package cn.springcloud.book.eureka.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String prefixpath(){
		return "https to Http";
	}

}
