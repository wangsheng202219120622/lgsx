package com.ws.util;

import java.util.List;

public class Page<T> {

    /**
     * 当前页
     */
    private Integer current;

    /**
     * 每页展示条数
     */
    private Integer size;

    /**
     * 总条数
     */
    private Integer total;

    /**
     * 总页数
     */
    private Integer totalPages;

    /**
     * 每页数据
     */
    private List<T> records;

    public Page(Integer current,Integer size,Integer total,List<T> records){
        if(null==current) current = 1;
        if(null==size) size = 5;
        this.current =current;
        this.size = size;
        this.total = total;
        double number = new Double(total)/new Double(size);
        this.totalPages =  (int)Math.ceil(number);
        this.records = records;
    }
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

        public static void main(String[] args) {
        double number = new Double(6)/new Double(5);
        System.out.println(Math.ceil(number));
    }
}
