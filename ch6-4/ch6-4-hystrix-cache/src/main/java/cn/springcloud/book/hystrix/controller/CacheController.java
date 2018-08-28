package cn.springcloud.book.hystrix.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.springcloud.book.hystrix.service.HelloCommand;
import cn.springcloud.book.hystrix.service.IHelloService;

@RestController
public class CacheController {
	private static final Logger logger = LoggerFactory.getLogger(CacheController.class);
	
	@Autowired
	private IHelloService helloService;
	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * 缓存
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
	public String getUserId(@PathVariable("id") Integer id) {
		helloService.hello(id);
		helloService.hello(id);
	    return "getUser success";
	}
	
	/**
	 * 缓存更新测试
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getUserIdUpdate/{id}", method = RequestMethod.GET)
	public String getUserIdUpdate(@PathVariable("id") Integer id) {
		helloService.hello(id);
		helloService.hello(id);
		helloService.hello(5);
	    return "getUserIdUpdate success";
	}
	
	/**
	 * 继承类方式
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getUserIdByExtendCommand/{id}", method = RequestMethod.GET)
	public String getUserIdByExtendCommand(@PathVariable("id") Integer id) {
		HelloCommand one = new HelloCommand(restTemplate,id);
		one.execute();
		logger.info("from cache:   " + one.isResponseFromCache());
		HelloCommand two = new HelloCommand(restTemplate,id);
		two.execute();
		logger.info("from cache:   " + two.isResponseFromCache());
	    return "getUserIdByExtendCommand success";
	}
	
	/**
	 * 缓存和清除缓存
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getAndUpdateUser/{id}", method = RequestMethod.GET)
	public String getAndUpdateUser(@PathVariable("id") Integer id) {
		//调用接口并缓存数据
		helloService.getUserToCommandKey(id);
		helloService.getUserToCommandKey(id);
		//清除缓存
		helloService.updateUser(id);
		//再调用接口
		helloService.getUserToCommandKey(id);
		helloService.getUserToCommandKey(id);
		return "getAndUpdateUser success";
	}
	
}
