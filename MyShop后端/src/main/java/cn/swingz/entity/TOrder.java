package cn.swingz.entity;

import java.util.Date;

public class TOrder {
    private Long toId;

    private Long orderId;

    private Long userId;

    private Long orderPrice;

    private Short orderFlag;

    private String orderUser;

    private String orderTel;

    private String orderAddr;

    private Date createdTime;

    private Date updatedTime;

    public Long getToId() {
        return toId;
    }

    public void setToId(Long toId) {
        this.toId = toId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Short getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(Short orderFlag) {
        this.orderFlag = orderFlag;
    }

    public String getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(String orderUser) {
        this.orderUser = orderUser == null ? null : orderUser.trim();
    }

    public String getOrderTel() {
        return orderTel;
    }

    public void setOrderTel(String orderTel) {
        this.orderTel = orderTel == null ? null : orderTel.trim();
    }

    public String getOrderAddr() {
        return orderAddr;
    }

    public void setOrderAddr(String orderAddr) {
        this.orderAddr = orderAddr == null ? null : orderAddr.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}