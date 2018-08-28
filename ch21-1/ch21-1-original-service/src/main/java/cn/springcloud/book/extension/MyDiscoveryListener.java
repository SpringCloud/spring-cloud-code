package cn.springcloud.book.extension;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;

import com.nepxion.discovery.plugin.framework.listener.discovery.AbstractDiscoveryListener;

public class MyDiscoveryListener extends AbstractDiscoveryListener {
    @Override
    public void onGetInstances(String serviceId, List<ServiceInstance> instances) {
        // System.out.println("========== Discovery Listener :: getInstances()被触发, serviceId=" + serviceId + ", instances=" + instances + " ==========");
    }

    @Override
    public void onGetServices(List<String> services) {
        // System.out.println("========== Discovery Listener :: getServices()被触发, services=" + services + " ==========");
    }
}