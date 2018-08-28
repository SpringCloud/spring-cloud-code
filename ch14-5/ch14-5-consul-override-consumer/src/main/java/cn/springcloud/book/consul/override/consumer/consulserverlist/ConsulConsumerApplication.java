package cn.springcloud.book.consul.override.consumer.consulserverlist;

import com.ecwid.consul.v1.ConsulClient;
import com.netflix.client.config.DefaultClientConfigImpl;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.ServerList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.consul.discovery.ConsulDiscoveryProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * consul-server 的启动主类
 * 为了简化代码，我们将 Controller 代码放在主类中，实际工作中不建议这么做
 */
@SpringBootApplication
@RestController
@EnableFeignClients
public class ConsulConsumerApplication {
    @Autowired
    private Hello1Service hello1Service; // consul-provider1 服务提供方
    @Autowired
    private Hello2Service hello2Service; // consul-provider2 服务提供方


    /** 接收前端传来的参数，使用 feign 的方式调用 consul-provider2 远程接口，并返回调用结果 */
    @GetMapping("/hello1")
    public String hello1(String name){
        return hello1Service.sayHello(name);
    }
    /** 接收前端传来的参数，使用 feign 的方式调用 consul-provider2 远程接口，并返回调用结果 */
    @GetMapping("/hello2")
    public String hello2(String name){
        return hello2Service.sayHello(name);
    }

    // 使用自定义的 ConsulServerList,
    // 这里的 config 没有使用注入的方式, 因为启动时会报没有 IClientConfig Bean 的错误
//    @Bean
    public ServerList<?> ribbonServerList(ConsulClient client, ConsulDiscoveryProperties properties) {
        MyConsulServerList serverList = new MyConsulServerList(client, properties);
        IClientConfig config = new DefaultClientConfigImpl();
        serverList.initWithNiwsConfig(config);
        return serverList;
    }
    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerApplication.class,args);
    }
    @GetMapping("/actuator/health")
    public String health(){
        return "SUCCESS";
    }
}
