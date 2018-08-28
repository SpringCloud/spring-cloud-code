package cn.springcloud.book.user.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import cn.springcloud.book.user.service.IUserService;
import cn.springcloud.book.user.service.dataservice.DataService;

/**
 */
@Component
public class UserService implements IUserService{
	
    @Autowired
    private DataService dataService;
    
    @Autowired
    private RestTemplate restTemplate;
    
	@Override
	public String getDefaultUser() {
		return dataService.getDefaultUser();
	}

	@Override
	public String getContextUserId() {
		return dataService.getContextUserId();
	}

	@Override
	public List<String> getProviderData() {
		List<String> result = restTemplate.getForObject("http://sc-data-service/getProviderData", List.class);
		return result;
	}
}
