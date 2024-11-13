package com.ws.model.bo;
/** 商品传输查询结构 * 这是一个数据传输对象（DTO），用于封装商品查询的业务参数。它包含了当前页、每页展示条数、商品编码和名称。 * */
public class CommodityQueryBo {
    /**     * 当前页     */
    private Integer current;
    /**     * 每页展示条数     */
    private Integer size;
    /**     * 商品编码     */
    private String code;
    /**     * 商品名称     * */
    private String name;

    public void setCurrent(Integer current) {
        this.current = current;
    }
    public Integer getCurrent(){
        return current;
    }
    public void setSize(Integer size){
        this.size = size;
    }
    public Integer getSize(){
        return size;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}