package cn.springcloud.book.crm.sales.domain.customer.convertor;

import cn.springcloud.book.crm.sales.domain.customer.entity.CustomerE;
import cn.springcloud.book.crm.sales.domain.customer.valueobject.CompanyType;
import cn.springcloud.book.crm.sales.dto.clientobject.CustomerCO;
import cn.springcloud.book.crm.sales.dto.clientobject.CustomerType;
import org.xujin.halo.common.ApplicationContextHelper;
import org.xujin.halo.convertor.ConvertorI;
import cn.springcloud.book.crm.sales.tunnel.dataobject.CustomerDO;
import org.springframework.stereotype.Component;

/**
 * CustomerConvertor
 *
 * @author xujin
 * @date 2018-01-07 3:08 AM
 */
@Component
public class CustomerConvertor implements ConvertorI {

    public CustomerE clientToEntity(CustomerCO customerCO){
        CustomerE customerEntity = (CustomerE) ApplicationContextHelper.getBean(CustomerE.class);
        customerEntity.setCompanyName(customerCO.getCompanyName());
        customerEntity.setCompanyType(CompanyType.valueOf(customerCO.getCustomerType().name()));
        return customerEntity;
    }

    public CustomerCO entityToClient(CustomerE entity){
        CustomerCO customerCO = new CustomerCO();
        customerCO.setCustomerId(entity.getCustomerId());
        customerCO.setCompanyName(entity.getCompanyName());
        customerCO.setMemberId(entity.getMemberId());
        customerCO.setSource(entity.getSourceType()!=null?entity.getSourceType().name():null);

        return customerCO;
    }

    public CustomerCO dataToClient(CustomerDO dataObject) {
        CustomerCO customerCO = new CustomerCO();
        customerCO.setCustomerName(dataObject.getCompanyName());
        customerCO.setCustomerType(CustomerType.valueOf(dataObject.getCompanyType()));
        customerCO.setMemberId(dataObject.getMemberId());
        customerCO.setCustomerId(dataObject.getCustomerId());
        return customerCO;
    }

    public CustomerE dataToEntity(CustomerDO dataObject){
        CustomerE customerEntity = (CustomerE) ApplicationContextHelper.getBean(CustomerE.class);
        customerEntity.setCustomerId(dataObject.getCustomerId());
        customerEntity.setCompanyName(dataObject.getCompanyName());
        if(dataObject.getCompanyType()!=null) {
            customerEntity.setCompanyType(CompanyType.valueOf(dataObject.getCompanyType()));
        }
        return customerEntity;
    }
}
