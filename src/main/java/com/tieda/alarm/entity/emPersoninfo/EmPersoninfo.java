package com.tieda.alarm.entity.emPersoninfo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 应急抢修队伍
 * </p>
 *
 * @author 
 * @since 2019-05-28
 */
@TableName("EM_PERSONINFO")
public class EmPersoninfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应急人员ID
     */
    @TableField("N_ID")
    private String nId;
    /**
     * 应急人员姓名
     */
    @TableField("VC_PERSONNAME")
    private String vcPersonname;
    /**
     * 应急人员部门ID
     */
    @TableField("VC_DEVID")
    private String vcDevid;
    /**
     * 应急人员部门名称
     */
    @TableField("VC_DEVNAME")
    private String vcDevname;
    /**
     * 应急人员电话
     */
    @TableField("VC_TLEPHONE")
    private String vcTlephone;
    /**
     * 应急人员备注
     */
    @TableField("VC_NOTE")
    private String vcNote;
    /**
     * 应急人员手机
     */
    @TableField("VC_HANDPHONE")
    private String vcHandphone;
    /**
     * 职务
     */
    @TableField("VC_JOB")
    private String vcJob;


    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getVcPersonname() {
        return vcPersonname;
    }

    public void setVcPersonname(String vcPersonname) {
        this.vcPersonname = vcPersonname;
    }

    public String getVcDevid() {
        return vcDevid;
    }

    public void setVcDevid(String vcDevid) {
        this.vcDevid = vcDevid;
    }

    public String getVcDevname() {
        return vcDevname;
    }

    public void setVcDevname(String vcDevname) {
        this.vcDevname = vcDevname;
    }

    public String getVcTlephone() {
        return vcTlephone;
    }

    public void setVcTlephone(String vcTlephone) {
        this.vcTlephone = vcTlephone;
    }

    public String getVcNote() {
        return vcNote;
    }

    public void setVcNote(String vcNote) {
        this.vcNote = vcNote;
    }

    public String getVcHandphone() {
        return vcHandphone;
    }

    public void setVcHandphone(String vcHandphone) {
        this.vcHandphone = vcHandphone;
    }

    public String getVcJob() {
        return vcJob;
    }

    public void setVcJob(String vcJob) {
        this.vcJob = vcJob;
    }

    @Override
    public String toString() {
        return "EmPersoninfo{" +
        "nId=" + nId +
        ", vcPersonname=" + vcPersonname +
        ", vcDevid=" + vcDevid +
        ", vcDevname=" + vcDevname +
        ", vcTlephone=" + vcTlephone +
        ", vcNote=" + vcNote +
        ", vcHandphone=" + vcHandphone +
        ", vcJob=" + vcJob +
        "}";
    }
}
