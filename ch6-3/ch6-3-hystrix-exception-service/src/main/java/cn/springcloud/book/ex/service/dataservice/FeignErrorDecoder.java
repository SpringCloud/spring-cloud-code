package cn.springcloud.book.ex.service.dataservice;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.netflix.hystrix.exception.HystrixBadRequestException;

import feign.Response;
import feign.Util;

@Component
public class FeignErrorDecoder implements feign.codec.ErrorDecoder{

	@Override
	public Exception decode(String methodKey, Response response) {
	 try {
            if (response.status() >= 400 && response.status() <= 499) {
                String error = Util.toString(response.body().asReader());
                return new HystrixBadRequestException(error);
            }
        } catch (IOException e) {
           System.out.println(e);
        }
        return feign.FeignException.errorStatus(methodKey, response);
	}
	
}

