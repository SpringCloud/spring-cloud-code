package cn.springcloud.book.user.service.fallback;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.springcloud.book.user.service.IUserService;
import cn.springcloud.book.user.service.dataservice.DataService;	

/**
 */
@Component
public class UserClientFallback implements DataService{
	
	@Override
	public String getDefaultUser() {
		return new String("get getDefaultUser failed");
	}
	@Override
	public String getContextUserId() {
		return new String("get getContextUserId failed");
	}
	
}
