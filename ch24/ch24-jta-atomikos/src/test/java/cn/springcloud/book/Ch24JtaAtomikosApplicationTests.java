package cn.springcloud.book;

import cn.springcloud.book.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.DEFINED_PORT)
public class Ch24JtaAtomikosApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    public void testJtaCommit() throws InterruptedException {
        try{
            orderService.newOrder("tom","0001",100);
        }catch (Exception e){
            e.printStackTrace();
        }
        TimeUnit.MINUTES.sleep(10);
    }

    @Test
    public void testJtaRollback() throws InterruptedException {
        try{
            orderService.newOrderRollback("tom","0001",100);
        }catch (Exception e){
            e.printStackTrace();
        }
        TimeUnit.MINUTES.sleep(10);
    }

}
