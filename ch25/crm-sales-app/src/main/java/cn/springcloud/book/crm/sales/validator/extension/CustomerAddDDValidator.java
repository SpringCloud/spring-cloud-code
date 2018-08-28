package cn.springcloud.book.crm.sales.validator.extension;

import cn.springcloud.book.crm.sales.validator.CustomerAddValidator;
import cn.springcloud.book.crm.sales.validator.extensionpoint.CustomerAddValidatorExtPt;
import cn.springcloud.book.crm.sales.common.BizCode;
import org.xujin.halo.exception.ParamException;
import org.xujin.halo.annotation.extension.Extension;
import org.xujin.halo.logger.Logger;
import org.xujin.halo.logger.LoggerFactory;
import org.xujin.halo.validator.ValidatorCompoiste;
import cn.springcloud.book.crm.sales.dto.CustomerAddCmd;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * CustomerAddDDValidator
 * 
 * @author xujin 2017-11-04
 */
@Extension(bizCode = BizCode.DD)
public class CustomerAddDDValidator extends ValidatorCompoiste implements CustomerAddValidatorExtPt {

	private Logger logger = LoggerFactory.getLogger(CustomerAddDDValidator.class);
	
    @Autowired
    private CustomerAddValidator customerAddValidator;

    @Autowired
    private CustomerAddCGSValidator customerAddCGSValidator;

    @Override
    protected void addOtherValidators() {
        // just for demo, 假设钉钉的校验逻辑是在common和CGS的基础上，还有自己额外的校验
        add(customerAddValidator);
    }

    @Override
    protected void doValidate(Object candidate) {
        logger.debug("Do DingDing validation");
        CustomerAddCmd addCustomerCmd = (CustomerAddCmd) candidate;
        //For DD Biz CustomerType could not be null
        if (addCustomerCmd.getCustomer().getCustomerType() == null){
            throw new ParamException("CustomerType could not be null");
        }


    }

}
