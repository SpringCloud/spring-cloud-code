package cn.springcloud.book.extension;

import java.util.List;

import com.nepxion.discovery.plugin.framework.listener.loadbalance.AbstractLoadBalanceListener;
import com.netflix.loadbalancer.Server;

public class MyLoadBalanceListener extends AbstractLoadBalanceListener {
    @Override
    public void onGetServers(String serviceId, List<? extends Server> servers) {
        // System.out.println("========== LoadBalance Listener :: getServers()被触发, serviceId=" + serviceId + ", servers=" + servers + " ==========");
    }
}