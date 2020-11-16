package com.noonhope.springboot.service;

import com.google.common.collect.Lists;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.noonhope.springboot.entity.UserAddress;
import java.util.List;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author onlystatic
 * @date 2020-11-14 04:36 PM
 */
@Service
public class OrderServiceImpl implements IOrderService {

    /**
     * url可以写服务提供者地址，不通过注册中心，直连方式访问服务
     */
    @DubboReference()
    private IUserService userService;

    @Override
    @HystrixCommand(fallbackMethod = "initOrderFallback")
    public List<UserAddress> initOrder(Integer userId) {
        System.out.println("用户id:" + userId);
        return userService.getUserAddressList(userId);
    }

    public List<UserAddress> initOrderFallback(Integer userId) {
        return Lists.newArrayList(new UserAddress(1, "测试", "测试号码", "测试地址。"));
    }
}
