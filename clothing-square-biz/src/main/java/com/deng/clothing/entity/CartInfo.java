/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
TODO

======================
Major changs:

Added by zhuhuchao on 2018/11/12

*/
package com.deng.clothing.entity;


import lombok.Data;

import java.util.Date;

@Data
public class CartInfo {
    /**
     * 自增长主键ID
     */
    private int cartId;

    /**
     * 用户唯一标识
     */
    private String userId;

    /**
     * 衣服ID
     */
    private int clothId;

    /**
     * 衣服skuID
     */
    private int skuId;

    /**
     * sku描述信息
     */
    private String skuDesc;

    /**
     * sku头图
     */
    private String headPic;

    /**
     * 商品数量
     */
    private int count;

    /**
     * 购物车状态
     */
    private int status;

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
        final StringBuilder sb = new StringBuilder("CartInfo{");
        sb.append("cartId=").append(cartId);
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", clothId=").append(clothId);
        sb.append(", skuId=").append(skuId);
        sb.append(", skuDesc='").append(skuDesc).append('\'');
        sb.append(", headPic='").append(headPic).append('\'');
        sb.append(", count=").append(count);
        sb.append(", status=").append(status);
        sb.append(", addTime=").append(addTime);
        sb.append(", modTime=").append(modTime);
        sb.append('}');
        return sb.toString();
    }
}
