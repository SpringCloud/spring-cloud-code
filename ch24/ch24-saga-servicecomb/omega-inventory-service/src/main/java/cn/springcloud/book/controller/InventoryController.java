package cn.springcloud.book.controller;

import cn.springcloud.book.domain.Inventory;
import cn.springcloud.book.dto.OrderRequest;
import cn.springcloud.book.service.InventoryService;
import org.apache.servicecomb.saga.omega.context.OmegaContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * Created by caibosi on 2018-07-29.
 */
@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    OmegaContext omegaContext;

    @Autowired
    InventoryService inventoryService;

    @PostMapping
    public Inventory submitOrderRequest(@RequestBody OrderRequest orderRequest){
        orderRequest.setTxId(omegaContext.globalTxId());
        return inventoryService.order(orderRequest);
    }
}
