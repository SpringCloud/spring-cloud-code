package cn.springcloud.book.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/add")
	public String add(Integer a, Integer b, HttpServletRequest request){
		return "service client-a, port: " + request.getServerPort() + ", result=" + (a + b);
	}
	
	@GetMapping("/a/add")
	public Integer aadd(Integer a, Integer b){
		return a + b;
	}
	
	@GetMapping("/sub")
	public Integer sub(Integer a, Integer b){
		return a - b;
	}
	
	@GetMapping("/mul")
	public String mul(Integer a, Integer b){
		System.out.println("进入client-a!");
		return "client-a-" + a * b;
	}
	
	@GetMapping("/div")
	public Integer div(Integer a, Integer b){
		return a / b;
	}
}
