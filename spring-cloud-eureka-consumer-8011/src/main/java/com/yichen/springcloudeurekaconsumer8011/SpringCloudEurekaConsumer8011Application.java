package com.yichen.springcloudeurekaconsumer8011;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.yichen.springcloudeurekaconsumer8011.api")
@EnableCircuitBreaker
public class SpringCloudEurekaConsumer8011Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaConsumer8011Application.class, args);
    }

}
