package cn.springcloud.book.crm.sales.tunnel.datatunnel;

import cn.springcloud.book.crm.sales.tunnel.dataobject.CustomerDO;
import org.xujin.halo.repository.DataTunnel;

import java.util.List;

public interface CustomerTunnelI extends DataTunnel<CustomerDO>{

    public List<CustomerDO> findByCriteria(String... params);

}
