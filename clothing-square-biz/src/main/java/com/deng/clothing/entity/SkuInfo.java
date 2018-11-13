/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
衣服的sku模型

======================
Major changs:

Added by zhuhuchao on 2018/11/12

*/
package com.deng.clothing.entity;

import lombok.Data;

import java.util.Date;

@Data
public class SkuInfo {

    /**
     * 衣服skuID
     */
    private int skuID;

    /**
     * 衣服主键ID
     */
    private int clothId;

    /**
     * 衣服颜色
     */
    private String color;

    /**
     * 衣服尺码
     */
    private String size;

    /**
     * 库存数量
     */
    private int stock;

    /**
     * 首图
     */
    private String headPic;

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
        final StringBuilder sb = new StringBuilder("SkuInfo{");
        sb.append("skuID=").append(skuID);
        sb.append(", clothId=").append(clothId);
        sb.append(", color='").append(color).append('\'');
        sb.append(", size='").append(size).append('\'');
        sb.append(", stock=").append(stock);
        sb.append(", headPic='").append(headPic).append('\'');
        sb.append(", addTime=").append(addTime);
        sb.append(", modTime=").append(modTime);
        sb.append('}');
        return sb.toString();
    }
}
