package cn.springcloud.book.crm.sales.command.extensionpoint;

import org.xujin.halo.extension.ExtensionPointI;

public interface CustomerCheckConflictSearchConditionExtPt extends ExtensionPointI{
    
    public String getSearchCondition(String condition);
}
