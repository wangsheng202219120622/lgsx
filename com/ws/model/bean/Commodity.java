package com.ws.model.bean;

public class Commodity
{
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    private String code;
    private String name;
    private Long price;
    private Integer quantity;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
