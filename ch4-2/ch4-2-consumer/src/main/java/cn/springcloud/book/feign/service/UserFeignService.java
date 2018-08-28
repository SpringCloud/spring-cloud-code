package cn.springcloud.book.feign.service;

import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ch2-1-provider")
public interface UserFeignService {

    @RequestMapping(value = "/feign", method = RequestMethod.GET)
    public String helloFeign();

    /**
     *
     * feign请求结果是一个图片流，怎么接收
     * 生成图片验证码
     * @param imagekey
     * @return
     */
    @RequestMapping(value = "createImagesCode")
    public Response createImageCode(@RequestParam("imagekey") String imagekey);

}
