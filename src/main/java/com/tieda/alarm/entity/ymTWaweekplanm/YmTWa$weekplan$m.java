package com.tieda.alarm.entity.ymTWaweekplanm;

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
 * @since 2020-01-13
 */
@TableName("YM_T_WA$WEEKPLAN$M")
public class YmTWa$weekplan$m implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 服务器ID|hidden
     */
    @TableField("VC_SERVER")
    private String vcServer;
    /**
     * 序号|hidden
     */
    @TableId("N_ID")
    private String nId;
    /**
     * 工区ID|select
     */
    @TableField("VC_ORG$ID")
    private String vcOrg$id;
    /**
     * 周次|text
     */
    @TableField("VC_WEEKNUM")
    private String vcWeeknum;
    /**
     * 周起始日期
     */
    @TableField("DT_WSDATE")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date dtWsdate;
    /**
     * 周截止日期
     */
    @TableField("DT_WEDATE")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date dtWedate;
    /**
     * 状态,0,编辑,1,提交,2,车间批准,3,车间驳回,4,段批准,5,段驳回|hidden
     */
    @TableField("VC_STATUS")
    private String vcStatus;
    /**
     * 审批人
     */
    @TableField("VC_WS$APP$PER")
    private String vcWs$app$per;
    /**
     * 审批时间
     */
    @TableField("DT_WS$APP$DATE")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date dtWs$app$date;
    /**
     * 段审批人
     */
    @TableField("VC_SEG$APP$PER")
    private String vcSeg$app$per;
    /**
     * 段审批时间
     */
    @TableField("DT_SEG$APP$DATE")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date dtSeg$app$date;
    /**
     * 录入人|hidden
     */
    @TableField("VC_USER$ID")
    private String vcUser$id;
    /**
     * 录入时间|hidden
     */
    @TableField("DT_SYSDATE")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date dtSysdate;
    @TableField("VC_YEAR")
    private String vcYear;
    @TableField("VC_MONTH")
    private String vcMonth;
    /**
     * 1：工区，2：车间，3：技术科
     */
    @TableField("ORG_TYPE")
    private String orgType;

    @TableField("VC_ORG_NAME")
    private String vcOrgName;

    @TableField("CONTENT")
    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getVcOrgName() {
        return vcOrgName;
    }

    public void setVcOrgName(String vcOrgName) {
        this.vcOrgName = vcOrgName;
    }

    public String getVcServer() {
        return vcServer;
    }

    public void setVcServer(String vcServer) {
        this.vcServer = vcServer;
    }

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getVcOrg$id() {
        return vcOrg$id;
    }

    public void setVcOrg$id(String vcOrg$id) {
        this.vcOrg$id = vcOrg$id;
    }

    public String getVcWeeknum() {
        return vcWeeknum;
    }

    public void setVcWeeknum(String vcWeeknum) {
        this.vcWeeknum = vcWeeknum;
    }

    public Date getDtWsdate() {
        return dtWsdate;
    }

    public void setDtWsdate(Date dtWsdate) {
        this.dtWsdate = dtWsdate;
    }

    public Date getDtWedate() {
        return dtWedate;
    }

    public void setDtWedate(Date dtWedate) {
        this.dtWedate = dtWedate;
    }

    public String getVcStatus() {
        return vcStatus;
    }

    public void setVcStatus(String vcStatus) {
        this.vcStatus = vcStatus;
    }

    public String getVcWs$app$per() {
        return vcWs$app$per;
    }

    public void setVcWs$app$per(String vcWs$app$per) {
        this.vcWs$app$per = vcWs$app$per;
    }

    public Date getDtWs$app$date() {
        return dtWs$app$date;
    }

    public void setDtWs$app$date(Date dtWs$app$date) {
        this.dtWs$app$date = dtWs$app$date;
    }

    public String getVcSeg$app$per() {
        return vcSeg$app$per;
    }

    public void setVcSeg$app$per(String vcSeg$app$per) {
        this.vcSeg$app$per = vcSeg$app$per;
    }

    public Date getDtSeg$app$date() {
        return dtSeg$app$date;
    }

    public void setDtSeg$app$date(Date dtSeg$app$date) {
        this.dtSeg$app$date = dtSeg$app$date;
    }

    public String getVcUser$id() {
        return vcUser$id;
    }

    public void setVcUser$id(String vcUser$id) {
        this.vcUser$id = vcUser$id;
    }

    public Date getDtSysdate() {
        return dtSysdate;
    }

    public void setDtSysdate(Date dtSysdate) {
        this.dtSysdate = dtSysdate;
    }

    public String getVcYear() {
        return vcYear;
    }

    public void setVcYear(String vcYear) {
        this.vcYear = vcYear;
    }

    public String getVcMonth() {
        return vcMonth;
    }

    public void setVcMonth(String vcMonth) {
        this.vcMonth = vcMonth;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    @Override
    public String toString() {
        return "YmTWa$weekplan$m{" +
        "vcServer=" + vcServer +
        ", nId=" + nId +
        ", vcOrg$id=" + vcOrg$id +
        ", vcWeeknum=" + vcWeeknum +
        ", dtWsdate=" + dtWsdate +
        ", dtWedate=" + dtWedate +
        ", vcStatus=" + vcStatus +
        ", vcWs$app$per=" + vcWs$app$per +
        ", dtWs$app$date=" + dtWs$app$date +
        ", vcSeg$app$per=" + vcSeg$app$per +
        ", dtSeg$app$date=" + dtSeg$app$date +
        ", vcUser$id=" + vcUser$id +
        ", dtSysdate=" + dtSysdate +
        ", vcYear=" + vcYear +
        ", vcMonth=" + vcMonth +
        ", orgType=" + orgType +
        "}";
    }
}
