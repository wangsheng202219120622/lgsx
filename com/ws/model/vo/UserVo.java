package com.ws.model.vo;

public class UserVo {
    private Integer id;
    private String account;
    private String password;
    private String NickName;
    private Long amountOfMoney;
    private Long integral;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return NickName;
    }
    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public Long getAmountOfMoney() {
        return amountOfMoney;
    }
    public void setAmountOfMoney(Long amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public Long getIntegral() { return integral; }
    public void setIntegral(Long integral) {
        this.integral = integral;
    }

}
