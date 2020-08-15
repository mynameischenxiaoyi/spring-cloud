package com.yichen.springcloudeurekaserver9000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer9000Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer9000Application.class, args);
    }

}
