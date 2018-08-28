package cn.springcloud.book;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;

/**
 * Created by caibosi on 2018-08-02.
 */
public class ConsumerMain {
    public static void main(String[] args) {
        ReferenceConfig<HelloService> referenceConfig = new ReferenceConfig<HelloService>();
        referenceConfig.setApplication(new ApplicationConfig("hello-service-consumer"));
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setInterface(HelloService.class);
        HelloService greetingService = referenceConfig.get();
        System.out.println(greetingService.hello());
    }
}
