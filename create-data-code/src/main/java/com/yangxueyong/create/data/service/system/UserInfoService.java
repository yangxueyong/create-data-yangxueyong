package com.yangxueyong.create.data.service.system;


import com.yangxueyong.create.data.entity.system.UserInfo;
import com.yangxueyong.create.data.entity.system.io.UserInfoIO;

/**
* UserInfoService
*
* @author yangxueyong
* @date 2022-04-27 09:06:46
*/
public interface UserInfoService {
    UserInfo selectByPhone(String phoneNum);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByWxOpenIdSelective(UserInfo record);

    UserInfo selectByWXOpenId(String openId);

    UserInfo selectByUser(UserInfoIO userInfoIO);

}
