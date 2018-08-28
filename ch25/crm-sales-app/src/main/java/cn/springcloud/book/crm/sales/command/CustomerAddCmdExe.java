package cn.springcloud.book.crm.sales.command;

import org.xujin.halo.command.Command;
import org.xujin.halo.command.CommandExecutorI;
import org.xujin.halo.dto.Response;
import org.xujin.halo.extension.ExtensionExecutor;
import org.xujin.halo.validator.ValidatorExecutor;
import cn.springcloud.book.crm.sales.domain.customer.convertor.extensionpoint.CustomerConvertorExtPt;
import cn.springcloud.book.crm.sales.domain.customer.entity.CustomerE;
import cn.springcloud.book.crm.sales.dto.CustomerAddCmd;
import cn.springcloud.book.crm.sales.validator.extensionpoint.CustomerAddValidatorExtPt;
import org.springframework.beans.factory.annotation.Autowired;

@Command
public class CustomerAddCmdExe implements CommandExecutorI<Response, CustomerAddCmd>{

    /**
     * 依赖注入校验执行器
     */
    @Autowired
    private ValidatorExecutor  validatorExecutor;

    /**
     * 依赖注入扩展点执行器
     */
    @Autowired
    private ExtensionExecutor extensionExecutor;

    @Override
    public Response execute(CustomerAddCmd cmd) {
        //1, validation
    	validatorExecutor.validate(CustomerAddValidatorExtPt.class, cmd);
    	
        //2, invoke domain service or directly operate domain to do business logic process
        CustomerE customerEntity = extensionExecutor.execute(CustomerConvertorExtPt.class, extension -> extension.clientToEntity(cmd.getCustomer()));
        customerEntity.addNewCustomer();

        //3, notify by sending message out
        return Response.buildSuccess();
    }

}
