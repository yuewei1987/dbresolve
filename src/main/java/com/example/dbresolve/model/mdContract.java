package com.example.dbresolve.model;

import java.util.Date;

public class mdContract {
    private Integer contractId;

    private String contractNo;

    private String companyCodeNo;

    private Byte deleteFlag;

    private Date createTime;

    private Integer createUser;

    private Date updateTime;

    private Integer updateUser;

    private Byte delFlag;

    private Integer cityId;

    private Date screateTime;

    private Date supdateTime;

    private String paymentState;

    private String specialContractNo;

    private String profitCenter;

    private String subjectFlag;

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getCompanyCodeNo() {
        return companyCodeNo;
    }

    public void setCompanyCodeNo(String companyCodeNo) {
        this.companyCodeNo = companyCodeNo == null ? null : companyCodeNo.trim();
    }

    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Date getScreateTime() {
        return screateTime;
    }

    public void setScreateTime(Date screateTime) {
        this.screateTime = screateTime;
    }

    public Date getSupdateTime() {
        return supdateTime;
    }

    public void setSupdateTime(Date supdateTime) {
        this.supdateTime = supdateTime;
    }

    public String getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(String paymentState) {
        this.paymentState = paymentState == null ? null : paymentState.trim();
    }

    public String getSpecialContractNo() {
        return specialContractNo;
    }

    public void setSpecialContractNo(String specialContractNo) {
        this.specialContractNo = specialContractNo == null ? null : specialContractNo.trim();
    }

    public String getProfitCenter() {
        return profitCenter;
    }

    public void setProfitCenter(String profitCenter) {
        this.profitCenter = profitCenter == null ? null : profitCenter.trim();
    }

    public String getSubjectFlag() {
        return subjectFlag;
    }

    public void setSubjectFlag(String subjectFlag) {
        this.subjectFlag = subjectFlag == null ? null : subjectFlag.trim();
    }
}