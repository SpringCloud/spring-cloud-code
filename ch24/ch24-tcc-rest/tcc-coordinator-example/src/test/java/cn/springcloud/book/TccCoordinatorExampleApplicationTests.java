package cn.springcloud.book;

import cn.springcloud.book.dto.OrderRequest;
import cn.springcloud.book.service.TccOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TccCoordinatorExampleApplicationTests {

    @Autowired
    TccOrderService tccOrderService;

    @Test
    public void testTccOrder() {
        String txId = UUID.randomUUID().toString();
        OrderRequest orderRequest = OrderRequest.builder()
                .userId("caibosi")
                .productCode("spring-cloud-in-action")
                .quantity(10)
                .build();
        tccOrderService.newOrderWithTcc(orderRequest,txId);
    }

    @Test
    public void testTccOrderRetry(){
        String txId = "972c86d6-6bda-4859-9128-de10f4bf9634";
        OrderRequest orderRequest = OrderRequest.builder()
                .userId("caibosi")
                .productCode("spring-cloud-in-action")
                .quantity(10)
                .build();
        tccOrderService.newOrderWithTcc(orderRequest,txId);
    }

    @Test
    public void testTccOrderRollback(){
        String txId = UUID.randomUUID().toString();
        OrderRequest orderRequest = OrderRequest.builder()
                .userId("caibosi")
                .productCode("spring-cloud-in-action")
                .quantity(999)
                .build();
        tccOrderService.newOrderWithTcc(orderRequest,txId);
    }

}
