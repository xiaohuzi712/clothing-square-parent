/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
衣服表

======================
Major changs:

Added by zhuhuchao on 2018/11/5

*/
package com.deng.clothing.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ClothInfo {
    /**
     * 衣服ID
     */
    private int clothId;

    /**
     * 衣服描述
     */
    private String description;

    /**
     * 关联ID
     */
    private String clothIds;

    /**
     * 衣服原价
     */
    private double originalPrice;

    /**
     * 衣服打折价
     */
    private double discountPrice;

    /**
     * 衣服宣传图
     */
    private String picUrls;

    /**
     * 衣服首图
     */
    private String headPic;

    /**
     * 在售状态
     */
    private int status;

    /**
     * 是否是积分产品
     */
    private int pointCloth;

    /**
     * 衣服标签
     */
    private String tag;

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
        final StringBuilder sb = new StringBuilder("ClothInfo{");
        sb.append("clothId=").append(clothId);
        sb.append(", description='").append(description).append('\'');
        sb.append(", clothIds='").append(clothIds).append('\'');
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", picUrls='").append(picUrls).append('\'');
        sb.append(", headPic='").append(headPic).append('\'');
        sb.append(", status=").append(status);
        sb.append(", pointCloth=").append(pointCloth);
        sb.append(", tag='").append(tag).append('\'');
        sb.append(", addTime=").append(addTime);
        sb.append(", modTime=").append(modTime);
        sb.append('}');
        return sb.toString();
    }
}
