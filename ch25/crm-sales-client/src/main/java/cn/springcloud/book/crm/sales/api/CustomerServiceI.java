package cn.springcloud.book.crm.sales.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import cn.springcloud.book.crm.sales.dto.CustomerCheckConflictCmd;
import org.xujin.halo.dto.MultiResponse;
import org.xujin.halo.dto.Response;
import cn.springcloud.book.crm.sales.dto.CustomerAddCmd;
import cn.springcloud.book.crm.sales.dto.CustomerFindByCriteriaQry;
import cn.springcloud.book.crm.sales.dto.clientobject.CustomerCO;

@FeignClient("crm-sales-provider")
public interface CustomerServiceI {

    @GetMapping("/add")
    public Response addCustomer(CustomerAddCmd customerAddCmd);

    @GetMapping("/checkConflict")
    public MultiResponse<CustomerCO> checkConflict(CustomerCheckConflictCmd customerCheckConflictCmd);

    @GetMapping("/list")
    public MultiResponse<CustomerCO> findByCriteria(CustomerFindByCriteriaQry CustomerFindByCriteriaQry);

}