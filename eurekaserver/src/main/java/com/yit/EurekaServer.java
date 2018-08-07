package com.yit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author huangjianlou
 * @date 2018/7/31
 */

@SpringBootApplication
//声明这是一个eureka服务
@EnableEurekaServer
public class EurekaServer {

    public static void main(String[] arg){
        SpringApplication.run(EurekaServer.class, arg);
    }
}
