package com.tieda.alarm.entity.emerProcedure;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 应急处置流程
 * </p>
 *
 * @author
 * @since 2019-05-26
 */
@TableName("EMER_PROCEDURE")
public class EmerProcedure implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ID")
    private Long id;
    /**
     * 应急目录ID
     */
    @TableField("CID")
    private Double cid;
    /**
     * 应急目录名称
     */
    @TableField("CONTENT")
    private String content;
    /**
     * 步骤
     */
    @TableField("STEP")
    private String step;
    /**
     * 步骤序号
     */
    @TableField("STEP_NO")
    private String stepNo;
    /**
     * 顺号
     */
    @TableField("NO")
    private String no;
    /**
     * 处置流程
     */
    @TableField("PROCESS")
    private String process;
    /**
     * 作业要求
     */
    @TableField("HANDLE_REQUIRE")
    private String handleRequire;
    /**
     * 作业时间
     */
    @TableField("HANDLE_TIME")
    private String handleTime;
    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;
    /**
     * 模板索引：1登记停用及行车限制条件模板，2申请上道处理登记模板，3设备恢复销记模板，4处理完毕下道销记模板，5登乘动车登记模板
     */
    @TableField("TEMP_INDEX")
    private String tempIndex;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCid() {
        return cid;
    }

    public void setCid(Double cid) {
        this.cid = cid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getStepNo() {
        return stepNo;
    }

    public void setStepNo(String stepNo) {
        this.stepNo = stepNo;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getHandleRequire() {
        return handleRequire == null ? null : handleRequire.replace("\n", "<br/>");
    }

    public void setHandleRequire(String handleRequire) {
        this.handleRequire = handleRequire;
    }

    public String getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(String handleTime) {
        this.handleTime = handleTime;
    }

    public String getRemark() {
        return remark == null ? null : remark.replace("\n", "<br/>");
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTempIndex() {
        return tempIndex;
    }

    public void setTempIndex(String tempIndex) {
        this.tempIndex = tempIndex;
    }

    @Override
    public String toString() {
        return "EmerProcedure{" +
                "id=" + id +
                ", cid=" + cid +
                ", content=" + content +
                ", step=" + step +
                ", stepNo=" + stepNo +
                ", no=" + no +
                ", process=" + process +
                ", handleRequire=" + handleRequire +
                ", handleTime=" + handleTime +
                ", remark=" + remark +
                ", tempIndex=" + tempIndex +
                "}";
    }
}
