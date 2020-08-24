package com.atguigu.springcloud;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.springcloud.dao")
@EnableDiscoveryClient
public class PaymentMain8001 {
    public static void main(String [] args){
        SpringApplication.run(PaymentMain8001.class,args);
    }
}