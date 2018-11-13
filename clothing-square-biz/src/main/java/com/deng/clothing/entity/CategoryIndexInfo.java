/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
衣服分类索引表

======================
Major changs:

Added by zhuhuchao on 2018/11/12

*/
package com.deng.clothing.entity;

import java.util.Date;

public class CategoryIndexInfo {

    /**
     * 自增长ID
     */
    private int ID;

    /**
     * 分类主键
     */
    private int categoryId;

    /**
     * 父分类ID
     */
    private int fatherId;

    /**
     * 衣服ID
     */
    private int clothId;

    /**
     * 在售状态
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
        final StringBuilder sb = new StringBuilder("CategoryIndexInfo{");
        sb.append("ID=").append(ID);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", fatherId=").append(fatherId);
        sb.append(", clothId=").append(clothId);
        sb.append(", status=").append(status);
        sb.append(", addTime=").append(addTime);
        sb.append(", modTime=").append(modTime);
        sb.append('}');
        return sb.toString();
    }
}
