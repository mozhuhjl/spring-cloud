package com.yit.service;

import com.yit.entity.Item;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author huangjianlou
 * @date 2018/8/3
 */

@FeignClient(value = "product-service")
public interface ItemFeignClient {

    @GetMapping(value = "/item/{id}")
    Item queryItemById(@PathVariable("id") Long id);
}
