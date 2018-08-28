package cn.springcloud.book.crm.sales.interceptor;

import org.springframework.core.annotation.Order;
import cn.springcloud.book.crm.sales.common.BizCode;
import org.xujin.halo.command.CommandInterceptorI;
import org.xujin.halo.command.PreInterceptor;
import org.xujin.halo.context.HaloContext;
import org.xujin.halo.context.PvgContext;
import org.xujin.halo.dto.Command;

/**
 * Command的前置拦截器，用来设置全局的Halo框架上下文
 */
@PreInterceptor
public class HaloContextPreInterceptor implements CommandInterceptorI{

    @Override
    public void preIntercept(Command command) {
        //如果不需要用户，则设置为系统用户，业务身份从这里传递
        if(command.isOperaterIsNotNeeded()){
            HaloContext.set(BizCode.CGS,"");
            PvgContext.set("","","","");
            return;
        }
        //设置系统自定义的应用上下文
        String  operater=command.getOperater();
        HaloContext.set("DD","");
    }

}
