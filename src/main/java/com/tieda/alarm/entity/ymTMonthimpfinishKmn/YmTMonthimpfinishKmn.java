package com.tieda.alarm.entity.ymTMonthimpfinishKmn;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 月度重点工作完成情况
 * </p>
 *
 * @author 
 * @since 2019-06-05
 */
@TableName("YM_T_MONTHIMPFINISH_KMN")
public class YmTMonthimpfinishKmn implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键-hidden
     */
    @TableId("N_ID")
    private String nId;
    /**
     * 明细表ID-hidden
     */
    @TableField("N_DID")
    private String nDid;
    /**
     * 主表ID-hidden
     */
    @TableField("N_MID")
    private String nMid;
    /**
     * 机构ID-hidden
     */
    @TableField("VC_ORGID")
    private String vcOrgid;
    /**
     * 机构名称-select
     */
    @TableField("VC_ORGNAME")
    private String vcOrgname;
    /**
     * 签收人ID-hidden
     */
    @TableField("VC_SINGPERSONID")
    private String vcSingpersonid;
    /**
     * 签收人姓名-hidden
     */
    @TableField("VC_SINGPERSON")
    private String vcSingperson;
    /**
     * 完成情况-text
     */
    @TableField("VC_FINISHINFO")
    private String vcFinishinfo;
    /**
     * 状态-hidden
     */
    @TableField("VC_STATUS")
    private String vcStatus;
    /**
     * 关联任务类型-hidden
     */
    @TableField("VC_JOBTYPE")
    private String vcJobtype;
    /**
     * 关联任务ID-hidden
     */
    @TableField("VC_JOBNUMBER")
    private String vcJobnumber;


    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getnDid() {
        return nDid;
    }

    public void setnDid(String nDid) {
        this.nDid = nDid;
    }

    public String getnMid() {
        return nMid;
    }

    public void setnMid(String nMid) {
        this.nMid = nMid;
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

    public String getVcSingpersonid() {
        return vcSingpersonid;
    }

    public void setVcSingpersonid(String vcSingpersonid) {
        this.vcSingpersonid = vcSingpersonid;
    }

    public String getVcSingperson() {
        return vcSingperson;
    }

    public void setVcSingperson(String vcSingperson) {
        this.vcSingperson = vcSingperson;
    }

    public String getVcFinishinfo() {
        return vcFinishinfo;
    }

    public void setVcFinishinfo(String vcFinishinfo) {
        this.vcFinishinfo = vcFinishinfo;
    }

    public String getVcStatus() {
        return vcStatus;
    }

    public void setVcStatus(String vcStatus) {
        this.vcStatus = vcStatus;
    }

    public String getVcJobtype() {
        return vcJobtype;
    }

    public void setVcJobtype(String vcJobtype) {
        this.vcJobtype = vcJobtype;
    }

    public String getVcJobnumber() {
        return vcJobnumber;
    }

    public void setVcJobnumber(String vcJobnumber) {
        this.vcJobnumber = vcJobnumber;
    }

    @Override
    public String toString() {
        return "YmTMonthimpfinishKmn{" +
        "nId=" + nId +
        ", nDid=" + nDid +
        ", nMid=" + nMid +
        ", vcOrgid=" + vcOrgid +
        ", vcOrgname=" + vcOrgname +
        ", vcSingpersonid=" + vcSingpersonid +
        ", vcSingperson=" + vcSingperson +
        ", vcFinishinfo=" + vcFinishinfo +
        ", vcStatus=" + vcStatus +
        ", vcJobtype=" + vcJobtype +
        ", vcJobnumber=" + vcJobnumber +
        "}";
    }
}
