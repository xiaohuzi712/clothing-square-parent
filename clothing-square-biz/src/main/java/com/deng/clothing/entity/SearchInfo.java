/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
用户搜索历史模型

======================
Major changs:

Added by zhuhuchao on 2018/11/13

*/
package com.deng.clothing.entity;

import java.util.Date;

public class SearchInfo {
    /**
     * 自增长ID
     */
    private int ID;

    /**
     * 用户唯一标识
     */
    private int userId;

    /**
     * 搜索关键字
     */
    private String keyWord;

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
        final StringBuilder sb = new StringBuilder("SearchInfo{");
        sb.append("ID=").append(ID);
        sb.append(", userId=").append(userId);
        sb.append(", keyWord='").append(keyWord).append('\'');
        sb.append(", addTime=").append(addTime);
        sb.append(", modTime=").append(modTime);
        sb.append('}');
        return sb.toString();
    }
}
