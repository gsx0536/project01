package com.tieda.alarm.entity.yjTDuty;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 值班人员信息表
 * </p>
 *
 * @author 
 * @since 2019-06-27
 */
@TableName("YJ_T_DUTY")
public class YjTDuty implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 服务器ID-hidden
     */
    @TableId("VC_SERVER")
    private String vcServer;
    /**
     * 组织机构-hidden
     */
    @TableField("VC_ORG$ID")
    private String vcOrgid;
    /**
     * 人员编号-hidden
     */
    @TableField("VC_PERSON$NUMBER")
    private String vcPersonnumber;
    /**
     * 日期-date
     */
    @TableField("DT_DATE")
    private Date dtDate;
    /**
     * 备注-text
     */
    @TableField("VC_NOTE")
    private String vcNote;
    /**
     * 录入人-hidden
     */
    @TableField("VC_USER")
    private String vcUser;
    /**
     * 录入时间-date
     */
    @TableField("DT_SYSDATE")
    private Date dtSysdate;
    /**
     * 值班地点-text
     */
    @TableField("VC_PLACE")
    private String vcPlace;


    @TableField("VC_CONTENT")
    private String vcContent;

    @TableField("VC_CHECKED")
    private String vcChecked;


    public String getVcServer() {
        return vcServer;
    }

    public void setVcServer(String vcServer) {
        this.vcServer = vcServer;
    }

    public String getVcOrgid() {
        return vcOrgid;
    }

    public void setVcOrgid(String vcOrgid) {
        this.vcOrgid = vcOrgid;
    }

    public String getVcPersonnumber() {
        return vcPersonnumber;
    }

    public void setVcPersonnumber(String vcPersonnumber) {
        this.vcPersonnumber = vcPersonnumber;
    }

    public Date getDtDate() {
        return dtDate;
    }

    public void setDtDate(Date dtDate) {
        this.dtDate = dtDate;
    }

    public String getVcNote() {
        return vcNote;
    }

    public void setVcNote(String vcNote) {
        this.vcNote = vcNote;
    }

    public String getVcUser() {
        return vcUser;
    }

    public void setVcUser(String vcUser) {
        this.vcUser = vcUser;
    }

    public Date getDtSysdate() {
        return dtSysdate;
    }

    public void setDtSysdate(Date dtSysdate) {
        this.dtSysdate = dtSysdate;
    }

    public String getVcPlace() {
        return vcPlace;
    }

    public void setVcPlace(String vcPlace) {
        this.vcPlace = vcPlace;
    }

    public String getVcContent() {
        return vcContent;
    }

    public void setVcContent(String vcContent) {
        this.vcContent = vcContent;
    }

    public String getVcChecked() {
        return vcChecked;
    }

    public void setVcChecked(String vcChecked) {
        this.vcChecked = vcChecked;
    }

    @Override
    public String toString() {
        return "YjTDuty{" +
        "vcServer=" + vcServer +
        ", vcOrgid=" + vcOrgid +
        ", vcPersonnumber=" + vcPersonnumber +
        ", dtDate=" + dtDate +
        ", vcNote=" + vcNote +
        ", vcUser=" + vcUser +
                ", dtSysdate=" + dtSysdate +
                ", vcPlace=" + vcPlace +
                ", vcContent=" + vcContent +
                ", vcChecked=" + vcChecked +
        "}";
    }
}
