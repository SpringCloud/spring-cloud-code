package cn.springcloud.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
	
    @Autowired
    private RestTemplate restTemplate;

	@GetMapping("/add")
	public String add(Integer a, Integer b) {
		String result = restTemplate
				.getForObject("http://CLIENT-A/add?a=" + a + "&b=" + b, String.class);
		System.out.println(result);
		return result;
	}
}