package com.tieda.alarm.entity.tcdwPlan;

import java.beans.Transient;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

/**
 * <p>
 * 天窗点外维修作业计划审批单
 * </p>
 *
 * @author 
 * @since 2019-06-19
 */
@TableName("TCDW_PLAN")
public class TcdwPlan implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID--text
     */
    @TableId("ID")
    private String id;
    /**
     * 调度命令号码--text
     */
    @TableField("CODE")
    private String code;
    /**
     * 申请车间--text
     */
    @TableField("WORKSHOP")
    private String workshop;
    /**
     * 申请工区--text
     */
    @TableField("WORKAREA")
    private String workarea;
    /**
     * 作业开始时间--text
     */
    @TableField("BEGINDATE")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date begindate;


    @TableField("ENDDATE")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date enddate;

    /**
     * 作业地点--text
     */
    @TableField("PLACE")
    private String place;
    @TableField("PLACEID")
    private String placeid;

    /**
     * 室内防护员--select
     */
    @TableField("INWORKER")
    private String inworker;
    @TableField("INWORKERID")
    private String inworkerid;

    /**
     * 室外防护员--select
     */
    @TableField("OUTWORKER")
    private String outworker;
    @TableField("OUTWORKERID")
    private String outworkerid;
    /**
     * 上道人员清单--text
     */
    @TableField("ONWORKER")
    private String onworker;
    @TableField("ONWORKERID")
    private String onworkerid;


    /**
     * 车间审核人--text
     */
    @TableField("AUDITOR")
    private String auditor;
    /**
     * 调度审批人--text
     */
    @TableField("DISPATCH")
    private String dispatch;
    /**
     * 作业内容--text
     */
    @TableField("CONTENT")
    private String content;
    /**
     * 作业防控要求--text
     */
    @TableField("REQUIRE")
    private String require;
    /**
     * 车间审核意见--text
     */
    @TableField("ADVISE")
    private String advise;
    /**
     * 调度审批意见--text
     */
    @TableField("DIS_ADVISE")
    private String disAdvise;
    /**
     * 编号-text
     */
    @TableField("NO")
    private String no;
    /**
     * 车间ID--hiden
     */
    @TableField("WORKSHOPID")
    private String workshopid;
    /**
     * 工区ID--hiden
     */
    @TableField("WORKAREAID")
    private String workareaid;

    @TableField("STATUS")
    private String status;


    @TableField("VC_FINISHINFO")
    private String finishInfo;

    @TableField("DOWNOUTWORKER")
    private String downoutworker;

    @TableField("DOWNOUTWORKERID")
    private String downoutworkerid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

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

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlaceid() {
        return placeid;
    }

    public void setPlaceid(String placeid) {
        this.placeid = placeid;
    }

    public String getInworker() {
        return inworker;
    }

    public void setInworker(String inworker) {
        this.inworker = inworker;
    }

    public String getInworkerid() {
        return inworkerid;
    }

    public void setInworkerid(String inworkerid) {
        this.inworkerid = inworkerid;
    }

    public String getOutworker() {
        return outworker;
    }

    public void setOutworker(String outworker) {
        this.outworker = outworker;
    }

    public String getOutworkerid() {
        return outworkerid;
    }

    public void setOutworkerid(String outworkerid) {
        this.outworkerid = outworkerid;
    }

    public String getOnworker() {
        return onworker;
    }

    public void setOnworker(String onworker) {
        this.onworker = onworker;
    }

    public String getOnworkerid() {
        return onworkerid;
    }

    public void setOnworkerid(String onworkerid) {
        this.onworkerid = onworkerid;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getDispatch() {
        return dispatch;
    }

    public void setDispatch(String dispatch) {
        this.dispatch = dispatch;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRequire() {
        return require;
    }

    public void setRequire(String require) {
        this.require = require;
    }

    public String getAdvise() {
        return advise;
    }

    public void setAdvise(String advise) {
        this.advise = advise;
    }

    public String getDisAdvise() {
        return disAdvise;
    }

    public void setDisAdvise(String disAdvise) {
        this.disAdvise = disAdvise;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getWorkshopid() {
        return workshopid;
    }

    public void setWorkshopid(String workshopid) {
        this.workshopid = workshopid;
    }

    public String getWorkareaid() {
        return workareaid;
    }

    public void setWorkareaid(String workareaid) {
        this.workareaid = workareaid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFinishInfo() {
        return finishInfo;
    }

    public void setFinishInfo(String finishInfo) {
        this.finishInfo = finishInfo;
    }

    public String getDownoutworker() {
        return downoutworker;
    }

    public void setDownoutworker(String downoutworker) {
        this.downoutworker = downoutworker;
    }

    public String getDownoutworkerid() {
        return downoutworkerid;
    }

    public void setDownoutworkerid(String downoutworkerid) {
        this.downoutworkerid = downoutworkerid;
    }

    @Override
    public String toString() {
        return "TcdwPlan{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", workshop='" + workshop + '\'' +
                ", workarea='" + workarea + '\'' +
                ", begindate=" + begindate +
                ", enddate=" + enddate +
                ", place='" + place + '\'' +
                ", placeid='" + placeid + '\'' +
                ", inworker='" + inworker + '\'' +
                ", inworkerid='" + inworkerid + '\'' +
                ", outworker='" + outworker + '\'' +
                ", outworkerid='" + outworkerid + '\'' +
                ", onworker='" + onworker + '\'' +
                ", onworkerid='" + onworkerid + '\'' +
                ", auditor='" + auditor + '\'' +
                ", dispatch='" + dispatch + '\'' +
                ", content='" + content + '\'' +
                ", require='" + require + '\'' +
                ", advise='" + advise + '\'' +
                ", disAdvise='" + disAdvise + '\'' +
                ", no='" + no + '\'' +
                ", workshopid='" + workshopid + '\'' +
                ", workareaid='" + workareaid + '\'' +
                ", status='" + status + '\'' +
                ", finishInfo='" + finishInfo + '\'' +
                ", downoutworker='" + downoutworker + '\'' +
                ", downoutworkerid='" + downoutworkerid + '\'' +
                '}';
    }
}
