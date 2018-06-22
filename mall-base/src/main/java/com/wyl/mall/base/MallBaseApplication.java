package com.wyl.mall.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
* @Title: AquariusBaseApplication 
* @Package com.wyl.mall.order
* @Description: 
* @author 陈宇霖  
* @date 2017/9/11 14:24
* @version V1.0   
*/

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.wyl.*")
@EnableFeignClients(basePackages = "com.wyl.*")
@MapperScan("com.wyl.**.dao")
public class MallBaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallBaseApplication.class, args);
    }
}
