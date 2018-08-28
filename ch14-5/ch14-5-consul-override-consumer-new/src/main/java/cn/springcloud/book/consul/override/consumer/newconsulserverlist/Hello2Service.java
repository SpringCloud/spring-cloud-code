package cn.springcloud.book.consul.override.consumer.newconsulserverlist;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/** 使用 openfeign 组件，调用 consul-provider2 远程服务 */
@FeignClient("consul-provider2")
public interface Hello2Service {
    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    String sayHello(@RequestParam("name") String name);
}
