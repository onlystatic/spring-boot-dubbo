package com.noonhope.springboot.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.noonhope.springboot.entity.UserAddress;
import java.util.ArrayList;
import java.util.List;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

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
    @HystrixCommand
    public List<UserAddress> getUserAddressList(Integer userId) {
        List<UserAddress> userAddressList = new ArrayList<>();
        userAddressList.add(new UserAddress(1, "张三三", "13434567890",
                "深圳市福田区福华三路1688号。"));
        userAddressList.add(new UserAddress(1, "张三三", "13434567890",
                "深圳市南山区深南大道10000号。"));
        if (Math.random() > 0.5) {
            throw new RuntimeException("服务出错。");
        }
        return userAddressList;
    }

}
