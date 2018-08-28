package cn.springcloud.book.crm.sales.interceptor;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.xujin.halo.command.CommandInterceptorI;
import org.xujin.halo.command.PostInterceptor;
import org.xujin.halo.common.LocalAddress;
import org.xujin.halo.context.PvgContext;
import org.xujin.halo.dto.Command;
import org.xujin.halo.dto.Response;
import org.xujin.halo.logger.Logger;
import org.xujin.halo.logger.LoggerFactory;

/**
 * @author xujin
 */
@Order(100)
@PostInterceptor
public class LoggerPostInterceptor implements CommandInterceptorI{
    Logger logger = LoggerFactory.getLogger(LoggerPostInterceptor.class);
    private static final String MONITOR_LOG_PARAM_CACHE_ENANBLED = "monitor.log.param.cache.enanbled";

    @Autowired
    private LoggerPreInterceptor logPreInterceptor;

    @Override
    public void postIntercept(Command command, Response response) {
        logger.debug("Finished processing %s Response:%s", command.getClass(), response);
        //记录监控日志
        handleMonitorLog(command, response);
    }

    private void handleMonitorLog(Command command, Response response){
        Thread th = Thread.currentThread();
        boolean status = false;
        Long threadId = 0L;
        if(th != null){
            threadId = th.getId();
        }
        //操作人
        String operator = StringUtils.EMPTY;
        if(PvgContext.exist()){
            operator = PvgContext.getCrmUserId();
        }
        //处理状态
        if(response != null && response.isSuccess()){
            status = true;
        }

        Boolean cacheEnabled = false;
        String params = StringUtils.EMPTY;
        if(!status){
            params = command.toString();
        }
        //status=true 情况下默认关闭参数输出
        else if(cacheEnabled != null && cacheEnabled){
            params =  command.toString();
        }

        //毫秒
        long cost = System.currentTimeMillis() - logPreInterceptor.getStartTime();

        //|threadId|Command|操作人|处理状态|耗时|ip|params
        logger.info("[MonitorLog] |%s|%s|%s|%s|%s|%s|%s", threadId, command.getClass(), operator, status, cost, LocalAddress.IP, params);
    }
}