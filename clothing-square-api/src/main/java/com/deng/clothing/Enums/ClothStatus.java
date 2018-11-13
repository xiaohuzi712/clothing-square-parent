/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
TODO

======================
Major changs:

Added by zhuhuchao on 2018/11/5

*/
package com.deng.clothing.Enums;

public enum ClothStatus {
    ONLINE(1,"在售"),
    OFFLINE(2,"下架");

    private int type;
    private  String name;

    ClothStatus(int type, String name) {
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
