package cn.springcloud.book.controller;

import cn.springcloud.book.domain.UserOrder;
import cn.springcloud.book.service.OrderService;
import org.apache.servicecomb.saga.omega.context.OmegaContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caibosi on 2018-07-29.
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    OmegaContext omegaContext;

    @PostMapping
    public UserOrder order(@RequestBody UserOrder userOrder){
        userOrder.setTxId(omegaContext.globalTxId());
        return orderService.order(userOrder);
    }
}
