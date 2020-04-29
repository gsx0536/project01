package com.tieda.alarm.entity.ymVMonthimpworkFinishKmn;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2019-06-11
 */
@TableName("YM_V_MONTHIMPWORK_FINISH_KMN")
public class YmVMonthimpworkFinishKmn implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("N_ID")
    private String nId;
    @TableField("MID")
    private String mid;
    @TableField("N_YEAR")
    private Integer nYear;
    @TableField("N_MONTH")
    private Integer nMonth;
    @TableField("VC_NOTE")
    private String vcNote;
    @TableField("DID")
    private String did;
    @TableField("VC_WORKTYPE")
    private String vcWorktype;
    @TableField("VC_PROJECT")
    private String vcProject;
    @TableField("VC_WORKDETAIL")
    private String vcWorkdetail;
    @TableField("VC_SINGPERSON")
    private String vcSingperson;
    @TableField("VC_STATUS")
    private String vcStatus;
    @TableField("VC_FINISHINFO")
    private String vcFinishinfo;
    @TableField("VC_FILENAME")
    private String vcFilename;
    @TableField("VC_FILEPATH")
    private String vcFilepath;
    @TableField("VCORGID")
    private String vcOrgId;
    @TableField("DT_DEADLINE")
    private String dtDeadLine;
    @TableField("VC_CHARGER")
    private String vcCharger;


    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
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

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getVcWorktype() {
        return vcWorktype;
    }

    public void setVcWorktype(String vcWorktype) {
        this.vcWorktype = vcWorktype;
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

    public String getVcSingperson() {
        return vcSingperson;
    }

    public void setVcSingperson(String vcSingperson) {
        this.vcSingperson = vcSingperson;
    }

    public String getVcStatus() {
        return vcStatus;
    }

    public void setVcStatus(String vcStatus) {
        this.vcStatus = vcStatus;
    }

    public String getVcFinishinfo() {
        return vcFinishinfo;
    }

    public void setVcFinishinfo(String vcFinishinfo) {
        this.vcFinishinfo = vcFinishinfo;
    }

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

    public String getVcOrgId() {
        return vcOrgId;
    }

    public void setVcOrgId(String vcOrgId) {
        this.vcOrgId = vcOrgId;
    }

    public String getDtDeadLine() {
        return dtDeadLine;
    }

    public void setDtDeadLine(String dtDeadLine) {
        this.dtDeadLine = dtDeadLine;
    }

    public String getVcCharger() {
        return vcCharger;
    }

    public void setVcCharger(String vcCharger) {
        this.vcCharger = vcCharger;
    }

    @Override
    public String toString() {
        return "YmVMonthimpworkFinishKmn{" +
        "nId=" + nId +
        ", mid=" + mid +
        ", nYear=" + nYear +
        ", nMonth=" + nMonth +
        ", vcNote=" + vcNote +
        ", did=" + did +
        ", vcWorktype=" + vcWorktype +
        ", vcProject=" + vcProject +
        ", vcWorkdetail=" + vcWorkdetail +
        ", vcSingperson=" + vcSingperson +
        ", vcStatus=" + vcStatus +
        ", vcFinishinfo=" + vcFinishinfo +
        ", vcFilename=" + vcFilename +
                ", vcFilepath=" + vcFilepath +
                ", vcOrgId=" + vcOrgId +
                ", dtDeadLine=" + dtDeadLine +
                ", vcCharger=" + vcCharger +
        "}";
    }
}
