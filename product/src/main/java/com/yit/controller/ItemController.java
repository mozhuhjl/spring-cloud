package com.yit.controller;

import com.yit.entity.Item;
import com.yit.entity.JdbcConfigBean;
import com.yit.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangjianlou
 * @date 2018/7/31
 */

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @Autowired
    JdbcConfigBean jdbcConfigBean;

    @GetMapping(value = "item/{id}")
    public Item queryItemById(@PathVariable("id") Long id) {
        return itemService.queryItemById(id);
    }

    @GetMapping(value = "test")
    public String test(){
        return this.jdbcConfigBean.toString();
    }
}
