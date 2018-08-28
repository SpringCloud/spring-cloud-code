package cn.springcloud.book.crm.sales.event.handler;

import org.xujin.halo.dto.Response;
import org.xujin.halo.dto.event.Event;
import org.xujin.halo.event.EventHandler;
import org.xujin.halo.event.EventHandlerI;

/**
 * @author xujin
 * @date 2017/11/30
 */
@EventHandler
public class CustomerChangeEventHandler implements EventHandlerI {


    @Override
    public Response execute(Event event) {
        System.out.println("Add your own other logic here");
        return Response.buildSuccess();
    }
}
