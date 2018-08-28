package cn.springcloud.book.hystrix.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import cn.springcloud.book.hystrix.config.HystrixThreadLocal;
import cn.springcloud.book.hystrix.service.IThreadContextService;

@RestController
public class ThreadContextController {
    private static final Logger log = LoggerFactory.getLogger(ThreadContextController.class);
	   
	@Autowired
	private IThreadContextService threadContextService;
	
	@RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable("id") Integer id) {
		//第一种测试，放入上下文对象
		HystrixThreadLocal.threadLocal.set("userId : "+ id);
		//第二种测试，利用RequestContextHolder放入对象测试
		RequestContextHolder.currentRequestAttributes().setAttribute("userId", "userId : "+ id, RequestAttributes.SCOPE_REQUEST);
		log.info("ThreadContextController, Current thread: " + Thread.currentThread().getId());
        log.info("ThreadContextController, Thread local: " + HystrixThreadLocal.threadLocal.get());
        log.info("ThreadContextController, RequestContextHolder: " + RequestContextHolder.currentRequestAttributes().getAttribute("userId", RequestAttributes.SCOPE_REQUEST));
        //调用
        String user = threadContextService.getUser(id);
        return user;
    }
}
