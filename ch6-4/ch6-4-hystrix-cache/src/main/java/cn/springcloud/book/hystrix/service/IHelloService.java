package cn.springcloud.book.hystrix.service;

import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;

public interface IHelloService {
	public String hello(Integer id);
	public String getUserToCommandKey(@CacheKey Integer id);
	public String updateUser(@CacheKey Integer id);
}
