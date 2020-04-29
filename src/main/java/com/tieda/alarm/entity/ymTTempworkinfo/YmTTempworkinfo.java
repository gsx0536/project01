package com.tieda.alarm.entity.ymTTempworkinfo;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

/**
 * <p>
 * 临时上道
 * </p>
 *
 * @author 
 * @since 2019-07-19
 */
@TableName("YM_T_TEMPWORKINFO")
public class YmTTempworkinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键-hidden
     */
    @TableId("N_ID")
    private String nId;
    /**
     * 调度命令号-text
     */
    @TableField("VC_CODENUM")
    private String vcCodenum;
    /**
     * 申请日期-date
     */
    @TableField("DT_CODEDATE")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date dtCodedate;
    /**
     * 发令时间-date
     */
    @TableField("DT_CODETIME")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date dtCodetime;
    /**
     * 申请部门id-hiddent
     */
    @TableField("VC_REQDEP")
    private String vcReqdep;
    /**
     * 申请部门-hidden
     */
    @TableField("VC_REQDEPNAME")
    private String vcReqdepname;
    /**
     * 申请人ID-hidden
     */
    @TableField("VC_REQPERSONID")
    private String vcReqpersonid;
    /**
     * 申请人-hidden
     */
    @TableField("VC_REQPERSONNAME")
    private String vcReqpersonname;
    /**
     * 发令内容-text
     */
    @TableField("VC_CODEINFO")
    private String vcCodeinfo;
    /**
     * 要求-text
     */
    @TableField("VC_CODEREQU")
    private String vcCoderequ;
    /**
     * 审批人ID-hidden
     */
    @TableField("VC_APPERSONID")
    private String vcAppersonid;
    /**
     * 审批人-hidden
     */
    @TableField("VC_APPERSONNAME")
    private String vcAppersonname;
    /**
     * 审批时间-hidden
     */
    @TableField("VC_APPDATE")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date vcAppdate;
    /**
     * 申请类型-hidden-0，上道，1，下道
     */
    @TableField("VC_REQTYPE")
    private String vcReqtype;
    /**
     * 状态-hidden，0,编制中，1，申请中，2，已签发
     */
    @TableField("VC_STATUS")
    private String vcStatus;
    /**
     * 备注-text
     */
    @TableField("VC_BACKUP")
    private String vcBackup;



    @TableField("VC_TYPE")
    private String vcType;

    @TableField("VC_SIGENR")
    private String vcSigner;

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getVcCodenum() {
        return vcCodenum;
    }

    public void setVcCodenum(String vcCodenum) {
        this.vcCodenum = vcCodenum;
    }

    public Date getDtCodedate() {
        return dtCodedate;
    }

    public void setDtCodedate(Date dtCodedate) {
        this.dtCodedate = dtCodedate;
    }

    public Date getDtCodetime() {
        return dtCodetime;
    }

    public void setDtCodetime(Date dtCodetime) {
        this.dtCodetime = dtCodetime;
    }

    public String getVcReqdep() {
        return vcReqdep;
    }

    public void setVcReqdep(String vcReqdep) {
        this.vcReqdep = vcReqdep;
    }

    public String getVcReqdepname() {
        return vcReqdepname;
    }

    public void setVcReqdepname(String vcReqdepname) {
        this.vcReqdepname = vcReqdepname;
    }

    public String getVcReqpersonid() {
        return vcReqpersonid;
    }

    public void setVcReqpersonid(String vcReqpersonid) {
        this.vcReqpersonid = vcReqpersonid;
    }

    public String getVcReqpersonname() {
        return vcReqpersonname;
    }

    public void setVcReqpersonname(String vcReqpersonname) {
        this.vcReqpersonname = vcReqpersonname;
    }

    public String getVcCodeinfo() {
        return vcCodeinfo;
    }

    public void setVcCodeinfo(String vcCodeinfo) {
        this.vcCodeinfo = vcCodeinfo;
    }

    public String getVcCoderequ() {
        return vcCoderequ;
    }

    public void setVcCoderequ(String vcCoderequ) {
        this.vcCoderequ = vcCoderequ;
    }

    public String getVcAppersonid() {
        return vcAppersonid;
    }

    public void setVcAppersonid(String vcAppersonid) {
        this.vcAppersonid = vcAppersonid;
    }

    public String getVcAppersonname() {
        return vcAppersonname;
    }

    public void setVcAppersonname(String vcAppersonname) {
        this.vcAppersonname = vcAppersonname;
    }

    public Date getVcAppdate() {
        return vcAppdate;
    }

    public void setVcAppdate(Date vcAppdate) {
        this.vcAppdate = vcAppdate;
    }

    public String getVcReqtype() {
        return vcReqtype;
    }

    public void setVcReqtype(String vcReqtype) {
        this.vcReqtype = vcReqtype;
    }

    public String getVcStatus() {
        return vcStatus;
    }

    public void setVcStatus(String vcStatus) {
        this.vcStatus = vcStatus;
    }

    public String getVcBackup() {
        return vcBackup;
    }

    public void setVcBackup(String vcBackup) {
        this.vcBackup = vcBackup;
    }

    public String getVcType() {
        return vcType;
    }

    public void setVcType(String vcType) {
        this.vcType = vcType;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getVcSigner() {
        return vcSigner;
    }

    public void setVcSigner(String vcSigner) {
        this.vcSigner = vcSigner;
    }

    @Override
    public String toString() {
        return "YmTTempworkinfo{" +
        "nId=" + nId +
        ", vcCodenum=" + vcCodenum +
        ", dtCodedate=" + dtCodedate +
        ", dtCodetime=" + dtCodetime +
        ", vcReqdep=" + vcReqdep +
        ", vcReqdepname=" + vcReqdepname +
        ", vcReqpersonid=" + vcReqpersonid +
        ", vcReqpersonname=" + vcReqpersonname +
        ", vcCodeinfo=" + vcCodeinfo +
        ", vcCoderequ=" + vcCoderequ +
        ", vcAppersonid=" + vcAppersonid +
        ", vcAppersonname=" + vcAppersonname +
        ", vcAppdate=" + vcAppdate +
        ", vcReqtype=" + vcReqtype +
        ", vcStatus=" + vcStatus +
        ", vcBackup=" + vcBackup +
        "}";
    }
}
