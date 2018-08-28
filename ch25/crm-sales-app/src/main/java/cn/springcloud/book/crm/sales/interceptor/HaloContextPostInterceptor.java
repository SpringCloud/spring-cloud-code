package cn.springcloud.book.crm.sales.interceptor;

import cn.springcloud.book.crm.sales.common.BizCode;
import org.xujin.halo.command.CommandInterceptorI;
import org.xujin.halo.command.PostInterceptor;
import org.xujin.halo.command.PreInterceptor;
import org.xujin.halo.context.HaloContext;
import org.xujin.halo.context.PvgContext;
import org.xujin.halo.dto.Command;
import org.xujin.halo.dto.Response;

/**
 * Command的后置拦截器，用来清除Halo框架上下文
 */
@PostInterceptor
public class HaloContextPostInterceptor implements CommandInterceptorI{

    @Override
    public void postIntercept(Command command, Response response) {
        if(HaloContext.exist()){
            HaloContext.remove();
        }
        if(PvgContext.exist()){
            PvgContext.remove();
        }
    }

}
