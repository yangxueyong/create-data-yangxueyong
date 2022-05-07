package com.yangxueyong.create.data.entity.system.io;

import com.yangxueyong.create.data.entity.system.UserInfo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
* UserInfoVo
*
* @author yangxueyong
* @date 2022-04-27 09:06:46
*/
@ApiModel(description="查找用户的io")
@Data()
public class UserInfoIO extends UserInfo {
    private String phoneNum;
    private String idCard;
}