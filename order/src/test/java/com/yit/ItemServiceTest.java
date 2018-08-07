package com.yit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author huangjianlou
 * @date 2018/8/3
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Import(OrderApplication.class)
public class ItemServiceTest {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Test
    public void test(){
        String serviceId = "product-service";
        for (int i = 0; i < 100; i++) {
            ServiceInstance serviceInstance = this.loadBalancerClient.choose(serviceId);
            System.out.println("第"+(i+1)+"次：" + serviceInstance.getHost() + ": " + serviceInstance.getPort());
        }
    }
}
