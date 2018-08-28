package cn.springcloud.book.hystrix.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.springcloud.book.hystrix.config.HystrixThreadLocal;
import cn.springcloud.book.hystrix.controller.ThreadContextController;

@Component
public class ThreadContextService implements IThreadContextService{
	private static final Logger log = LoggerFactory.getLogger(ThreadContextController.class);
	
   @HystrixCommand
	public String getUser(Integer id) {
		log.info("ThreadContextService, Current thread : " + Thread.currentThread().getId());
		log.info("ThreadContextService, ThreadContext object : " + HystrixThreadLocal.threadLocal.get());
		log.info("ThreadContextService, RequestContextHolder : " + RequestContextHolder.currentRequestAttributes().getAttribute("userId", RequestAttributes.SCOPE_REQUEST).toString());
		return "Success";
	}
   
   
	
}
