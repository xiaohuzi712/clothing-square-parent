/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
用户收货地址模型

======================
Major changs:

Added by zhuhuchao on 2018/11/12

*/
package com.deng.clothing.entity;

import lombok.Data;

import java.util.Date;

@Data
public class AddressInfo {

    /**
     * 自增长ID
     */
    private int ID;

    /**
     * 用户唯一标识
     */
    private int userId;

    /**
     * 收件人
     */
    private String nickName;

    /**
     * 电话
     */
    private String phoneNumber;

    /**
     * 省
     */
    private int prov;

    /**
     * 市
     */
    private int city;

    /**
     * 区
     */
    private int area;

    /**
     * 街道地址
     */
    private String address;

    /**
     * 邮政编码
     */
    private int number;


    /**
     * 是否默认收获地址
     */
    private int defaultAddress;


    /**
     * 添加时间
     */
    private Date addTime;

    /**
     * 修改时间
     */
    private Date modTime;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddressInfo{");
        sb.append("ID=").append(ID);
        sb.append(", userId=").append(userId);
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", prov=").append(prov);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", address='").append(address).append('\'');
        sb.append(", number=").append(number);
        sb.append(", defaultAddress=").append(defaultAddress);
        sb.append(", addTime=").append(addTime);
        sb.append(", modTime=").append(modTime);
        sb.append('}');
        return sb.toString();
    }
}
