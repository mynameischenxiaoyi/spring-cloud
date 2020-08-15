package com.yichen.springcloudfeignapi.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ms-consumer-provide",fallback = ProvideApiFallback.class)
public interface ProvideApi {

    @RequestMapping("/list")
    Object  getPersonList();

    @RequestMapping("/getPoint")
    String getPoint();



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
