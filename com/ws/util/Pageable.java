package com.ws.util;

/**
 * 分页分页结构
 */
public class Pageable {

    /**
     * 查询开始行
     */
    private Integer starRow = 0;

    /**
     * 查询页数量
     */
    private Integer pageQuantity = 5;

    /**
     *
     * @param pageNumber 页码
     * @param pageQuantity 每页展示数量
     */
    public Pageable(Integer pageNumber, Integer pageQuantity){
        if(pageNumber!=null && pageQuantity!=null){
            this.starRow = (pageNumber-1)*pageQuantity;
            this.pageQuantity = pageQuantity;
        }
    }

    public Integer getStarRow() {
        return starRow;
    }

    public void setStarRow(Integer starRow) {
        this.starRow = starRow;
    }

    public Integer getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(Integer pageQuantity) {
        this.pageQuantity = pageQuantity;
    }
}
