package cn.springcloud.book.service;

import cn.springcloud.book.HelloService;
import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

import java.io.IOException;

/**
 * Created by caibosi on 2018-08-02.
 */
public class ProviderMain {

    public static void main(String[] args) throws IOException {
        ServiceConfig<HelloService> serviceConfig = new ServiceConfig<HelloService>();
        serviceConfig.setApplication(new ApplicationConfig("hello-service-provider"));
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("localhost:2181");
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setInterface(HelloService.class);
        serviceConfig.setRef(new HelloServiceImpl());
        serviceConfig.export();
        System.in.read();
    }
}
