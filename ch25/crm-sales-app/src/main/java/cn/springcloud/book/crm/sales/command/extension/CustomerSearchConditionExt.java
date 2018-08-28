package cn.springcloud.book.crm.sales.command.extension;

import cn.springcloud.book.crm.sales.command.extensionpoint.CustomerCheckConflictSearchConditionExtPt;
import cn.springcloud.book.crm.sales.common.BizCode;
import org.xujin.halo.annotation.extension.Extension;

@Extension
public class CustomerSearchConditionExt implements CustomerCheckConflictSearchConditionExtPt {

    @Override
    public String getSearchCondition(String condition) {
        return "default Search Condition";
    }

}
