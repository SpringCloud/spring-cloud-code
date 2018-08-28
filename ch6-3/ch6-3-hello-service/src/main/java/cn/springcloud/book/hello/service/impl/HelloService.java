package cn.springcloud.book.hello.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.springcloud.book.hello.service.IHelloService;
import cn.springcloud.book.hello.service.dataservice.ProviderService;

/**
 * 
 */
@Component
public class HelloService implements IHelloService{
	
    @Autowired
    private ProviderService dataService;

	@Override
	public List<String> getProviderData() {
		return dataService.getProviderData();
	}

}
