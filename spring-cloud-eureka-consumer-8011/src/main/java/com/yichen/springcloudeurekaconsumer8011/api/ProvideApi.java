package com.yichen.springcloudeurekaconsumer8011.api;

import com.yichen.springcloudeurekaconsumer8011.apiNotSupportHystrix.WithOutHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
//@FeignClient(name = "ms-consumer-provide",configuration = WithOutHystrix.class,fallback = ProvideApiFallback.class)
@FeignClient(name = "ms-consumer-provide",fallback = ProvideApiFallback.class)
public interface ProvideApi {

    @RequestMapping("/list")
    Object  getPersonList();

    @RequestMapping("/getPoint")
    String getPoint();


    @RequestMapping("/getTimeOut")
    String getTimeOut();

//    @GetMapping("list")
//    public Object  getPersonList(){
//        return personServer.getPersonList();
//    }
//
//    @Value("${server.port}")
//    String point;
//
//    @GetMapping("getPoint")
//    public String getPoint(){
//        return point;
//    }
}
