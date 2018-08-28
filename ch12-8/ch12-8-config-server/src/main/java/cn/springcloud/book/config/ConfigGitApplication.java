package cn.springcloud.book.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zzf
 * @date: 2018-7-7
 * @time: 21:30:10
 * @description :  配置的启动类
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigGitApplication.class, args);

    }
}
