package cn.springcloud.book;

import cn.springcloud.book.service.DemoConsumer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoDubboConsumerApplicationTests {

    @Autowired
    DemoConsumer demoConsumer;

    @Test
    public void callhello() {
        String result = demoConsumer.callHello();
        Assert.assertTrue(result.startsWith("hello"));
    }

}
