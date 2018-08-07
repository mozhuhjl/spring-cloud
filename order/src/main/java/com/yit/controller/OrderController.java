package com.yit.controller;

import com.yit.entity.Order;
import com.yit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangjianlou
 * @date 2018/7/31
 */

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "order/{id}")
    public Order queryOrderById(@PathVariable("id") String id) {
        return this.orderService.queryOrderById(id);
    }
}
