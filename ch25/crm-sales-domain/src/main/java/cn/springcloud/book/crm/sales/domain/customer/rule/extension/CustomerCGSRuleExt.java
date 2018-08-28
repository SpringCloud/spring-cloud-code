package cn.springcloud.book.crm.sales.domain.customer.rule.extension;

import cn.springcloud.book.crm.sales.domain.customer.entity.CustomerE;
import cn.springcloud.book.crm.sales.domain.customer.rule.extensionpoint.CustomerRuleExtPt;
import cn.springcloud.book.crm.sales.common.BizCode;
import org.xujin.halo.annotation.extension.Extension;
import org.xujin.halo.logger.Logger;
import org.xujin.halo.logger.LoggerFactory;

@Extension(bizCode= BizCode.CGS)
public class CustomerCGSRuleExt implements CustomerRuleExtPt {
	Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public boolean addCustomerCheck(CustomerE customerE) {
		//Any Customer can be added
		return true;
	}
}
