package cn.springcloud.book.crm.sales.command.extension;

import cn.springcloud.book.crm.sales.command.extensionpoint.CustomerCheckConflictSearchConditionExtPt;
import cn.springcloud.book.crm.sales.common.BizCode;
import org.xujin.halo.annotation.extension.Extension;

@Extension(bizCode = BizCode.TP)
public class CustomerSearchConditionTPExt implements CustomerCheckConflictSearchConditionExtPt {

    @Override
    public String getSearchCondition(String condition) {
        return "Trust Pass Search Condition";
    }

}
