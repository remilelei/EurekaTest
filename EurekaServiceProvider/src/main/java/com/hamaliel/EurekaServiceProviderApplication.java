package com.hamaliel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.hamaliel.dao")
@EnableEurekaClient
public class EurekaServiceProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceProviderApplication.class, args);
    }
}
