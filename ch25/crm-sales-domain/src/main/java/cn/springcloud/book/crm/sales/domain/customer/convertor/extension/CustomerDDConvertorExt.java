package cn.springcloud.book.crm.sales.domain.customer.convertor.extension;

import cn.springcloud.book.crm.sales.domain.customer.entity.CustomerE;
import cn.springcloud.book.crm.sales.common.AppConstants;
import cn.springcloud.book.crm.sales.common.BizCode;
import cn.springcloud.book.crm.sales.tunnel.dataobject.CustomerDO;
import cn.springcloud.book.crm.sales.domain.customer.convertor.CustomerConvertor;
import cn.springcloud.book.crm.sales.domain.customer.convertor.extensionpoint.CustomerConvertorExtPt;
import cn.springcloud.book.crm.sales.domain.customer.valueobject.SourceType;
import cn.springcloud.book.crm.sales.dto.clientobject.CustomerCO;
import org.springframework.beans.factory.annotation.Autowired;
import org.xujin.halo.annotation.extension.Extension;

/**
 * CustomerDDConvertorExt
 *
 * @author xujin
 * @date 2018-01-08 1:57 PM
 */
@Extension(bizCode = BizCode.DD)
public class CustomerDDConvertorExt implements CustomerConvertorExtPt {

    @Autowired
    private CustomerConvertor customerConvertor;//Composite basic convertor to do basic conversion

    @Override
    public CustomerE clientToEntity(CustomerCO customerCO) {
        CustomerE customerEntity = customerConvertor.clientToEntity(customerCO);
        //In this business, AD and RFQ are regarded as different source
        if(AppConstants.SOURCE_AD.equals(customerCO.getSource()))
        {
            customerEntity.setSourceType(SourceType.AD);
        }
        if (AppConstants.SOURCE_RFQ.equals(customerCO.getSource())){
            customerEntity.setSourceType(SourceType.RFQ);
        }
        return customerEntity;
    }

    public CustomerCO dataToClient(CustomerDO customerDO){
        return customerConvertor.dataToClient(customerDO);
    }
}
