package cn.springcloud.book.provider.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.springcloud.book.provider.model.User;

@RestController
public class ProviderController {
	
	@RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable("id") Integer id) {
		System.out.println("ProviderController, id is" +id);
	    if (id == 1) {
	        return new User("Toy", "123456", 10);
	    } else if (id == 2) {
	        return new User("Sky", "000000", 20);
	    }
	    return new User("San", "543210", 30);
	}
}
