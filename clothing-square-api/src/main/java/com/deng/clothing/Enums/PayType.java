/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
付款类型

======================
Major changs:

Added by zhuhuchao on 2018/11/5

*/
package com.deng.clothing.Enums;

public enum PayType {
    ONLINE(1,"线上支付"),
    OFFLINE(2,"线下支付");

    private int type;
    private String name;

    PayType(int type, String name) {
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
