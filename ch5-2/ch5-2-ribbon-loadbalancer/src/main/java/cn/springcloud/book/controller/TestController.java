package cn.springcloud.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
	
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private LoadBalancerClient lbClient;

	@GetMapping("/add")
	public String adda(Integer a, Integer b) {
		String result = restTemplate
				.getForObject("http://CLIENT-A/add?a=" + a + "&b=" + b, String.class);
		System.out.println(result);
		return result;
	}
	
	@GetMapping("/add1")
	public void add1(Integer a, Integer b) {
		ServiceInstance instance = this.lbClient.choose("client-a");
		System.out.println(instance.getHost()+":"+instance.getPort());
	}
	
	@GetMapping("/add2")
	public void add2(Integer a, Integer b) {
		ServiceInstance instance = this.lbClient.choose("client-b");
		System.out.println(instance.getHost()+":"+instance.getPort());
	}
}