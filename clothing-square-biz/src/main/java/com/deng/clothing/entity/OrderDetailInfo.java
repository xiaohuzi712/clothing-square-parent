/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
订单详情模型

======================
Major changs:

Added by zhuhuchao on 2018/11/13

*/
package com.deng.clothing.entity;

import lombok.Data;

import java.util.Date;

@Data
public class OrderDetailInfo {

    /**
     * 自增长ID
     */
    private int ID;

    /**
     * 订单id
     */
    private int orderId;

    /**
     * 衣服ID
     */
    private int clothId;

    /**
     * 衣服描述
     */
    private String description;

    /**
     * 衣服skuID
     */
    private int skuID;

    /**
     * sku描述信息
     */
    private String skuDesc;

    /**
     * sku头图
     */
    private String headPic;

    /**
     * 购买数量
     */
    private int count;

    /**
     * 单价
     */
    private double price;

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
        final StringBuilder sb = new StringBuilder("OrderDetailInfo{");
        sb.append("ID=").append(ID);
        sb.append(", orderId=").append(orderId);
        sb.append(", clothId=").append(clothId);
        sb.append(", description='").append(description).append('\'');
        sb.append(", skuID=").append(skuID);
        sb.append(", skuDesc='").append(skuDesc).append('\'');
        sb.append(", headPic='").append(headPic).append('\'');
        sb.append(", count=").append(count);
        sb.append(", price=").append(price);
        sb.append(", addTime=").append(addTime);
        sb.append(", modTime=").append(modTime);
        sb.append('}');
        return sb.toString();
    }
}
