package cn.springcloud.book.provider.controller;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "sc-hello-service")
public interface ConsumerService {
	
	@RequestMapping(value = "/helloService", method = RequestMethod.GET)
    public String getHelloServiceData();
}
