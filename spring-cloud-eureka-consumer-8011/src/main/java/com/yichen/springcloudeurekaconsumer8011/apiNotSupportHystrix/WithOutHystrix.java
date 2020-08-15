package com.yichen.springcloudeurekaconsumer8011.apiNotSupportHystrix;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

public class WithOutHystrix {

    @Bean
    @Scope
    public Feign.Builder feignBuilder(){
        return  new Feign.Builder();
    }
}
