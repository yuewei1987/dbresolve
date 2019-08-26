package com.example.dbresolve.model;

public class mdContractAccountNew {
    private Integer id;

    private Integer contractAccountId;

    private Integer contractId;

    private Integer customerId;

    private Integer housePropertyId;

    private Integer meterId;

    private Byte accountStatus;

    private Byte delFlag;

    private Integer cityId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Byte getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Byte accountStatus) {
        this.accountStatus = accountStatus;
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
}