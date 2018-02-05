package org.test.dao.base;

import java.io.Serializable;
import java.util.List;

/**
 *分页辅助类
 *
 */
public class Pagination implements Serializable{
    /**
     * 记录总数
     */
    private int totalCount;
    /**
     * 记录数据集合
     */
    private List records;
    /**
     * 记录开始数
     */
    private int start;
    /**
     * 每页显示记录条数
     */
    private int limit;

    public Pagination() {
        this.totalCount = 0;
        this.records = null;
        this.start = 0;
        this.limit = 15;

    }

    public Pagination(int limit) {
        this.limit = limit;
    }

    /**
     * 获取记录总数
     * @return int 记录总数
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * 设置记录总数
     * @param totalCount 记录总数
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 获取数据记录
     * @return List 数据记录
     */
    public List getRecords() {
        return records;
    }

    /**
     * 设置数据记录
     * @param records 数据记录
     */
    public void setRecords(List records) {
        this.records = records;
    }

    /**
     * 获取记录开始数
     * @return int 记录开始数
     */
    public int getStart() {
        return start;
    }

    /**
     * 设置记录开始数
     * @param start 记录开始数
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * 获取每页显示记录条数
     * @return int 每页显示记录条数
     */
    public int getLimit() {
        return limit;
    }

    /**
     * 设置每页显示记录条数
     * @param limit 每页显示记录条数
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }
}