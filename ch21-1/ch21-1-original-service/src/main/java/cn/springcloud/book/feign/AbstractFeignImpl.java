package cn.springcloud.book.feign;

import org.springframework.beans.factory.annotation.Autowired;

import com.nepxion.discovery.plugin.framework.adapter.PluginAdapter;

public class AbstractFeignImpl {
    @Autowired
    private PluginAdapter pluginAdapter;

    public String doInvoke(String value) {
        String serviceId = pluginAdapter.getServiceId();
        String version = pluginAdapter.getVersion();
        // String host = pluginAdapter.getHost();
        // int port = pluginAdapter.getPort();

        return value + " -> " + serviceId + "[" + version + "]";
    }
}