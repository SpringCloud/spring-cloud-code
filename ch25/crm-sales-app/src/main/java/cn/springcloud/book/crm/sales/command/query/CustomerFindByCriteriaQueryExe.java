package cn.springcloud.book.crm.sales.command.query;

import org.xujin.halo.command.Command;
import org.xujin.halo.command.QueryExecutorI;
import org.xujin.halo.dto.MultiResponse;
import cn.springcloud.book.crm.sales.domain.customer.convertor.CustomerConvertor;
import cn.springcloud.book.crm.sales.domain.customer.entity.CustomerE;
import cn.springcloud.book.crm.sales.domain.customer.repository.CustomerRepository;
import cn.springcloud.book.crm.sales.dto.CustomerFindByCriteriaQry;
import cn.springcloud.book.crm.sales.dto.clientobject.CustomerCO;
import cn.springcloud.book.crm.sales.tunnel.dataobject.CustomerDO;
import cn.springcloud.book.crm.sales.tunnel.datatunnel.CustomerTunnelI;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Command
public class CustomerFindByCriteriaQueryExe implements QueryExecutorI<MultiResponse<CustomerCO>, CustomerFindByCriteriaQry> {

    @Autowired
    CustomerTunnelI customerDBTunnel;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerConvertor customerConvertor;

    @Override
    public MultiResponse<CustomerCO> execute(CustomerFindByCriteriaQry cmd) {
        List<CustomerE> customerEList = customerRepository.findByCriteria("");
        List<CustomerCO> customerCos = new ArrayList<>();
        for(CustomerE entity:customerEList ) {
            customerCos.add(customerConvertor.entityToClient(entity));
        }
        return MultiResponse.of(customerCos, customerCos.size());
    }

}
