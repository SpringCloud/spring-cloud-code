package cn.springcloud.book.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @author zunfa.zhong
 * @date 2018-7-15 18:55:22
 */
@SpringBootApplication
public class ApolloClientApplication {

  public static void main(String[] args) throws IOException {

    SpringApplication.run(ApolloClientApplication.class, args);
  }
}
