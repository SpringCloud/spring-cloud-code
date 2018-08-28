package cn.springcloud.book.crm.sales.service;

import org.springframework.web.bind.annotation.RestController;
import cn.springcloud.book.crm.sales.dto.CustomerCheckConflictCmd;
import cn.springcloud.book.crm.sales.dto.CustomerFindByCriteriaQry;
import org.xujin.halo.command.CommandBusI;
import org.xujin.halo.dto.MultiResponse;
import org.xujin.halo.dto.Response;
import cn.springcloud.book.crm.sales.api.CustomerServiceI;
import cn.springcloud.book.crm.sales.dto.CustomerAddCmd;
import cn.springcloud.book.crm.sales.dto.clientobject.CustomerCO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RestController
public class CustomerServiceImpl implements CustomerServiceI {

    @Autowired
    private CommandBusI commandBus;
    
    @Override
    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return (Response)commandBus.send(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerCO> checkConflict(CustomerCheckConflictCmd customerCheckConflictCmd) {
        return (MultiResponse<CustomerCO>)commandBus.send(customerCheckConflictCmd);
    }

    @Override
    public MultiResponse<CustomerCO> findByCriteria(CustomerFindByCriteriaQry CustomerFindByCriteriaQry) {
        return (MultiResponse<CustomerCO>)commandBus.send(CustomerFindByCriteriaQry);
    }

}
