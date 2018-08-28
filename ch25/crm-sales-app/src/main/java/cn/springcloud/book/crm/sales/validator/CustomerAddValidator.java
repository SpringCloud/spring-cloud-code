package cn.springcloud.book.crm.sales.validator;

import cn.springcloud.book.crm.sales.validator.extensionpoint.CustomerAddValidatorExtPt;
import org.xujin.halo.logger.Logger;
import org.xujin.halo.logger.LoggerFactory;
import cn.springcloud.book.crm.sales.dto.CustomerAddCmd;
import org.springframework.stereotype.Component;

@Component
public class CustomerAddValidator implements CustomerAddValidatorExtPt {

	private Logger logger = LoggerFactory.getLogger(CustomerAddValidator.class);
	
	@Override
	public void validate(Object candidate) {
		logger.debug("Do common validation");
		CustomerAddCmd addCmd = (CustomerAddCmd)candidate;
	}
}
