package com.noonhope.springboot.controller;

import com.noonhope.springboot.entity.UserAddress;
import com.noonhope.springboot.service.IOrderService;
import com.noonhope.springboot.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author onlystatic
 * @date 2020-11-14 04:28 PM
 */
@RestController
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @GetMapping("/order/{user_id}")
    public List<UserAddress> initOrder(@PathVariable("user_id") Integer userId) {
        return orderService.initOrder(userId);
    }

}
