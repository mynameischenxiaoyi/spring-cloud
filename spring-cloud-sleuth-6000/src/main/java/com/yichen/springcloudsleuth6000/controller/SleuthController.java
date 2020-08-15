package com.yichen.springcloudsleuth6000.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SleuthController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
