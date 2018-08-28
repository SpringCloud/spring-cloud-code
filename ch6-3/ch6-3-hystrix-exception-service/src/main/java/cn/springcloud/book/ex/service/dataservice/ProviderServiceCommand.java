package cn.springcloud.book.ex.service.dataservice;


import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class ProviderServiceCommand extends HystrixCommand<String>{
	
	 	private final String name;
	 	
	    public ProviderServiceCommand(String name) {
	        super(HystrixCommandGroupKey.Factory.asKey("GroupSC"));
	        this.name = name;
	    }

	    @Override
	    protected String run() {
	        return "Spring Cloud";
	    }
	    
	    @Override
	    protected String getFallback() {
	        return "Failure Spring Cloud";
	    }
	    
}

