package com.noonhope.springboot.entity;

import lombok.*;

/**
 * @author onlystatic
 * @date 2020-11-14 01:33 PM
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserAddress {

    private Integer id;

    private String receiverName;

    private String phoneNumber;

    private String address;

}
