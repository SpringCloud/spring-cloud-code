package cn.springcloud.book.feign.controller;

import cn.springcloud.book.feign.model.User;
import cn.springcloud.book.feign.service.UserService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser( @RequestBody @ApiParam(name="用户",value="传入json格式",required=true) User user){
		return userService.addUser(user);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateUser( @RequestBody @ApiParam(name="用户",value="传入json格式",required=true) User user){
		return userService.updateUser(user);
	}

}
