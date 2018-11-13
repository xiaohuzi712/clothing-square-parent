/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
物流类型

======================
Major changs:

Added by zhuhuchao on 2018/11/5

*/
package com.deng.clothing.Enums;

public enum SendType {
    PICK_IN_SHOP(1,"到店自取"),
    DELIEVER(2,"送货上门");

    private int type;
    private String name;

    SendType(int type, String name) {
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
