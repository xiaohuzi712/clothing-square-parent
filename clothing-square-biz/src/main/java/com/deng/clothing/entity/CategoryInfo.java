/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
衣服分类模型表

======================
Major changs:

Added by zhuhuchao on 2018/11/12

*/
package com.deng.clothing.entity;

import lombok.Data;

import java.util.Date;

@Data
public class CategoryInfo {

    /**
     * 分类主键
     */
    private int categoryId;

    /**
     * 父分类ID
     */
    private int fatherId;

    /**
     * 分类名
     */
    private String categoryName;

    /**
     * 封面图
     */
    private String cover;

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
        final StringBuilder sb = new StringBuilder("CategoryInfo{");
        sb.append("categoryId=").append(categoryId);
        sb.append(", fatherId=").append(fatherId);
        sb.append(", categoryName='").append(categoryName).append('\'');
        sb.append(", addTime=").append(addTime);
        sb.append(", modTime=").append(modTime);
        sb.append('}');
        return sb.toString();
    }
}
