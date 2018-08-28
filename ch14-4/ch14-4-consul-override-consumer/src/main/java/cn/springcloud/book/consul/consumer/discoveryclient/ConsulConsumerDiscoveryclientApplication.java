package cn.springcloud.book.consul.consumer.discoveryclient;

import com.ecwid.consul.v1.ConsulClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.consul.discovery.ConsulDiscoveryProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * consul-server 的启动主类
 * 为了简化代码，我们将 Controller 代码放在主类中，实际工作中不建议这么做
 */
@SpringBootApplication
@RestController
public class ConsulConsumerDiscoveryclientApplication {

    @Autowired  // ConsulDiscoveryClient 会在程序启动时,初始化为DiscoveryClient实例
    private DiscoveryClient discoveryClient;

    @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public MyConsulDiscoveryClient ConsulDiscoveryClient(ConsulClient client,ConsulDiscoveryProperties properties){
        return new MyConsulDiscoveryClient(client,properties);
    }
    // 这里只举例获取服务方信息,不去请求服务方接口
    @GetMapping("/getServer")
    public List<ServiceInstance> getServer(String serviceId){
        return discoveryClient.getInstances(serviceId);
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerDiscoveryclientApplication.class,args);
    }
    @GetMapping("/actuator/health")
    public String health(){
        return "SUCCESS";
    }
}
