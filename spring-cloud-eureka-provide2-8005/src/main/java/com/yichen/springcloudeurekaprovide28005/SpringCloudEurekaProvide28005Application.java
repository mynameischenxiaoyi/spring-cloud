package com.yichen.springcloudeurekaprovide28005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class SpringCloudEurekaProvide28005Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaProvide28005Application.class, args);
    }

}
