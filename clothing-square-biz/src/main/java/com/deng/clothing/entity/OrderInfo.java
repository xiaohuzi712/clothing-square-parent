/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
订单表

======================
Major changs:

Added by zhuhuchao on 2018/11/5

*/
package com.deng.clothing.entity;
import lombok.Data;

import java.util.Date;

@Data
public class OrderInfo {
    /**
     * 订单id
     */
    private int orderId;

    /**
     * 订单号
     */
    private String orderNumber;

    /**
     * 用户唯一标识
     */
    private String userId;

    /**
     * 交易状态
     * @see com.deng.clothing.Enums.OrderStatus
     */
    private int orderStatus;

    /**
     * 付款类型：
     * @see com.deng.clothing.Enums.PayType
     */
    private int payType;

    /**
     * 支付来源，微信，支付宝等
     */
    private int paySource;

    /**
     * 付款状态
     * @see com.deng.clothing.Enums.PayStatus
     */
    private int payStatus;

    /**
     * 订单金额
     */
    private String orderAmount;

    /**
     * 实付金额
     */
    private String payAmount;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 配送方式
     */
    private int sendType;

    /**
     * 订单留言
     */
    private String orderMessage;

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
        final StringBuilder sb = new StringBuilder("OrderInfo{");
        sb.append("orderId=").append(orderId);
        sb.append(", orderNumber='").append(orderNumber).append('\'');
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", payType=").append(payType);
        sb.append(", paySource=").append(paySource);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", orderAmount='").append(orderAmount).append('\'');
        sb.append(", payAmount='").append(payAmount).append('\'');
        sb.append(", orderTime=").append(orderTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", sendType=").append(sendType);
        sb.append(", orderMessage='").append(orderMessage).append('\'');
        sb.append(", addTime=").append(addTime);
        sb.append(", modTime=").append(modTime);
        sb.append('}');
        return sb.toString();
    }
}
