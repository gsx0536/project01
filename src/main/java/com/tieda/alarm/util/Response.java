package com.tieda.alarm.util;

public class Response {
    private Long pageNum;//页码
    private Long pageCount;
    private Integer totalCount;//总条数
    private Long pageStart;
    private Object data;//数据
    private Integer modifyRight;//修改权限

    public Response() {
    }

    public Response(Integer totalCount, Object data) {
        this.totalCount = totalCount;
        this.data = data;
    }

    public Response(Integer totalCount, Object data, Integer modifyRight) {
        this.totalCount = totalCount;
        this.data = data;
        this.modifyRight = modifyRight;
    }

    public Response(Long pageNum, Long pageCount, Long pageStart, Object data) {
        this.pageNum = pageNum;
        this.pageCount = pageCount;
        this.pageStart = pageStart;
        this.data = data;
    }

    public Response(Object data) {
        this.data = data;
    }

    public Long getPageNum() {
        return pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public Long getPageCount() {
        return pageCount;
    }

    public void setPageCount(Long pageCount) {
        this.pageCount = pageCount;
    }

    public Long getPageStart() {
        return pageStart;
    }

    public void setPageStart(Long pageStart) {
        this.pageStart = pageStart;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getModifyRight() {
        return modifyRight;
    }

    public void setModifyRight(Integer modifyRight) {
        modifyRight = modifyRight;
    }
}
