package cn.springcloud.cloudgrpcclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * emil:miles02@613.com
 * Created by forezp on 2018/8/11.
 */
@RestController
public class GrpcClientController {

    @Autowired
    private GrpcClientService grpcClientService;

    @RequestMapping("/")
    public String printMessage(@RequestParam(defaultValue = "Spring Cloud") String name) {
        return grpcClientService.sendMessage(name);
    }
}
