package com.noonhope.springboot.service;

import com.noonhope.springboot.entity.UserAddress;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户服务
 *
 * @author onlystatic
 * @date 2020-11-14 04:30 PM
 */
@Service
@DubboService
public class UserServiceImpl implements IUserService {

    @Override
    public List<UserAddress> getUserAddressList(Integer userId) {
        List<UserAddress> userAddressList = new ArrayList<>();
        userAddressList.add(new UserAddress(1, "张三三", "13434567890",
                "深圳市福田区福华三路1688号。"));
        userAddressList.add(new UserAddress(1, "张三三", "13434567890",
                "深圳市南山区深南大道10000号。"));
        return userAddressList;
    }
}
