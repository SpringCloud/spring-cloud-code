package cn.springcloud.book.crm.sales.domain.customer.rule.extension;

import cn.springcloud.book.crm.sales.domain.customer.entity.CustomerE;
import cn.springcloud.book.crm.sales.domain.customer.rule.extensionpoint.CustomerRuleExtPt;
import cn.springcloud.book.crm.sales.domain.customer.valueobject.SourceType;
import cn.springcloud.book.crm.sales.common.BizCode;
import org.xujin.halo.annotation.extension.Extension;
import org.xujin.halo.exception.BizException;

/**
 * CustomerDDRuleExt
 *
 * @author xujin
 * @date 2018-01-07 12:10 PM
 */
@Extension(bizCode = BizCode.DD)
public class CustomerDDRuleExt implements CustomerRuleExtPt {

    @Override
    public boolean addCustomerCheck(CustomerE customerEntity) {
        if(SourceType.AD == customerEntity.getSourceType()){
            throw new BizException("Sorry, Customer from advertisement can not be added in this period");
        }
        return true;
    }
}
