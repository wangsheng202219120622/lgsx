package com.ws.model.bo;

public class OrderBo {
    private String commodityCode;
    private String address;
    private Integer userId;
    private String phone;
    private String consignee;
    private Boolean isUseIntegral;

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCommodityCode() {
        return commodityCode;
    }
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getConsignee() {
        return consignee;
    }
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public void setUseIntegral(Boolean useIntegral) {
        isUseIntegral = useIntegral;
    }
    public boolean getUseIntegral() {
        return isUseIntegral;
    }

}
