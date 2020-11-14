package com.noonhope.springboot.service;

import com.noonhope.springboot.entity.UserAddress;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author onlystatic
 * @date 2020-11-14 04:36 PM
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @DubboReference
    private IUserService userService;

    @Override
    public List<UserAddress> initOrder(Integer userId) {

        System.out.println("用户id:" + userId);

        return userService.getUserAddressList(userId);
    }
}
