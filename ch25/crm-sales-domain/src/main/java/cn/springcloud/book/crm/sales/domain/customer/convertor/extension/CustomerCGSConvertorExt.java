package cn.springcloud.book.crm.sales.domain.customer.convertor.extension;

import cn.springcloud.book.crm.sales.domain.customer.convertor.CustomerConvertor;
import cn.springcloud.book.crm.sales.domain.customer.convertor.extensionpoint.CustomerConvertorExtPt;
import cn.springcloud.book.crm.sales.domain.customer.entity.CustomerE;
import cn.springcloud.book.crm.sales.domain.customer.valueobject.SourceType;
import cn.springcloud.book.crm.sales.common.AppConstants;
import cn.springcloud.book.crm.sales.common.BizCode;
import cn.springcloud.book.crm.sales.tunnel.dataobject.CustomerDO;
import cn.springcloud.book.crm.sales.dto.clientobject.CustomerCO;
import org.xujin.halo.annotation.extension.Extension;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * CustomerCGSConvertorExt
 *
 * @author xujin
 * @date 2018-01-07 3:05 AM
 */
@Extension(bizCode = BizCode.CGS)
public class CustomerCGSConvertorExt implements CustomerConvertorExtPt {

    @Autowired
    private CustomerConvertor customerConvertor;//Composite basic convertor to do basic conversion

    @Override
    public CustomerE clientToEntity(CustomerCO customerCO){
        CustomerE customerEntity = customerConvertor.clientToEntity(customerCO);
        //In this business, if customers from RFQ and Advertisement are both regarded as Advertisement
        if(AppConstants.SOURCE_AD.equals(customerCO.getSource()) || AppConstants.SOURCE_RFQ.equals(customerCO.getSource()))
        {
            customerEntity.setSourceType(SourceType.AD);
        }
        return customerEntity;
    }

    public CustomerCO dataToClient(CustomerDO customerDO){
        return customerConvertor.dataToClient(customerDO);
    }
}
