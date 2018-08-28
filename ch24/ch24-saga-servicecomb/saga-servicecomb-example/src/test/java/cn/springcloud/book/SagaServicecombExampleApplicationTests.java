package cn.springcloud.book;

import cn.springcloud.book.dto.OrderRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SagaServicecombExampleApplicationTests {

    @Value("${omega.orderService}")
    String orderServiceUrl;

    @Autowired
    @Qualifier("restClient")
    RestTemplate restTemplate;

    @Test
    public void testRestTemplateTimeout(){
        OrderRequest orderRequest = OrderRequest.builder()
                .userId("caibosi")
                .productCode("action")
                .quantity(100)
                .build();
        restTemplate.postForEntity(orderServiceUrl, orderRequest, String.class);
    }
}
