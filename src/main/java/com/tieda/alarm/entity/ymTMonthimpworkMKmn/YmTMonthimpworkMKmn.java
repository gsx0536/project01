package com.tieda.alarm.entity.ymTMonthimpworkMKmn;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 昆明月度重点工作主表
 * </p>
 *
 * @author 
 * @since 2019-06-02
 */
@TableName("YM_T_MONTHIMPWORK_M_KMN")
public class YmTMonthimpworkMKmn implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID-hidden
     */
    @TableId("N_ID")
    private String nId;
    /**
     * 年度-select
     */
    @TableField("N_YEAR")
    private Integer nYear;
    /**
     * 月份-select
     */
    @TableField("N_MONTH")
    private Integer nMonth;
    /**
     * 计划正文-text
     */
    @TableField("VC_NOTE")
    private String vcNote;
    /**
     * 状态-text
     */
    @TableField("VC_STATE")
    private String vcState;
    /**
     * 录入人ID-hidden
     */
    @TableField("VC_PERSON")
    private String vcPerson;
    /**
     * 录入日期-hidden
     */
    @TableField("DT_DATE")
    private Date dtDate;
    /**
     * 录入人姓名--select
     */
    @TableField("VC_PERSON_NAME")
    private String vcPersonName;
    /**
     * 审批领导ID-hidden
     */
    @TableField("VC_SIGNLEADERID")
    private String vcSignleaderid;
    /**
     * 审批领导-select
     */
    @TableField("VC_SIGNLEADER")
    private String vcSignleader;
    /**
     * 审批意见-text
     */
    @TableField("VC_SIGNNOTE")
    private String vcSignnote;

    /**
     * 附件名称-text
     */
    @TableField("VC_FILENAME")
    private String vcFilename;

    public String getVcFilename() {
        return vcFilename;
    }

    public void setVcFilename(String vcFilename) {
        this.vcFilename = vcFilename;
    }

    public String getVcFilepath() {
        return vcFilepath;
    }

    public void setVcFilepath(String vcFilepath) {
        this.vcFilepath = vcFilepath;
    }

    /**
     * 附件地址-text
     */
    @TableField("VC_FILEPATH")
    private String vcFilepath;


    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public Integer getnYear() {
        return nYear;
    }

    public void setnYear(Integer nYear) {
        this.nYear = nYear;
    }

    public Integer getnMonth() {
        return nMonth;
    }

    public void setnMonth(Integer nMonth) {
        this.nMonth = nMonth;
    }

    public String getVcNote() {
        return vcNote;
    }

    public void setVcNote(String vcNote) {
        this.vcNote = vcNote;
    }

    public String getVcState() {
        return vcState;
    }

    public void setVcState(String vcState) {
        this.vcState = vcState;
    }

    public String getVcPerson() {
        return vcPerson;
    }

    public void setVcPerson(String vcPerson) {
        this.vcPerson = vcPerson;
    }

    public Date getDtDate() {
        return dtDate;
    }

    public void setDtDate(Date dtDate) {
        this.dtDate = dtDate;
    }

    public String getVcPersonName() {
        return vcPersonName;
    }

    public void setVcPersonName(String vcPersonName) {
        this.vcPersonName = vcPersonName;
    }

    public String getVcSignleaderid() {
        return vcSignleaderid;
    }

    public void setVcSignleaderid(String vcSignleaderid) {
        this.vcSignleaderid = vcSignleaderid;
    }

    public String getVcSignleader() {
        return vcSignleader;
    }

    public void setVcSignleader(String vcSignleader) {
        this.vcSignleader = vcSignleader;
    }

    public String getVcSignnote() {
        return vcSignnote;
    }

    public void setVcSignnote(String vcSignnote) {
        this.vcSignnote = vcSignnote;
    }

    @Override
    public String toString() {
        return "YmTMonthimpworkMKmn{" +
        "nId=" + nId +
        ", nYear=" + nYear +
        ", nMonth=" + nMonth +
        ", vcNote=" + vcNote +
        ", vcState=" + vcState +
        ", vcPerson=" + vcPerson +
        ", dtDate=" + dtDate +
        ", vcPersonName=" + vcPersonName +
        ", vcSignleaderid=" + vcSignleaderid +
                ", vcSignleader=" + vcSignleader +
                ", vcSignnote=" + vcSignnote +
                ", vcFilename=" + vcFilename +
                ", vcFilepath=" + vcFilepath +
        "}";
    }
}
