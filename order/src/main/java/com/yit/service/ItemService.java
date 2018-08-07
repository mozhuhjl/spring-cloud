package com.yit.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yit.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author huangjianlou
 * @date 2018/7/31
 */
@Service
public class ItemService {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private DiscoveryClient discoveryClient;

//    @Value("${yit.item.url}")
//    private String yitItemUrl;
//    @Autowired
//    private OrderProperties orderProperties;

//    public Item queryItemById(Long id) {
//        String serviceId = "product-service";
//        List<ServiceInstance> instanceInfoList = discoveryClient.getInstances(serviceId);
//        if (CollectionUtils.isEmpty(instanceInfoList)) {
//            return null;
//        }
//        ServiceInstance instanceInfo = instanceInfoList.get(0);
//        String url = instanceInfo.getHost() + ":" + instanceInfo.getPort();
//        return this.restTemplate.getForObject("http://" + url + "/item/" + id, Item.class);
//    }

//    @HystrixCommand(fallbackMethod = "queryItemFallback")
//    public Item queryItemById(Long id) {
//        String serviceId = "product-service";
//        return this.restTemplate.getForObject("http://" + serviceId + "/item/" + id, Item.class);
//    }
//
//    private Item queryItemFallback(Long id, Throwable throwable) {
//        return new Item(id, "查询商品信息出错！", null, null, null);
//    }

    @Autowired
    private ItemFeignClient itemFeignClient;

    @HystrixCommand(fallbackMethod = "queryItemFallback")
    public Item queryItemById(Long id) {
        return this.itemFeignClient.queryItemById(id);
    }

    private Item queryItemFallback(Long id) {
        return new Item(id, "查询商品信息出错！", null, null, null);
    }
}
