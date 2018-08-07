package com.yit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author huangjianlou
 * @date 2018/8/3
 */

@EnableZuulProxy
@SpringBootApplication
public class ApiGetWayApplication {

    public static void main(String[] arg){
        SpringApplication.run(ApiGetWayApplication.class, arg);
    }
}
