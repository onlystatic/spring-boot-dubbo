package entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author onlystatic
 * @date 2020-11-14 01:33 PM
 */
@Data
public class UserAddress {

    private Integer id;

    @JsonProperty("receiver_name")
    private String receiverName;

    @JsonProperty("phone_number")
    private String phoneNumber;

    private String address;
}
