package com.yichen.springcloudeurekaconsumer8011;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yichen.springcloudeurekaconsumer8011.api.ProvideApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class Consumer8011Controller {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ProvideApi provideApi;

    // hystrix 接口超时降级


    @GetMapping("/getTimeOut")
    public Object getTimeOut() {
        Object body = provideApi.getTimeOut();
        return body;
    }


    // hystrix 接口方法降级
    @GetMapping("/queryUserInfoById/{userId}")
    public Object queryUserInfoById(@PathVariable("userId") Integer userId) {
        Object body = provideApi.getPersonList();
        return body;
    }


    @GetMapping("/getProvidePoint")
    public Object getProvidePoint() {
        String  body = provideApi.getPoint();
        return body;
    }




    // hystrix 本地方法降级

    @HystrixCommand(fallbackMethod = "getHystrixFullBack")
    @GetMapping("/getHystrix")
    public Object getHystrix() {
       int a =  1/0;
        return  "111";
    }

    private String getHystrixFullBack(){
        return "降级方法";
    }

   /* @GetMapping("/queryUserInfoById/{userId}")
    public Object queryUserInfoById(@PathVariable("userId") Integer userId) {
        ResponseEntity<List> responseEntity = restTemplate.getForEntity("http://ms-consumer-provide/list/", List.class);
        List body = responseEntity.getBody();
        return body;
    }


    @GetMapping("/getProvidePoint")
    public Object getProvidePoint() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://ms-consumer-provide/getPoint", String.class);
        String body = responseEntity.getBody();
        return body;
    }*/



}
