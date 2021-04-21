package com.hamaliel;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.hamaliel.dao")
public class EurekaServiceProviderApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceProviderApplication2.class, args);
    }
}
