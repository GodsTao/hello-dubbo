package com.juntao.hello.dubbo.service.user.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix

public class HelloDubboServiceUserConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloDubboServiceUserConsumerApplication.class, args);
    }

}
