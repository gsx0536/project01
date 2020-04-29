package com.tieda.alarm.entity.testScheme;

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
 * @since 2019-12-11
 */
@TableName("TEST_SCHEME")
public class TestScheme implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;
    /**
     * 联锁软件说明
     */
    @TableField("NAME")
    private String name;
    /**
     * 前期工作确认
     */
    @TableField("PRE")
    private String pre;
    /**
     * 试验方法
     */
    @TableField("METHOD")
    private String method;
    /**
     * 步骤
     */
    @TableField("STEP")
    private String step;
    /**
     * 卡控措施
     */
    @TableField("CONTROL")
    private String control;
    /**
     * 状态 1 编制中,2 已提交,3 已审核，4 审核驳回，5 已审批，6 审批驳回 ,7 实验中， 8完成待确认，9，完成确认
     */
    @TableField("STATUS")
    private String status;
    /**
     * 车间Id
     */
    @TableField("VCORGID")
    private String vcorgid;
    /**
     * 编制类型：1，车间编制。2，主任编制
     */
    @TableField("TYPE")
    private String type;
    @TableField("CREATEDATE")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date createdate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVcorgid() {
        return vcorgid;
    }

    public void setVcorgid(String vcorgid) {
        this.vcorgid = vcorgid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "TestScheme{" +
        "id=" + id +
        ", name=" + name +
        ", pre=" + pre +
        ", method=" + method +
        ", step=" + step +
        ", control=" + control +
        ", status=" + status +
        ", vcorgid=" + vcorgid +
        ", type=" + type +
        ", createdate=" + createdate +
        "}";
    }
}
