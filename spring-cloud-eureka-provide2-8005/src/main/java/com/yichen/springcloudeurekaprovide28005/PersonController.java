package com.yichen.springcloudeurekaprovide28005;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonServer personServer;

    @GetMapping("list")
    public Object  getPersonList(){
        return personServer.getPersonList();
    }

    @Value("${server.port}")
    String point;

    @GetMapping("getPoint")
    public String getPoint(){
        return point;
    }

    @GetMapping("getTimeOut")
    @HystrixCommand(fallbackMethod ="getTimeOutFallBack" )
    public String  getTimeOut(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String  getTimeOutFallBack(){
        return "8005-getTimeOutFallBack服务降级";
    }


}
