package com.yangxueyong.create.data.service.system.impl;


import com.yangxueyong.create.data.entity.system.UserInfo;
import com.yangxueyong.create.data.entity.system.io.UserInfoIO;
import com.yangxueyong.create.data.mapper.system.UserInfoMapper;
import com.yangxueyong.create.data.service.system.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* UserInfoImpl
*
* @author yangxueyong
* @date 2022-04-27 09:06:46
*/
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectByPhone(String phoneNum) {
        return userInfoMapper.selectByPhone(phoneNum);
    }

    @Override
    public int updateByPrimaryKeySelective(UserInfo record) {
        return userInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByWxOpenIdSelective(UserInfo record) {
        return userInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public UserInfo selectByWXOpenId(String openId) {
        return userInfoMapper.selectByWXOpenId(openId);
    }

    @Override
    public UserInfo selectByUser(UserInfoIO userInfoIO) {
        return userInfoMapper.selectByUser(userInfoIO);
    }
}
