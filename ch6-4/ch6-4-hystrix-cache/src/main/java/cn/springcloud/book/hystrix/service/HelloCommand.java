package cn.springcloud.book.hystrix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixRequestCache;
import com.netflix.hystrix.strategy.concurrency.HystrixConcurrencyStrategyDefault;

public class HelloCommand extends HystrixCommand<String>{

    private RestTemplate restTemplate;
    private Integer id;
    
    public HelloCommand(RestTemplate restTemplate, Integer id) {
        super(HystrixCommandGroupKey.Factory.asKey("springCloudCacheGroup"));
        this.id = id;
        this.restTemplate = restTemplate;
    }
    
    @Override
    protected String getFallback() {
        return "fallback";
    }

    @Override
    protected String run() throws Exception {
		String json = restTemplate.getForObject("http://sc-provider-service/getUser/{1}", String.class, id);
		System.out.println(json);
		return json;
    }

    @Override
    protected String getCacheKey() {
        return String.valueOf(id);
    }
    
    public static void cleanCache(Long id){
        HystrixRequestCache.getInstance(HystrixCommandKey.Factory.asKey("springCloudCacheGroup"), HystrixConcurrencyStrategyDefault.getInstance()).clear(String.valueOf(id));
    }

}
