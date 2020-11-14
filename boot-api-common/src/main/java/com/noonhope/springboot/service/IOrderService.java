package com.noonhope.springboot.service;

import com.noonhope.springboot.entity.UserAddress;

import java.util.List;

/**
 * @author onlystatic
 * @date 2020-11-14 04:26 PM
 */
public interface IOrderService {

    /**
     * 初始化订单
     *
     * @param userId
     * @return
     */
    List<UserAddress> initOrder(Integer userId);
}
