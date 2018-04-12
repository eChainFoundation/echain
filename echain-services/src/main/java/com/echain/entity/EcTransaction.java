package com.echain.entity;

import java.util.Date;

public class EcTransaction extends BaseEntity {

    private Long userId;

    private Long dappId;

    private Long userDappId;

    private String transactionPlatform;

    private String transactionNo;

    private String transactionPicture;

    private Long logisticsCompanyId;

    private String logisticsNo;

    private String describeMd5;
    
    private String status;
    
    private String errorMsg;
    
    private String transactionKey;
    
    private String transactionHash;

    private Date createTime;

    private String describeText;

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

    public String getTransactionPlatform() {
        return transactionPlatform;
    }

    public void setTransactionPlatform(String transactionPlatform) {
        this.transactionPlatform = transactionPlatform == null ? null : transactionPlatform.trim();
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo == null ? null : transactionNo.trim();
    }

    public String getTransactionPicture() {
        return transactionPicture;
    }

    public void setTransactionPicture(String transactionPicture) {
        this.transactionPicture = transactionPicture == null ? null : transactionPicture.trim();
    }

    public String getTransactionKey() {
		return transactionKey;
	}

	public void setTransactionKey(String transactionKey) {
		this.transactionKey = transactionKey;
	}

	public String getTransactionHash() {
		return transactionHash;
	}

	public void setTransactionHash(String transactionHash) {
		this.transactionHash = transactionHash;
	}

	public Long getLogisticsCompanyId() {
        return logisticsCompanyId;
    }

    public void setLogisticsCompanyId(Long logisticsCompanyId) {
        this.logisticsCompanyId = logisticsCompanyId;
    }

    public String getLogisticsNo() {
        return logisticsNo;
    }

    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo == null ? null : logisticsNo.trim();
    }

    public String getDescribeMd5() {
        return describeMd5;
    }

    public void setDescribeMd5(String describeMd5) {
        this.describeMd5 = describeMd5 == null ? null : describeMd5.trim();
    }

    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDescribeText() {
        return describeText;
    }

    public void setDescribeText(String describeText) {
        this.describeText = describeText == null ? null : describeText.trim();
    }
}