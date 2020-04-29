package com.tieda.alarm.entity.ymTWeekPlan;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2020-01-14
 */
@TableName("YM_T_WEEK_PLAN")
public class YmTWeekPlan implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;
    /**
     * 主表ID
     */
    @TableField("MID")
    private String mid;
    /**
     * 线别
     */
    @TableField("LINE")
    private String line;

    @TableField("LINENAME")
    private String linename;
    /**
     * 站、区段
     */
    @TableField("STATION")
    private String station;

    @TableField("STATIONNAME")
    private String stationname;
    /**
     * 登记站
     */
    @TableField("PLACE")
    private String place;
    /**
     * 行别
     */
    @TableField("XINGBIE")
    private String xingbie;
    /**
     * 等级
     */
    @TableField("LVL")
    private String lvl;
    /**
     * 作业项目
     */
    @TableField("PROJECTNAME")
    private String projectname;
    /**
     * 项目ID
     */
    @TableField("PROJECTID")
    private String projectid;
    /**
     * 天窗类型
     */
    @TableField("TCTYPE")
    private String tctype;
    /**
     * 开始时间
     */
    @TableField("BEGINTIME")
    private String begintime;
    /**
     * 结束时间
     */
    @TableField("ENDTIME")
    private String endtime;
    /**
     * 作业类型
     */
    @TableField("PROJECTTYPE")
    private String projecttype;
    /**
     * 作业来源
     */
    @TableField("SOURCE")
    private String source;
    /**
     * 作业设备
     */
    @TableField("DEVNAME")
    private String devname;
    /**
     * 设备ID
     */
    @TableField("DEVID")
    private String devid;
    /**
     * 配合单位
     */
    @TableField("COOPERATE")
    private String cooperate;
    /**
     * 作业单位ID
     */
    @TableField("ORGID")
    private String orgid;
    /**
     * 作业单位
     */
    @TableField("ORGNAME")
    private String orgname;
    /**
     * 负责人
     */
    @TableField("CHARGE")
    private String charge;
    /**
     * 施工内容
     */
    @TableField("CONTENT")
    private String content;
    /**
     * 备注
     */
    @TableField("NOTE")
    private String note;
    /**
     * 设备类型ID
     */
    @TableField("DEVTYPEID")
    private String devtypeid;
    /**
     * 设备类型
     */
    @TableField("DEVTYPENAME")
    private String devtypename;
    /**
     * 作业时间
     */
    @TableField("WORKDATE")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date workdate;

    @TableField("USERID")
    private String userid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createdate;
    @TableField("NEEDSKYWIN")
    private String needskywin;

    @TableField("NEEDROAD")
    private String needroad;



    private String plandate;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getNeedskywin() {
        return needskywin;
    }

    public void setNeedskywin(String needskywin) {
        this.needskywin = needskywin;
    }

    public String getNeedroad() {
        return needroad;
    }

    public void setNeedroad(String needroad) {
        this.needroad = needroad;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename;
    }

    public String getPlandate() {
        return plandate;
    }

    public void setPlandate(String plandate) {
        this.plandate = plandate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
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

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public String getLvl() {
        return lvl;
    }

    public void setLvl(String lvl) {
        this.lvl = lvl;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public String getTctype() {
        return tctype;
    }

    public void setTctype(String tctype) {
        this.tctype = tctype;
    }

    public String getBegintime() {
        return begintime;
    }

    public void setBegintime(String begintime) {
        this.begintime = begintime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getProjecttype() {
        return projecttype;
    }

    public void setProjecttype(String projecttype) {
        this.projecttype = projecttype;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDevname() {
        return devname;
    }

    public void setDevname(String devname) {
        this.devname = devname;
    }

    public String getDevid() {
        return devid;
    }

    public void setDevid(String devid) {
        this.devid = devid;
    }

    public String getCooperate() {
        return cooperate;
    }

    public void setCooperate(String cooperate) {
        this.cooperate = cooperate;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDevtypeid() {
        return devtypeid;
    }

    public void setDevtypeid(String devtypeid) {
        this.devtypeid = devtypeid;
    }

    public String getDevtypename() {
        return devtypename;
    }

    public void setDevtypename(String devtypename) {
        this.devtypename = devtypename;
    }

    public Date getWorkdate() {
        return workdate;
    }

    public void setWorkdate(Date workdate) {
        this.workdate = workdate;
    }

    @Override
    public String toString() {
        return "YmTWeekPlan{" +
        "id=" + id +
        ", mid=" + mid +
        ", line=" + line +
        ", station=" + station +
        ", place=" + place +
        ", xingbie=" + xingbie +
        ", lvl=" + lvl +
        ", projectname=" + projectname +
        ", projectid=" + projectid +
        ", tctype=" + tctype +
        ", begintime=" + begintime +
        ", endtime=" + endtime +
        ", projecttype=" + projecttype +
        ", source=" + source +
        ", devname=" + devname +
        ", devid=" + devid +
        ", cooperate=" + cooperate +
        ", orgid=" + orgid +
        ", orgname=" + orgname +
        ", charge=" + charge +
        ", content=" + content +
        ", note=" + note +
        ", devtypeid=" + devtypeid +
        ", devtypename=" + devtypename +
        ", workdate=" + workdate +
        "}";
    }
}
