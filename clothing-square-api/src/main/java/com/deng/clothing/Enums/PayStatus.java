/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
付款状态枚举

======================
Major changs:

Added by zhuhuchao on 2018/11/5

*/
package com.deng.clothing.Enums;

public enum PayStatus {
    UNPAID(1,"待付款"),
    PAID(2,"已付款");

    private int type;
    private String name;

    PayStatus(int type, String name) {
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
