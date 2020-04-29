package com.tieda.alarm.entity.checkRack;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 作业主表
 * </p>
 *
 * @author 
 * @since 2019-05-20
 */
@TableName("CHECK_RACK")
public class CheckRack implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId("ID")
    private String id;
    /**
     * 车间
     */
    @TableField("WORKSHOP")
    private String workshop;
    /**
     * 工区
     */
    @TableField("WORKAREA")
    private String workarea;
    /**
     * 工作人
     */
    @TableField("WORKER")
    private String worker;
    /**
     * 工作类型
     */
    @TableField("WORKTYPE")
    private String worktype;
    /**
     * 机柜
     */
    @TableField("RACKID")
    private String rackid;
    /**
     * 工作内容
     */
    @TableField("CONTENT")
    private String content;
    /**
     * 状态1:提交，2：保存
     */
    @TableField("STATUS")
    private String status;
    /**
     * 开始时间
     */
    @TableField("BEGINDATE")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date begindate;
    /**
     * 完成时间
     */
    @TableField("FINISHDATE")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date finishdate;
    /**
     * 机柜名称
     */
    @TableField("RACKNAME")
    private String rackname;

    private List itemName;
    private List itemId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }

    public String getWorkarea() {
        return workarea;
    }

    public void setWorkarea(String workarea) {
        this.workarea = workarea;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype;
    }

    public String getRackid() {
        return rackid;
    }

    public void setRackid(String rackid) {
        this.rackid = rackid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }

    public String getRackname() {
        return rackname;
    }

    public void setRackname(String rackname) {
        this.rackname = rackname;
    }

    public List getItemName() {
        return itemName;
    }

    public void setItemName(List itemName) {
        this.itemName = itemName;
    }

    public List getItemId() {
        return itemId;
    }

    public void setItemId(List itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        return "CheckRack{" +
        "id=" + id +
        ", workshop=" + workshop +
        ", workarea=" + workarea +
        ", worker=" + worker +
        ", worktype=" + worktype +
        ", rackid=" + rackid +
        ", content=" + content +
        ", status=" + status +
        ", begindate=" + begindate +
        ", finishdate=" + finishdate +
        ", rackname=" + rackname +
        "}";
    }
}
