package com.example.dbresolve.model;

import java.math.BigDecimal;
import java.util.Date;

public class mdContractAccount {
    private Integer contractAccountId;

    private Integer contractId;

    private Integer customerId;

    private Integer housePropertyId;

    private Integer meterId;

    private Integer calcTimeRuleId;

    private Integer calcPopulationRuleId;

    private String companyCodeNo;

    private String contractNo;

    private String meterTrade;

    private Byte calcExecType;

    private Byte accountStatus;

    private BigDecimal accountBalance;

    private String rateTypeCodeNo;

    private Date rateTypeBeginTime;

    private Date rateTypeEndTime;

    private Byte delFlag;

    private Date createTime;

    private Date updateTime;

    private Integer cityId;

    private Date screateTime;

    private Date supdateTime;

    private String gasSupplyAgreementNum;

    private String remark;

    public Integer getContractAccountId() {
        return contractAccountId;
    }

    public void setContractAccountId(Integer contractAccountId) {
        this.contractAccountId = contractAccountId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getHousePropertyId() {
        return housePropertyId;
    }

    public void setHousePropertyId(Integer housePropertyId) {
        this.housePropertyId = housePropertyId;
    }

    public Integer getMeterId() {
        return meterId;
    }

    public void setMeterId(Integer meterId) {
        this.meterId = meterId;
    }

    public Integer getCalcTimeRuleId() {
        return calcTimeRuleId;
    }

    public void setCalcTimeRuleId(Integer calcTimeRuleId) {
        this.calcTimeRuleId = calcTimeRuleId;
    }

    public Integer getCalcPopulationRuleId() {
        return calcPopulationRuleId;
    }

    public void setCalcPopulationRuleId(Integer calcPopulationRuleId) {
        this.calcPopulationRuleId = calcPopulationRuleId;
    }

    public String getCompanyCodeNo() {
        return companyCodeNo;
    }

    public void setCompanyCodeNo(String companyCodeNo) {
        this.companyCodeNo = companyCodeNo == null ? null : companyCodeNo.trim();
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getMeterTrade() {
        return meterTrade;
    }

    public void setMeterTrade(String meterTrade) {
        this.meterTrade = meterTrade == null ? null : meterTrade.trim();
    }

    public Byte getCalcExecType() {
        return calcExecType;
    }

    public void setCalcExecType(Byte calcExecType) {
        this.calcExecType = calcExecType;
    }

    public Byte getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Byte accountStatus) {
        this.accountStatus = accountStatus;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getRateTypeCodeNo() {
        return rateTypeCodeNo;
    }

    public void setRateTypeCodeNo(String rateTypeCodeNo) {
        this.rateTypeCodeNo = rateTypeCodeNo == null ? null : rateTypeCodeNo.trim();
    }

    public Date getRateTypeBeginTime() {
        return rateTypeBeginTime;
    }

    public void setRateTypeBeginTime(Date rateTypeBeginTime) {
        this.rateTypeBeginTime = rateTypeBeginTime;
    }

    public Date getRateTypeEndTime() {
        return rateTypeEndTime;
    }

    public void setRateTypeEndTime(Date rateTypeEndTime) {
        this.rateTypeEndTime = rateTypeEndTime;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    public String getGasSupplyAgreementNum() {
        return gasSupplyAgreementNum;
    }

    public void setGasSupplyAgreementNum(String gasSupplyAgreementNum) {
        this.gasSupplyAgreementNum = gasSupplyAgreementNum == null ? null : gasSupplyAgreementNum.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}