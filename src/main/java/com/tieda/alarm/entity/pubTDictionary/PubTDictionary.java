package com.tieda.alarm.entity.pubTDictionary;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author
 * @since 2019-09-04
 */
@TableName("PUB_T_DICTIONARY")
public class PubTDictionary implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 主键--text
     */
    @TableId("VC_ID")
    private String vcId;
    /**
     * 服务器ID--text
     */
    @TableField("VC_SERVER")
    private String vcServer;
    /**
     * 上一级主键--text
     */
    @TableField("VC_M$ID")
    private String vcMid;
    /**
     * 字典名称--text
     */
    @TableField("VC_NAME")
    private String vcName;
    /**
     * 排序--text
     */
    @TableField("N_ORDER")
    private Double nOrder;
    /**
     * --逻辑删除,0不删除,1删除
     */
    @TableField("VC_DEL")
    private String vcDel;
    /**
     * 录入人--hidden
     */
    @TableField("VC_USER")
    private String vcUser;
    /**
     * 录入时间--hidden
     */
    @TableField("DT_DATE")
    private Date dtDate;
    /**
     * 所属机构--hidden
     */
    @TableField("VC_ORG$ID")
    private String vcOrgid;
    /**
     * 逻辑删除--hidden
     */
    @TableField("VC_DELORG")
    private String vcDelorg;

    /***
     * 是否是叶子节点--true是 false不是
     */
    private boolean leafNode = false;
    /**
     * 日期--hidden
     */
    @TableField("DT_DELTIME")
    private Date dtDeltime;

    public String getVcServer() {
        return vcServer;
    }

    public void setVcServer(String vcServer) {
        this.vcServer = vcServer;
    }

    public String getVcId() {
        return vcId;
    }

    public void setVcId(String vcId) {
        this.vcId = vcId;
    }

    public String getVcM$id() {
        return vcMid;
    }

    public void setVcM$id(String vcMid) {
        this.vcMid = vcMid;
    }

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName;
    }

    public Double getnOrder() {
        return nOrder;
    }

    public void setnOrder(Double nOrder) {
        this.nOrder = nOrder;
    }

    public String getVcDel() {
        return vcDel;
    }

    public void setVcDel(String vcDel) {
        this.vcDel = vcDel;
    }

    public String getVcUser() {
        return vcUser;
    }

    public void setVcUser(String vcUser) {
        this.vcUser = vcUser;
    }

    public Date getDtDate() {
        return dtDate;
    }

    public void setDtDate(Date dtDate) {
        this.dtDate = dtDate;
    }

    public String getVcOrg$id() {
        return vcOrgid;
    }

    public void setVcOrg$id(String vcOrg$id) {
        this.vcOrgid = vcOrg$id;
    }

    public String getVcDelorg() {
        return vcDelorg;
    }

    public void setVcDelorg(String vcDelorg) {
        this.vcDelorg = vcDelorg;
    }

    public Date getDtDeltime() {
        return dtDeltime;
    }

    public void setDtDeltime(Date dtDeltime) {
        this.dtDeltime = dtDeltime;
    }

    public String getVcMid() {
        return vcMid;
    }

    public void setVcMid(String vcMid) {
        this.vcMid = vcMid;
    }

    public String getVcOrgid() {
        return vcOrgid;
    }

    public void setVcOrgid(String vcOrgid) {
        this.vcOrgid = vcOrgid;
    }

    public boolean isLeafNode() {
        return leafNode;
    }

    public void setLeafNode(boolean leafNode) {
        this.leafNode = leafNode;
    }

    @Override
    public String toString() {
        return "PubTDictionary{" +
                "vcServer=" + vcServer +
                ", vcId=" + vcId +
                ", vcMid=" + vcMid +
                ", vcName=" + vcName +
                ", nOrder=" + nOrder +
                ", vcDel=" + vcDel +
                ", vcUser=" + vcUser +
                ", dtDate=" + dtDate +
                ", vcOrgid=" + vcOrgid +
                ", vcDelorg=" + vcDelorg +
                ", dtDeltime=" + dtDeltime +
                "}";
    }
}
