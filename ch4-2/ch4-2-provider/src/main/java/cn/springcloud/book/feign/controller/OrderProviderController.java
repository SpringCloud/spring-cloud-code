package cn.springcloud.book.feign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderProviderController {


    @RequestMapping(value = "/feign", method = RequestMethod.GET)
    public String hello() {
        return "hello,feign";
    }


}
