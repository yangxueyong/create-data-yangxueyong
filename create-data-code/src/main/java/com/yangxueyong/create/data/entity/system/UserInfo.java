package com.yangxueyong.create.data.entity.system;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * null实体类
 * <p>
 * userId 主键<br>
 * userName 姓名<br>
 * wxOpenid 微信openId<br>
 * wxNickName 微信昵称<br>
 * wxHeaderImg 微信头像<br>
 * phoneNum 电话<br>
 * createUserNo 创建人<br>
 * createTime 创建时间<br>
 * maintenanceUserNo 修改人<br>
 * maintenanceTime 修改时间<br>
*
* @author 系统
* @date Create Time: Wed Apr 27 09:06:46 CST 2022
 */
@ApiModel(value="com.yangxueyong.create.data.entity.system.UserInfo",description="用户表")
@Data()
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    /**
     * 主键
     */
    @ApiModelProperty(value="主键",name="userId")
    @Length(max = 60, message = "主键名长度最长为60")
    private String userId;

    /**
     * 姓名
     */
    @ApiModelProperty(value="姓名",name="userName")
    @Length(max = 200, message = "姓名名长度最长为200")
    private String userName;

    /**
     * 微信openId
     */
    @ApiModelProperty(value="微信openId",name="wxOpenId")
    @Length(max = 100, message = "微信openId名长度最长为100")
    private String wxOpenId;

    /**
     * 微信昵称
     */
    @ApiModelProperty(value="微信昵称",name="wxNickName")
    @Length(max = 100, message = "微信昵称名长度最长为100")
    private String wxNickName;

    /**
     * 微信头像
     */
    @ApiModelProperty(value="微信头像",name="wxHeaderImg")
    @Length(max = 500, message = "微信头像名长度最长为500")
    private String wxHeaderImg;

    /**
     * 电话
     */
    @ApiModelProperty(value="电话",name="phoneNum")
    @Length(max = 100, message = "电话名长度最长为100")
    private String phoneNum;

    /**
     * 创建人
     */
    @ApiModelProperty(value="创建人",name="createUserNo")
    @Length(max = 100, message = "创建人名长度最长为100")
    private String createUserNo;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间",name="createTime")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date createTime;

    /**
     * 修改人
     */
    @ApiModelProperty(value="修改人",name="maintenanceUserNo")
    @Length(max = 100, message = "修改人名长度最长为100")
    private String maintenanceUserNo;

    /**
     * 修改时间
     */
    @ApiModelProperty(value="修改时间",name="maintenanceTime")
    @Length(max = 100, message = "修改时间名长度最长为100")
    private String maintenanceTime;

    private String byWhat;

    /**
     * 身份证信息
     */
    @ApiModelProperty(value="身份证信息",name="maintenanceTime")
    @Length(max = 100, message = "身份证信息长度最长为100")
    private String idCard;
}