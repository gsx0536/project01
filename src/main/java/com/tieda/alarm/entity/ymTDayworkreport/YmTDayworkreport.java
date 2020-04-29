package com.tieda.alarm.entity.ymTDayworkreport;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2019-06-24
 */
@TableName("YM_T_DAYWORKREPORT")
public class YmTDayworkreport implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键-hidden
     */
    @TableId("N_ID")
    private String nId;
    /**
     * 组织机构ID-hidden
     */
    @TableField("VC_ORGID")
    private String vcOrgid;
    /**
     * 组织机构名称-select
     */
    @TableField("VC_ORGNAME")
    private String vcOrgname;
    /**
     * 车站ID-hidden
     */
    @TableField("VC_STATIONID")
    private String vcStationid;
    /**
     * 车站名称-select
     */
    @TableField("VC_STATIONNAME")
    private String vcStationname;
    /**
     * 作业地点-text
     */
    @TableField("VC_PLACE")
    private String vcPlace;
    /**
     * 当日作业内容-text
     */
    @TableField("VC_WORKINFO")
    private String vcWorkinfo;
    /**
     * 作业人员-select
     */
    @TableField("VC_WORKPERSON")
    private String vcWorkperson;
    /**
     * 作业人数-text
     */
    @TableField("VC_WORKPNUM")
    private String vcWorkpnum;
    /**
     * 备注-text
     */
    @TableField("VC_NOTE")
    private String vcNote;
    /**
     * 次日工作计划-text
     */
    @TableField("VC_TOMWORKINFO")
    private String vcTomworkinfo;
    /**
     * 日报日期-date
     */
    @TableField("DT_DATE")
    private Date dtDate;
    /**
     * 填报人-hidden
     */
    @TableField("VC_WRITER")
    private String vcWriter;
    /**
     * 状态-hidden-0,工区编制,1,工区提交,2,车间编制,3,车间提交,4,车间驳回,5,调度确认,6,调度驳回
     */
    @TableField("VC_STATUS")
    private String vcStatus;
    /**
     * 车间审批意见-hidden
     */
    @TableField("VC_WSAPPINFO")
    private String vcWsappinfo;
    /**
     * 车间审批人ID-hidden
     */
    @TableField("VC_WSAPPPERID")
    private String vcWsappperid;
    /**
     * 车间审批人-hidden
     */
    @TableField("VC_WSAPPPERNAME")
    private String vcWsapppername;
    /**
     * 段审批意见-hidden
     */
    @TableField("VC_SEGAPPINFO")
    private String vcSegappinfo;
    /**
     * 段审批人ID-hidden
     */
    @TableField("VC_SEGAPPPERID")
    private String vcSegappperid;
    /**
     * 段审批人-hidden
     */
    @TableField("VC_SEGAPPPERNAME")
    private String vcSegapppername;


    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getVcOrgid() {
        return vcOrgid;
    }

    public void setVcOrgid(String vcOrgid) {
        this.vcOrgid = vcOrgid;
    }

    public String getVcOrgname() {
        return vcOrgname;
    }

    public void setVcOrgname(String vcOrgname) {
        this.vcOrgname = vcOrgname;
    }

    public String getVcStationid() {
        return vcStationid;
    }

    public void setVcStationid(String vcStationid) {
        this.vcStationid = vcStationid;
    }

    public String getVcStationname() {
        return vcStationname;
    }

    public void setVcStationname(String vcStationname) {
        this.vcStationname = vcStationname;
    }

    public String getVcPlace() {
        return vcPlace;
    }

    public void setVcPlace(String vcPlace) {
        this.vcPlace = vcPlace;
    }

    public String getVcWorkinfo() {
        return vcWorkinfo;
    }

    public void setVcWorkinfo(String vcWorkinfo) {
        this.vcWorkinfo = vcWorkinfo;
    }

    public String getVcWorkperson() {
        return vcWorkperson;
    }

    public void setVcWorkperson(String vcWorkperson) {
        this.vcWorkperson = vcWorkperson;
    }

    public String getVcWorkpnum() {
        return vcWorkpnum;
    }

    public void setVcWorkpnum(String vcWorkpnum) {
        this.vcWorkpnum = vcWorkpnum;
    }

    public String getVcNote() {
        return vcNote;
    }

    public void setVcNote(String vcNote) {
        this.vcNote = vcNote;
    }

    public String getVcTomworkinfo() {
        return vcTomworkinfo;
    }

    public void setVcTomworkinfo(String vcTomworkinfo) {
        this.vcTomworkinfo = vcTomworkinfo;
    }

    public Date getDtDate() {
        return dtDate;
    }

    public void setDtDate(Date dtDate) {
        this.dtDate = dtDate;
    }

    public String getVcWriter() {
        return vcWriter;
    }

    public void setVcWriter(String vcWriter) {
        this.vcWriter = vcWriter;
    }

    public String getVcStatus() {
        return vcStatus;
    }

    public void setVcStatus(String vcStatus) {
        this.vcStatus = vcStatus;
    }

    public String getVcWsappinfo() {
        return vcWsappinfo;
    }

    public void setVcWsappinfo(String vcWsappinfo) {
        this.vcWsappinfo = vcWsappinfo;
    }

    public String getVcWsappperid() {
        return vcWsappperid;
    }

    public void setVcWsappperid(String vcWsappperid) {
        this.vcWsappperid = vcWsappperid;
    }

    public String getVcWsapppername() {
        return vcWsapppername;
    }

    public void setVcWsapppername(String vcWsapppername) {
        this.vcWsapppername = vcWsapppername;
    }

    public String getVcSegappinfo() {
        return vcSegappinfo;
    }

    public void setVcSegappinfo(String vcSegappinfo) {
        this.vcSegappinfo = vcSegappinfo;
    }

    public String getVcSegappperid() {
        return vcSegappperid;
    }

    public void setVcSegappperid(String vcSegappperid) {
        this.vcSegappperid = vcSegappperid;
    }

    public String getVcSegapppername() {
        return vcSegapppername;
    }

    public void setVcSegapppername(String vcSegapppername) {
        this.vcSegapppername = vcSegapppername;
    }

    @Override
    public String toString() {
        return "YmTDayworkreport{" +
        "nId=" + nId +
        ", vcOrgid=" + vcOrgid +
        ", vcOrgname=" + vcOrgname +
        ", vcStationid=" + vcStationid +
        ", vcStationname=" + vcStationname +
        ", vcPlace=" + vcPlace +
        ", vcWorkinfo=" + vcWorkinfo +
        ", vcWorkperson=" + vcWorkperson +
        ", vcWorkpnum=" + vcWorkpnum +
        ", vcNote=" + vcNote +
        ", vcTomworkinfo=" + vcTomworkinfo +
        ", dtDate=" + dtDate +
        ", vcWriter=" + vcWriter +
        ", vcStatus=" + vcStatus +
        ", vcWsappinfo=" + vcWsappinfo +
        ", vcWsappperid=" + vcWsappperid +
        ", vcWsapppername=" + vcWsapppername +
        ", vcSegappinfo=" + vcSegappinfo +
        ", vcSegappperid=" + vcSegappperid +
        ", vcSegapppername=" + vcSegapppername +
        "}";
    }
}
