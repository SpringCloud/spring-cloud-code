package cn.springcloud.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by caibosi on 2018-07-05.
 */
@RestController
@RequestMapping("/args")
public class ArgsController {

    @GetMapping("/processors")
    public Mono<Integer> getAvailableProcessors(){
        return Mono.just(Runtime.getRuntime().availableProcessors());
    }
}
