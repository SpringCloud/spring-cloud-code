package cn.springcloud.book.crm.sales.command;

import cn.springcloud.book.crm.sales.dto.CustomerCheckConflictCmd;
import org.xujin.halo.command.Command;
import org.xujin.halo.command.CommandExecutorI;
import org.xujin.halo.dto.MultiResponse;
import org.xujin.halo.extension.ExtensionExecutor;
import cn.springcloud.book.crm.sales.command.extensionpoint.CustomerCheckConflictSearchConditionExtPt;
import cn.springcloud.book.crm.sales.dto.clientobject.CustomerCO;
import org.springframework.beans.factory.annotation.Autowired;

@Command
public class CustomerCheckConflictCmdExe implements CommandExecutorI<MultiResponse<CustomerCO>, CustomerCheckConflictCmd>{

    @Autowired
    private ExtensionExecutor extensionExecutor;
    
    @Override
    public MultiResponse<CustomerCO> execute(CustomerCheckConflictCmd cmd) {
        System.out.println("Shared logic");
        String searchCondition = extensionExecutor.execute(
                                   CustomerCheckConflictSearchConditionExtPt.class,
                                   extension -> extension.getSearchCondition("condition"));
        System.out.println("Shared logic with "+ searchCondition);
        return MultiResponse.of(null, 0);
    }

}
