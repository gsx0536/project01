package com.tieda.alarm.entity.jzjcProblem;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.tieda.alarm.util.excel.annotation.ExcelField;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author
 * @since 2019-11-16
 */
@TableName("JZJC_PROBLEM")
public class JzjcProblem {
    @TableId("ID")
    private String id;
    /**
     * 创建时间
     */
    @TableField("CREATEDATE")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createdate;

    @ExcelField(title = "日期")
    @TableField(exist = false)
    private String createdateShow;

    @ExcelField(title = "状态")
    @TableField(exist = false)
    private String statusShow;
    /**
     * 创建人
     */
    @TableField("CREATOR")
    @ExcelField(title = "调阅人")
    private String creator;
    /**
     * 车站ID
     */
    @TableField("STATIONID")
    private String stationid;
    /**
     * 车站名称
     */
    @TableField("STATIONNAME")
    @ExcelField(title = "车站")
    private String stationname;
    /**
     * 问题类型
     */
    @TableField("PROBLEMTYPE")
    @ExcelField(title = "问题类型")
    private String problemtype;

    @TableField("PROBLEMTYPEID")
    private String problemtypeid;
    /**
     * 问题级别 I、II、III级
     */
    @TableField("PROBLEMLEVEL")
    private String problemlevel;

    @ExcelField(title = "问题级别")
    @TableField(exist = false)
    private String problemlevelShow;
    /**
     * 问题内容
     */
    @TableField("PROBLEM")
    @ExcelField(title = "发现问题")
    private String problem;
    /**
     * 问题进度 红色：未处理
     * 黄色：处理中
     * 绿色：处理完毕销号
     */
    @TableField("STATUS")
    private String status;
    /**
     * 责任部门
     */
    @TableField("CHARGEORG")
    private String chargeorg;
    /**
     * 责任人
     */
    @TableField("CHARGER")
    private String charger;
    /**
     * 是否销号 0：否，1：是
     */
    @TableField("CANCLE")
    private String cancle;

    @TableField("chargeorgname")
    private String chargeorgname;

    /***
     * 整改信息 存储整个流转过程中的整改信息
     */
    @TableField("HANDLEINFO")
    private String handleinfo;

    @ExcelField(title = "整改情况")
    @TableField(exist = false)
    private String handleinfoExport;

    /***
     * 责任部门 存储整个流转过程中的责任部门
     */
    @TableField("ORGNAMES")
    private String orgnames;

    @ExcelField(title = "责任部门")
    @TableField(exist = false)
    private String orgnamesExport;

    /***
     * 协助部门ID
     */
    @TableField("ASSISTORG")
    private String assistorg;

    /***
     * 协助部门名称
     */
    @TableField("ASSISTORGNAME")
    @ExcelField(title = "协助部门")
    private String assistorgname;

    /***
     * 责任人 存储整个流转过程中的责任人
     */
    @TableField("HANDLERS")
    private String handlers;

    @ExcelField(title = "责任人")
    @TableField(exist = false)
    private String handlersExport;

    /***
     * 整改日期
     */
    @TableField("RECTDATE")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date rectdate;

    @ExcelField(title = "整改日期")
    @TableField(exist = false)
    private String rectdateExport;

    /***
     * 录入终端
     */
    @TableField("PC")
    private String pc;

    @ExcelField(title = "销号")
    @TableField(exist = false)
    private String cancleShow;

    /***
     * 申请延期日期
     */
    @TableField("APPLYRECTDATE")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date applyrectdate;

    /**
     * 注释
     */
    @TableField("NOTE")
    @ExcelField(title = "备注")
    private String note;

    @TableField(exist = false)
    private String startdate;

    @TableField(exist = false)
    private String enddate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getProblemtype() {
        return problemtype;
    }

    public void setProblemtype(String problemtype) {
        this.problemtype = problemtype;
    }

    public String getProblemtypeid() {
        return problemtypeid;
    }

    public void setProblemtypeid(String problemtypeid) {
        this.problemtypeid = problemtypeid;
    }

    public String getProblemlevel() {
        return problemlevel;
    }

