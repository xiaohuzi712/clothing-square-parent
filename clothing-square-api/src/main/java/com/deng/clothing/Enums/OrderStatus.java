/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
订单状态

======================
Major changs:

Added by zhuhuchao on 2018/11/5

*/
package com.deng.clothing.Enums;

public enum OrderStatus {
    DOING(1,"交易中"),
    SUCCESS(2,"交易成功"),
    CANCEL(3,"交易取消");

    private int type;
    private String name;

    OrderStatus(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
