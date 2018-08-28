package cn.springcloud.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/client")
	public String add(Integer a, Integer b){
		return "本地跳转：" + (a + b);
	}
}