package cn.springcloud.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by caibosi on 2018-07-05.
 */
@RestController
@RequestMapping("/version")
public class VersionController {

    @GetMapping("")
    public Mono<String> getVersion(){
        return Mono.just("0.0.1");
    }
}
