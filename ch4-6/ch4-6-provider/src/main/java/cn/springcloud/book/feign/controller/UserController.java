package cn.springcloud.book.feign.controller;

import cn.springcloud.book.feign.model.User;
import cn.springcloud.book.feign.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController implements UserService {

	@Override
	public String addUser(User user){
		return "hello,"+user.getName();
	}

	@Override
	public String updateUser(User user){
		return "hello,"+user.getName();
	}


}
