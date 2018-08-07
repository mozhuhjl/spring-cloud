package com.yit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author huangjianlou
 * @date 2018/7/31
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ProductApplication {

    public static void main(String[] arg){
        SpringApplication.run(ProductApplication.class, arg);
    }
}
