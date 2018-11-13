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
public class CollectInfo {
    /**
     * 收藏ID
     */
    private int collectId;

    /**
     * 用户唯一标识
     */
    private String userId;

    /**
     * 衣服ID
     */
    private int clothId;

    /**
     * 在售状态
     */
    private int status;

    /**
     * 收藏状态
     */
    private int collectStatus;

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
        final StringBuilder sb = new StringBuilder("CollectInfo{");
        sb.append("collectId=").append(collectId);
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", clothId=").append(clothId);
        sb.append(", status=").append(status);
        sb.append(", collectStatus=").append(collectStatus);
        sb.append(", addTime=").append(addTime);
        sb.append(", modTime=").append(modTime);
        sb.append('}');
        return sb.toString();
    }
}
