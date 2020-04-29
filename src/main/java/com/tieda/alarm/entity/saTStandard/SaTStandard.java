package com.tieda.alarm.entity.saTStandard;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 标准化规范化管理
 * </p>
 *
 * @author 
 * @since 2019-09-02
 */
@TableName("SA_T_STANDARD")
public class SaTStandard implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部门编号--text
     */
    @TableId("ORGID")
    private String orgid;
    /**
     * FTP地址--text
     */
    @TableField("FTPURL")
    private String ftpurl;
    /**
     * 排序--text
     */
    @TableField("NORDER")
    private Double norder;
    /**
     * 部门名称--select
     */
    @TableField("ORGNAME")
    private String orgname;
    /**
     * --0：科室，1：高铁车间，2：普铁车间
     */
    @TableField("ORGTYPE")
    private String orgtype;

    @TableField("ACCOUNT")
    private String account;


    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getFtpurl() {
        return ftpurl;
    }

    public void setFtpurl(String ftpurl) {
        this.ftpurl = ftpurl;
    }

    public Double getNorder() {
        return norder;
    }

    public void setNorder(Double norder) {
        this.norder = norder;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getOrgtype() {
        return orgtype;
    }

    public void setOrgtype(String orgtype) {
        this.orgtype = orgtype;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "SaTStandard{" +
        "orgid=" + orgid +
        ", ftpurl=" + ftpurl +
        ", norder=" + norder +
        ", orgname=" + orgname +
        ", orgtype=" + orgtype +
        ", account=" + account +
        "}";
    }
}
