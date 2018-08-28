package com.sc.boo.config.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.mongodb.EnableMongoConfigServer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zzf
 * @date: 2018/4/6
 * @time: 16:55
 * @description : MongoDb 服务配置的启动类
 */
@SpringBootApplication
@EnableMongoConfigServer
public class MongoDbConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbConfigServerApplication.class, args);
    }
}
