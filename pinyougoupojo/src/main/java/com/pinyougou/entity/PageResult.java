package com.pinyougou.entity;

import java.io.Serializable;
import java.util.List;


//分页结果实体类
public class PageResult implements Serializable {

    private long total;//总记录数
    private List rows;//当前页结果


    public PageResult() {
    }

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    /**
     * 获取
     * @return total
     */
    public long getTotal() {
        return total;
    }

    /**
     * 设置
     * @param total
     */
    public void setTotal(long total) {
        this.total = total;
    }

    /**
     * 获取
     * @return rows
     */
    public List getRows() {
        return rows;
    }

    /**
     * 设置
     * @param rows
     */
    public void setRows(List rows) {
        this.rows = rows;
    }

    public String toString() {
        return "PageResult{total = " + total + ", rows = " + rows + "}";
    }
}
