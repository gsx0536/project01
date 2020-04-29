package com.tieda.alarm.entity.sysTRules;

import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 技术规章信息表
 * </p>
 *
 * @author
 * @since 2019-09-03
 */
@TableName("SYS_T_RULES")
public class SysTRules implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 技术规章信息表--text
     */
    @TableId("N_ID")
    private Double nId;
    /**
     * 目录编号--text
     */
    @TableField("VC_CATALOG$NO")
    private String vcCatalogno;
    /**
     * 文件标题--text
     */
    @TableField("VC_FILE$TITLE")
    private String vcFiletitle;
    /**
     * 文号--text
     */
    @TableField("VC_FILE$NUMBER")
    private String vcFilenumber;
    /**
     * 发文时间--date
     */
    @TableField("DT_SEND$TIME")
    private Date dtSendtime;
    /**
     * 拟稿部门--select
     */
    @TableField("VC_DRAFT$DEPT")
    private String vcDraftdept;
    /**
     * 发文依据文号--text
     */
    @TableField("VC_SEND$FILE$NUMBER")
    private String vcSendfilenumber;
    /**
     * 关键字--text
     */
    @TableField("VC_KEY$WORD")
    private String vcKeyword;
    /**
     * 备注--text
     */
    @TableField("VC_REMARKS")
    private String vcRemarks;
    /**
     * 文件电子档保存名称--text
     */
    @TableField("VC_ELECTRONIC$SAVE$NAME")
    private String vcElectronicsavename;
    /**
     * 文件电子档对应源文件名称--text
     */
    @TableField("VC_ELECTRONIC$SOURCE$NAME")
    private String vcElectronicsourcename;
    /**
     * 附件一保存名称--text
     */
    @TableField("VC_ANNEX$ONE$SAVE$NAME")
    private String vcAnnexonesavename;
    /**
     * 附件一对应源文件名称--text
     */
    @TableField("VC_ANNEX$ONE$SOURCE$NAME")
    private String vcAnnexonesourcename;
    /**
     * 附件二保存名称--text
     */
    @TableField("VC_ANNEX$TWO$SAVE$NAME")
    private String vcAnnextwosavename;
    /**
     * 附件二对应源文件名称--text
     */
    @TableField("VC_ANNEX$TWO$SOURCE$NAME")
    private String vcAnnextwosourcename;
    /**
     * 文件及附件上传时间--text
     */
    @TableField("DT_UPLOAD$TIME")
    private Date dtUploadtime;
    /**
     * type--select
     */
    @TableField("FILE_CLASS")
    private String fileClass;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Double getnId() {
        return nId;
    }

    public void setnId(Double nId) {
        this.nId = nId;
    }

    public String getVcCatalogno() {
        return vcCatalogno;
    }

    public void setVcCatalogno(String vcCatalogno) {
        this.vcCatalogno = vcCatalogno;
    }

    public String getVcFiletitle() {
        return vcFiletitle;
    }

    public void setVcFiletitle(String vcFiletitle) {
        this.vcFiletitle = vcFiletitle;
    }

    public String getVcFilenumber() {
        return vcFilenumber;
    }

    public void setVcFilenumber(String vcFilenumber) {
        this.vcFilenumber = vcFilenumber;
    }

    public Date getDtSendtime() {
        return dtSendtime;
    }

    public void setDtSendtime(Date dtSendtime) {
        this.dtSendtime = dtSendtime;
    }

    public String getVcDraftdept() {
        return vcDraftdept;
    }

    public void setVcDraft$dept(String vcDraftdept) {
        this.vcDraftdept = vcDraftdept;
    }

    public String getVcSendfilenumber() {
        return vcSendfilenumber;
    }

    public void setVcSendfilenumber(String vcSendfilenumber) {
        this.vcSendfilenumber = vcSendfilenumber;
    }

    public String getVcKeyword() {
        return vcKeyword;
    }

    public void setVcKeyword(String vcKeyword) {
        this.vcKeyword = vcKeyword;
    }

    public String getVcRemarks() {
        return vcRemarks;
    }

    public void setVcRemarks(String vcRemarks) {
        this.vcRemarks = vcRemarks;
    }

    public String getVcElectronicsavename() {
        return vcElectronicsavename;
    }

    public void setVcElectronicsavename(String vcElectronicsavename) {
        this.vcElectronicsavename = vcElectronicsavename;
    }

    public String getVcElectronicsourcename() {
        return vcElectronicsourcename;
    }

    public void setVcElectronicsourcename(String vcElectronicsourcename) {
        this.vcElectronicsourcename = vcElectronicsourcename;
    }

    public String getVcAnnexonesavename() {
        return vcAnnexonesavename;
    }

    public void setVcAnnexonesavename(String vcAnnexonesavename) {
        this.vcAnnexonesavename = vcAnnexonesavename;
    }

    public String getVcAnnexonesourcename() {
        return vcAnnexonesourcename;
    }

    public void setVcAnnexonesourcename(String vcAnnexonesourcename) {
        this.vcAnnexonesourcename = vcAnnexonesourcename;
    }

    public String getVcAnnextwosavename() {
        return vcAnnextwosavename;
    }

    public void setVcAnnextwosavename(String vcAnnextwosavename) {
        this.vcAnnextwosavename = vcAnnextwosavename;
    }

    public String getVcAnnextwosourcename() {
        return vcAnnextwosourcename;
    }

    public void setVcAnnextwosourcename(String vcAnnextwosourcename) {
        this.vcAnnextwosourcename = vcAnnextwosourcename;
    }

    public Date getDtUploadtime() {
        return dtUploadtime;
    }

    public void setDtUploadtime(Date dtUploadtime) {
        this.dtUploadtime = dtUploadtime;
    }

    public String getFileClass() {
        return fileClass;
    }

    public void setFileClass(String fileClass) {
        this.fileClass = fileClass;
    }

    @Override
    public String toString() {
        return "SysTRules{" +
                "nId=" + nId +
                ", vcCatalogno='" + vcCatalogno + '\'' +
                ", vcFiletitle='" + vcFiletitle + '\'' +
                ", vcFilenumber='" + vcFilenumber + '\'' +
                ", dtSendtime=" + dtSendtime +
                ", vcDraftdept='" + vcDraftdept + '\'' +
                ", vcSendfilenumber='" + vcSendfilenumber + '\'' +
                ", vcKeyword='" + vcKeyword + '\'' +
                ", vcRemarks='" + vcRemarks + '\'' +
                ", vcElectronicsavename='" + vcElectronicsavename + '\'' +
                ", vcElectronicsourcename='" + vcElectronicsourcename + '\'' +
                ", vcAnnexonesavename='" + vcAnnexonesavename + '\'' +
                ", vcAnnexonesourcename='" + vcAnnexonesourcename + '\'' +
                ", vcAnnextwosavename='" + vcAnnextwosavename + '\'' +
                ", vcAnnextwosourcename='" + vcAnnextwosourcename + '\'' +
                ", dtUploadtime=" + dtUploadtime +
                ", fileClass='" + fileClass + '\'' +
                '}';
    }
}
