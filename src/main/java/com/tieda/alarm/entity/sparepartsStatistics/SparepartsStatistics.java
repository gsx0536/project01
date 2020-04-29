package com.tieda.alarm.entity.sparepartsStatistics;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2019-05-26
 */
@TableName("SPAREPARTS_STATISTICS")
public class SparepartsStatistics implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableId("ID")
    private String id;
    /**
     * 部门
     */
    @TableField("DEPTID")
    private String deptid;

    private String deptname;

    /**
     * 车站

     */
    @TableField("STATION")
    private String station;
    /**
     * 存放位置

     */
    @TableField("PLACE")
    private String place;
    /**
     * 入库日期

     */
    @TableField("INDATE")
    private String indate;
    /**
     * 有效日期

     */
    @TableField("VAILDDATE")
    private String vailddate;
    /**
     * 名称

     */
    @TableField("NAME")
    private String name;
    /**
     * 型号

     */
    @TableField("CODE")
    private String code;
    /**
     * 数量

     */
    @TableField("NUM")
    private Long num;
    /**
     * 厂家

     */
    @TableField("FACTORY")
    private String factory;
    /**
     * 备注

     */
    @TableField("REMARK")
    private String remark;


    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    public String getVailddate() {
        return vailddate;
    }

    public void setVailddate(String vailddate) {
        this.vailddate = vailddate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "SparepartsStatistics{" +
        "id=" + id +
        ", station=" + station +
        ", place=" + place +
        ", indate=" + indate +
        ", vailddate=" + vailddate +
        ", name=" + name +
        ", code=" + code +
        ", num=" + num +
        ", factory=" + factory +
        ", remark=" + remark +
        "}";
    }
}
