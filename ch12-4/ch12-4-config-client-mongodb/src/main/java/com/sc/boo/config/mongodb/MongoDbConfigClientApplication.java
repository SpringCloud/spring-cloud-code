package com.sc.boo.config.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zzf
 * @date: 2018/4/6
 * @time: 18:51
 * @description :  客户端启动类
 */
@SpringBootApplication
public class MongoDbConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbConfigClientApplication.class, args);
    }
}
