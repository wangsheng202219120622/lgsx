package com.ws.model.vo;

/**
 * 商品对象结构
 * 这是一个视图对象（VO），用于封装商品数据，以便在前端显示。它与Commodity类相似，但可能用于不同的目的，如展示额外的信息或定制数据格式。
 * */

public class CommodityVo {

    private Integer id;
    private String code;
    private String name;
    private Long price;
    private Integer quantity;
    private UserVo userVo;

    public UserVo getUserVo() {
        return userVo;
    }
    public void setUserVo(UserVo userVo) {
        this.userVo = userVo;
    }

    public Integer getId() { return id;  }
    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getCode()
    {
        return code;
    }
    public void setCode(String code)
    {
        this.code = code;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public Long getPrice(){  return price;  }
    public void setPrice(Long price)
    {
        this.price = price;
    }

    public Integer getQuantity()
    {
        return quantity;
    }
    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }

}