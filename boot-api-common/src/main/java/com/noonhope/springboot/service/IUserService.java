package com.noonhope.springboot.service;

import com.noonhope.springboot.entity.UserAddress;

import java.util.List;

/**
 * @author onlystatic
 * @date 2020-11-14 04:21 PM
 */
public interface IUserService {

    /**
     * 根据用户id查询用户地址
     *
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(Integer userId);
}