    public void setProblemlevel(String problemlevel) {
        this.problemlevel = problemlevel;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getChargeorg() {
        return chargeorg;
    }

    public void setChargeorg(String chargeorg) {
        this.chargeorg = chargeorg;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getCancle() {
        return cancle;
    }

    public void setCancle(String cancle) {
        this.cancle = cancle;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getChargeorgname() {
        return chargeorgname;
    }

    public void setChargeorgname(String chargeorgname) {
        this.chargeorgname = chargeorgname;
    }

    public String getHandleinfo() {
        return handleinfo;
    }

    public void setHandleinfo(String handleinfo) {
        this.handleinfo = handleinfo;
    }

    public String getOrgnames() {
        return orgnames;
    }

    public void setOrgnames(String orgnames) {
        this.orgnames = orgnames;
    }

    public String getHandlers() {
        return handlers;
    }

    public void setHandlers(String handlers) {
        this.handlers = handlers;
    }

    public String getAssistorg() {
        return assistorg;
    }

    public void setAssistorg(String assistorg) {
        this.assistorg = assistorg;
    }

    public Date getRectdate() {
        return rectdate;
    }

    public void setRectdate(Date rectdate) {
        this.rectdate = rectdate;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public Date getApplyrectdate() {
        return applyrectdate;
    }

    public void setApplyrectdate(Date applyrectdate) {
        this.applyrectdate = applyrectdate;
    }

    public String getAssistorgname() {
        return assistorgname;
    }

    public void setAssistorgname(String assistorgname) {
        this.assistorgname = assistorgname;
    }

    public String getProblemlevelShow() {
        switch (this.problemlevel) {
            case "1":
                return "一级";
            case "2":
                return "二级";
            case "3":
            default:
                return "三级";
        }
    }

    public void setProblemlevelShow(String problemlevelShow) {
        this.problemlevelShow = problemlevelShow;
    }

    public String getStatusShow() {
        switch (this.status) {
            case "0":
                return "未处理";
            case "1":
                return "已下发";
            case "2":
                return "已签收";
            case "3":
                return "整改中";
            case "4":
                return "申请延期";
            case "5":
                return "整改中";
            case "6":
                return "整改中";
            case "7":
                return "申请销号";
            case "8":
                return "销号同意";
            case "9":
                return "整改中";
            default:
                return "逾期销号";
        }
    }

    public void setStatusShow(String statusShow) {
        this.statusShow = statusShow;
    }

    public String getCancleShow() {
        switch (this.cancle) {
            case "0":
                return "否";
            case "1":
                return "销号申请";
            case "2":
                return "是";
            case "3":
            default:
                return "逾期未整改";
        }
    }

    public void setCancleShow(String cancleShow) {
        this.cancleShow = cancleShow;
    }

    public String getCreatedateShow() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return this.createdate == null ? "" : simpleDateFormat.format(this.createdate);
    }

    public void setCreatedateShow(String createdateShow) {
        this.createdateShow = createdateShow;
    }

    public String getHandleinfoExport() {
        return this.handleinfo == null ? "" : this.handleinfo.replace("<br>", "\r\n");
    }

    public void setHandleinfoExport(String handleinfoExport) {
        this.handleinfoExport = handleinfoExport;
    }

    public String getOrgnamesExport() {
        return this.orgnames == null ? "" : this.orgnames.replace("<br>", "\r\n");
    }

    public void setOrgnamesExport(String orgnamesExport) {
        this.orgnamesExport = orgnamesExport;
    }

    public String getHandlersExport() {
        return this.handlers == null ? "" : this.handlers.replace("<br>", "\r\n");
    }

    public void setHandlersExport(String handlersExport) {
        this.handlersExport = handlersExport;
    }

    public String getRectdateExport() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return this.rectdate == null ? "" : simpleDateFormat.format(this.rectdate);
    }

    public void setRectdateExport(String rectdateExport) {
        this.rectdateExport = rectdateExport;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    @Override
    public String toString() {
        return "JzjcProblem{" +
                "id='" + id + '\'' +
                ", createdate=" + createdate +
                ", creator='" + creator + '\'' +
                ", stationid='" + stationid + '\'' +
                ", stationname='" + stationname + '\'' +
                ", problemtype='" + problemtype + '\'' +
                ", problemtypeid='" + problemtypeid + '\'' +
                ", problemlevel='" + problemlevel + '\'' +
                ", problem='" + problem + '\'' +
                ", status='" + status + '\'' +
                ", chargeorg='" + chargeorg + '\'' +
                ", charger='" + charger + '\'' +
                ", cancle='" + cancle + '\'' +
                ", note='" + note + '\'' +
                ", chargeorgname='" + chargeorgname + '\'' +
                ", handleinfo='" + handleinfo + '\'' +
                ", orgnames='" + orgnames + '\'' +
                ", handlers='" + handlers + '\'' +
                ", assistorg='" + assistorg + '\'' +
                ", rectdate='" + rectdate + '\'' +
                ", pc='" + pc + '\'' +
                '}';
    }
}
