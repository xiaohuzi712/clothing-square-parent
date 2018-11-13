/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
TODO

======================
Major changs:

Added by zhuhuchao on 2018/11/4

*/
package com.deng.clothing.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
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
        final StringBuilder sb = new StringBuilder("UserDTO{");
        sb.append("phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", level=").append(level);
        sb.append(", levelPic='").append(levelPic).append('\'');
        sb.append(", addTime=").append(addTime);
        sb.append(", modTime=").append(modTime);
        sb.append('}');
        return sb.toString();
    }
}
