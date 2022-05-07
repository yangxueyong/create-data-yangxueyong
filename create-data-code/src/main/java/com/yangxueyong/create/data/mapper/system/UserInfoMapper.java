package com.yangxueyong.create.data.mapper.system;


import com.yangxueyong.create.data.entity.system.UserInfo;
import com.yangxueyong.create.data.entity.system.io.UserInfoIO;
import org.apache.ibatis.annotations.Mapper;

/**
* Interface
* UserInfoMapper
*
* @author 系统
* @date Create Time: Wed Apr 27 09:06:46 CST 2022
*/
@Mapper()
public interface UserInfoMapper {
    /**
     * 根据主键删除数据
     * @param userId
     */
    int deleteByPrimaryKey(String userId);

    /**
     * 插入数据库记录（不建议使用）
     * @param record
     */
    int insert(UserInfo record);

    /**
     * 插入数据库记录（建议使用）
     * @param record
     */
    int insertSelective(UserInfo record);

    /**
     * 根据主键id查询
     * @param userId
     */
    UserInfo selectByPrimaryKey(String userId);

    UserInfo selectByPhone(String phoneNum);

    UserInfo selectByWXOpenId(String openId);

    UserInfo selectByUser(UserInfoIO userInfoIO);

    /**
     * 修改数据(推荐使用)
     * @param record
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * 修改数据
     * @param record
     */
    int updateByPrimaryKey(UserInfo record);
}