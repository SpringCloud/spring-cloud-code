package cn.springcloud.book.crm.sales.domain.customer.rule.extensionpoint;

import cn.springcloud.book.crm.sales.domain.customer.entity.CustomerE;
import org.xujin.halo.extension.ExtensionPointI;
import org.xujin.halo.rule.RuleI;

/**
 * CustomerRuleExtPt
 *
 * @author xujin
 * @date 2018-01-07 12:03 PM
 */
public interface CustomerRuleExtPt extends RuleI, ExtensionPointI{

	//Different business check for different biz
	public boolean addCustomerCheck(CustomerE customerE);

	//Different upgrade policy for different biz
	default public void customerUpgradePolicy(CustomerE customerE){
		//Nothing special
	}
}