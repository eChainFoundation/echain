package com.echain.entity;

import java.util.Date;

public class EcPoints extends BaseEntity {

    private Long userId;

    private Long dappId;

    private Long userDappId;

    private Long transactionId;

    private Long points;

    private String type;

    private String describeText;

    private Date createTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDappId() {
        return dappId;
    }

    public void setDappId(Long dappId) {
        this.dappId = dappId;
    }

    public Long getUserDappId() {
        return userDappId;
    }

    public void setUserDappId(Long userDappId) {
        this.userDappId = userDappId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDescribeText() {
        return describeText;
    }

    public void setDescribeText(String describeText) {
        this.describeText = describeText == null ? null : describeText.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public EcPoints() {
    }

    public EcPoints(Long userId, Long dappId, Long userDappId, Long transactionId, Long points, String type, String describeText, Date createTime) {
        this.userId = userId;
        this.dappId = dappId;
        this.userDappId = userDappId;
        this.transactionId = transactionId;
        this.points = points;
        this.type = type;
        this.describeText = describeText;
        this.createTime = createTime;
    }
}