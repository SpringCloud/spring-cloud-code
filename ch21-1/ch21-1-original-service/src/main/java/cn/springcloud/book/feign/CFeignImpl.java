package cn.springcloud.book.feign;

import com.nepxion.discovery.common.constant.DiscoveryConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@ConditionalOnProperty(name = DiscoveryConstant.SPRING_APPLICATION_NAME, havingValue = "discovery-springcloud-example-c")
public class CFeignImpl extends AbstractFeignImpl implements CFeign {
    private static final Logger LOG = LoggerFactory.getLogger(CFeignImpl.class);

    @Override
    public String invoke(@RequestBody String value) {
        value = doInvoke(value);

        LOG.info("调用路径：{}", value);

        return value;
    }
}