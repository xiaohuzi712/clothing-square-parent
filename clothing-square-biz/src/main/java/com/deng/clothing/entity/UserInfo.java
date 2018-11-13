/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
用户信息表

======================
Major changs:

Added by zhuhuchao on 2018/11/4

*/
package com.deng.clothing.entity;


import lombok.Data;

import java.util.Date;

@Data
public class UserInfo {
    /**
     * 主键，自增长ID
     */
    private int ID;

    /**
     * 客户手机号
     */
    private String phoneNumber;

    /**
     * 用户唯一标识
     */
    private String userId;

    /**
     * 用户登录密码
     */
    private String password;

    /**
     * 微信Token
     */
    private String wxToken;

    /**
     * 开放ID
     */
    private String openId;

    /**
     * 用户等级
     */
    private int level;

    /**
     * 等级图片
     */
    private String levelPic;

    /**
     * 创建时间
     */
    private Date addTime;

    /**
     * 修改时间
     */
    private Date modTime;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserInfo{");
        sb.append("ID=").append(ID);
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", wxToken='").append(wxToken).append('\'');
        sb.append(", openId='").append(openId).append('\'');
        sb.append(", level=").append(level);
        sb.append(", levelPic='").append(levelPic).append('\'');
        sb.append(", addTime=").append(addTime);
        sb.append(", modTime=").append(modTime);
        sb.append('}');
        return sb.toString();
    }
}
