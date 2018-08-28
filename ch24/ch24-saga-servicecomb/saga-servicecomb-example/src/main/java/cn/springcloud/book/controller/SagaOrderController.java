package cn.springcloud.book.controller;

import cn.springcloud.book.dto.OrderRequest;
import org.apache.servicecomb.saga.omega.context.annotations.SagaStart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by caibosi on 2018-07-29.
 */
@RestController
@RequestMapping("/saga")
public class SagaOrderController {

    @Value("${omega.orderService}")
    String orderServiceUrl;

    @Value("${omega.inventoryService}")
    String inventoryServiceUrl;

    @Autowired
//    @Qualifier("restClient") //not timeout,blocking
    private RestTemplate restTemplate;

    /**
     * curl -i -H "Content-Type: application/json" -X POST localhost:8082/saga  -d '{"userId":"caibosi","productCode":"spring-cloud-in-action","quantity":10}'
     * @param orderRequest
     */
    @SagaStart(timeout = 2)
    @PostMapping("")
    public void sagaOrder(@RequestBody OrderRequest orderRequest){
        //1. order-service
        restTemplate.postForEntity(orderServiceUrl, orderRequest, String.class);

        //2. inventory-service
        restTemplate.postForEntity(inventoryServiceUrl, orderRequest, String.class);
    }
}
