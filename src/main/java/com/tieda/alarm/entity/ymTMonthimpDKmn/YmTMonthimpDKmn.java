package com.tieda.alarm.entity.ymTMonthimpDKmn;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * <p>
 * 昆明南月重点工作子表
 * </p>
 *
 * @author 
 * @since 2019-06-02
 */
@TableName("YM_T_MONTHIMP_D_KMN")
public class YmTMonthimpDKmn implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID-hidden
     */
    @TableId("N_ID")
    private String nId;
    /**
     * 父节点ID-hidden
     */
    @TableField("N_MID")
    private String nMid;
    /**
     * 作业类型-autofinish
     */
    @TableField("VC_WORKTYPE")
    private String vcWorktype;
    /**
     * 作业类型ID-hidden
     */
    @TableField("VC_WORKTYPEID")
    private String vcWorktypeid;
    /**
     * 作业项目ID-hidden
     */
    @TableField("VC_PROJECTID")
    private String vcProjectid;
    /**
     * 作业项目-autofinish
     */
    @TableField("VC_PROJECT")
    private String vcProject;
    /**
     * 工作要求-uediter
     */
    @TableField("VC_WORKDETAIL")
    private String vcWorkdetail;
    /**
     * 部门-select-dep
     */
    @TableField("VC_NOTICEDEP")
    private String vcNoticedep;

    public String getVcNoticedepId() {
        return vcNoticedepId;
    }

    public void setVcNoticedepId(String vcNoticedepId) {
        this.vcNoticedepId = vcNoticedepId;
    }

    /**
     * 部门ID-hidden
     */
    @TableField("VC_NOTICEDEPID")
    private String vcNoticedepId;
    /**
     * 备注-textmore
     */
    @TableField("VC_NOTE")
    private String vcNote;
    /**
     * 来源项目ID-hidden
     */
    @TableField("N_SOURCEID")
    private String nSourceid;
    /**
     * 作业数量--text
     */
    @TableField("VC_NUMBER")
    private Integer vcNumber;
    /**
     * 完成时间-date
     */
    @TableField("DT_DEADLINE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dtDeadline;
    /**
     * 负责人-text
     */
    @TableField("VC_CHARGER")
    private String vcCharger;
    /**
     * 状态-text
     */
    @TableField("VC_STATUS")
    private String vcStatus;

    /**
     * 序号-text
     */
    @TableField("N_ORDER")
    private String nOrder;

    @TableField("N_FINISH")
    private String nFinish;


    public String getnFinish() {
        return nFinish;
    }

    public void setnFinish(String nFinish) {
        this.nFinish = nFinish;
    }

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getnMid() {
        return nMid;
    }

    public void setnMid(String nMid) {
        this.nMid = nMid;
    }

    public String getVcWorktype() {
        return vcWorktype;
    }

    public void setVcWorktype(String vcWorktype) {
        this.vcWorktype = vcWorktype;
    }

    public String getVcWorktypeid() {
        return vcWorktypeid;
    }

    public void setVcWorktypeid(String vcWorktypeid) {
        this.vcWorktypeid = vcWorktypeid;
    }

    public String getVcProjectid() {
        return vcProjectid;
    }

    public void setVcProjectid(String vcProjectid) {
        this.vcProjectid = vcProjectid;
    }

    public String getVcProject() {
        return vcProject;
    }

    public void setVcProject(String vcProject) {
        this.vcProject = vcProject;
    }

    public String getVcWorkdetail() {
        return vcWorkdetail;
    }

    public void setVcWorkdetail(String vcWorkdetail) {
        this.vcWorkdetail = vcWorkdetail;
    }

    public String getVcNoticedep() {
        return vcNoticedep;
    }

    public void setVcNoticedep(String vcNoticedep) {
        this.vcNoticedep = vcNoticedep;
    }

    public String getVcNote() {
        return vcNote;
    }

    public void setVcNote(String vcNote) {
        this.vcNote = vcNote;
    }

    public String getnSourceid() {
        return nSourceid;
    }

    public void setnSourceid(String nSourceid) {
        this.nSourceid = nSourceid;
    }

    public Integer getVcNumber() {
        return vcNumber;
    }

    public void setVcNumber(Integer vcNumber) {
        this.vcNumber = vcNumber;
    }

    public Date getDtDeadline() {
        return dtDeadline;
    }

    public void setDtDeadline(Date dtDeadline) {
        this.dtDeadline = dtDeadline;
    }

    public String getVcCharger() {
        return vcCharger;
    }

    public void setVcCharger(String vcCharger) {
        this.vcCharger = vcCharger;
    }

    public String getVcStatus() {
        return vcStatus;
    }

    public void setVcStatus(String vcStatus) {
        this.vcStatus = vcStatus;
    }

    public String getnOrder() {
        return nOrder;
    }

    public void setnOrder(String nOrder) {
        this.nOrder = nOrder;
    }

    @Override
    public String toString() {
        return "YmTMonthimpDKmn{" +
        "nId=" + nId +
        ", nMid=" + nMid +
        ", vcWorktype=" + vcWorktype +
        ", vcWorktypeid=" + vcWorktypeid +
        ", vcProjectid=" + vcProjectid +
        ", vcProject=" + vcProject +
        ", vcWorkdetail=" + vcWorkdetail +
        ", vcNoticedep=" + vcNoticedep +
        ", vcNoticedepId=" + vcNoticedepId +
        ", vcNote=" + vcNote +
        ", nSourceid=" + nSourceid +
        ", vcNumber=" + vcNumber +
        ", dtDeadline=" + dtDeadline +
        ", vcCharger=" + vcCharger +
                ", vcStatus=" + vcStatus +
                ", nOrder=" + nOrder +
        "}";
    }
}
