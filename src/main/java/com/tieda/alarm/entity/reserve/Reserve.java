package com.tieda.alarm.entity.reserve;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;

/**
 * <p>
 * 备品备件统计表
 * </p>
 *
 * @author
 * @since 2019-05-11
 */
public class Reserve implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 车间
     */
    @TableField("WORKSHOP" )
    private String workshop;
    /**
     * 工区
     */
    @TableField("WORKAREA" )
    private String workarea;
    /**
     * 车站
     */
    @TableField("STATION" )
    private String station;
    /**
     * 存放位置
     */
    @TableField("PLACE" )
    private String place;
    /**
     * 入库日期
     */
    @TableField("INDATE" )
    private Date indate;
    /**
     * 有效日期
     */
    @TableField("VALIDDATE" )
    private Date validdate;
    /**
     * 名称
     */
    @TableField("NAME" )
    private String name;
    /**
     * 型号
     */
    @TableField("TYPE" )
    private String type;
    /**
     * 数量
     */
    @TableField("NUM" )
    private Double num;
    /**
     * 厂家
     */
    @TableField("FACTORY" )
    private String factory;
    /**
     * 备注
     */
    @TableField("NOTE" )
    private String note;
    @TableId("ID" )
    private Long id;


    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }

    public String getWorkarea() {
        return workarea;
    }

    public void setWorkarea(String workarea) {
        this.workarea = workarea;
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

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }

    public Date getValiddate() {
        return validdate;
    }

    public void setValiddate(Date validdate) {
        this.validdate = validdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Reserve{" +
                "workshop=" + workshop +
                ", workarea=" + workarea +
                ", station=" + station +
                ", place=" + place +
                ", indate=" + indate +
                ", validdate=" + validdate +
                ", name=" + name +
                ", type=" + type +
                ", num=" + num +
                ", factory=" + factory +
                ", note=" + note +
                ", id=" + id +
                "}";
    }
}
