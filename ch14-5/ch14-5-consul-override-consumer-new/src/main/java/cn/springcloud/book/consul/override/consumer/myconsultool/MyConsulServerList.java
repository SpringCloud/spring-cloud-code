package cn.springcloud.book.consul.override.consumer.myconsultool;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.QueryParams;
import com.ecwid.consul.v1.Response;
import com.ecwid.consul.v1.health.model.HealthService;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractServerList;
import org.springframework.cloud.consul.discovery.ConsulDiscoveryProperties;
import org.springframework.cloud.consul.discovery.ConsulServer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyConsulServerList extends AbstractServerList<ConsulServer> {
    private final ConsulClient client;
    private final ConsulDiscoveryProperties properties;

    private String serviceId;

    public MyConsulServerList(ConsulClient client, ConsulDiscoveryProperties properties) {
        this.client = client;
        this.properties = properties;
    }

    protected ConsulClient getClient() {
        return client;
    }

    protected ConsulDiscoveryProperties getProperties() {
        return properties;
    }

    protected String getServiceId() {
        return serviceId;
    }

    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {
        this.serviceId = clientConfig.getClientName();
    }

    @Override
    public List<ConsulServer> getInitialListOfServers() {
        return getServers();
    }

    @Override
    public List<ConsulServer> getUpdatedListOfServers() {
        return getServers();
    }

    private List<ConsulServer> getServers() {
        if (this.client == null) {
            return Collections.emptyList();
        }
        System.out.println("===== 自定义服务发现 =====");
        String tag = getTag(); // null is ok
        Response<List<HealthService>> response = this.client.getHealthServices(
                this.serviceId, tag, this.properties.isQueryPassing(),
                createQueryParamsForClientRequest(), this.properties.getAclToken());
        if (response.getValue() == null || response.getValue().isEmpty()) {
            return Collections.emptyList();
        }
        return transformResponse(response.getValue());
    }

    /**
     * Transforms the response from Consul in to a list of usable {@link ConsulServer}s.
     *
     * @param healthServices the initial list of servers from Consul. Guaranteed to be non-empty list
     * @return ConsulServer instances
     * @see ConsulServer#ConsulServer(HealthService)
     */
    protected List<ConsulServer> transformResponse(List<HealthService> healthServices) {
        List<ConsulServer> servers = new ArrayList<>();
        for (HealthService service : healthServices) {
            ConsulServer server = new ConsulServer(service);
            if (server.getMetadata().containsKey(this.properties.getDefaultZoneMetadataName())) {
                server.setZone(server.getMetadata().get(this.properties.getDefaultZoneMetadataName()));
            }
            servers.add(server);
        }
        return servers;
    }

    /**
     * This method will create the {@link QueryParams} to use when retrieving the
     * services from Consul. By default {@link QueryParams#DEFAULT} is used. In case
     * a datacenter is specified for the current serviceId {@link QueryParams#datacenter} is set.
     * @return an instance of {@link QueryParams}
     */
    protected QueryParams createQueryParamsForClientRequest() {
        String datacenter = getDatacenter();
        if (datacenter != null) {
            return new QueryParams(datacenter);
        }
        return QueryParams.DEFAULT;
    }

    protected String getTag() {
        return this.properties.getQueryTagForService(this.serviceId);
    }

    protected String getDatacenter() {
        return this.properties.getDatacenters().get(this.serviceId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConsulServerList{");
        sb.append("serviceId='").append(serviceId).append('\'');
        sb.append(", tag=").append(getTag());
        sb.append('}');
        return sb.toString();
    }
}
