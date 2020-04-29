package com.tieda.alarm.entity.checkRackItem;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.tieda.alarm.entity.dicRackItem.DicRackItem;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2019-05-20
 */
@TableName("CHECK_RACK_ITEM")
public class CheckRackItem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId("ID")
    private String id;
    /**
     * 主表ID
     */
    @TableField("CHECKRACKID")
    private String checkrackid;
    /**
     * 作业内容
     */
    @TableField("ITEM")
    private String item;
    /**
     * 状态
     */
    @TableField("STATUS")
    private String status;
    /**
     * 完成时间
     */
    @TableField("WORKDATE")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date workdate;
    /**
     * 作业项目
     */
    @TableField("RACKNAME")
    private String rackname;
    @TableField("ITEMID")
    private String itemid;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date finishdate;
    private String content;

    private String driId;
    private String driRackId;
    private String driName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCheckrackid() {
        return checkrackid;
    }

    public void setCheckrackid(String checkrackid) {
        this.checkrackid = checkrackid;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getWorkdate() {
        return workdate;
    }

    public void setWorkdate(Date workdate) {
        this.workdate = workdate;
    }

    public String getRackname() {
        return rackname;
    }

    public void setRackname(String rackname) {
        this.rackname = rackname;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getDriId() {
        return driId;
    }

    public void setDriId(String driId) {
        this.driId = driId;
    }

    public String getDriRackId() {
        return driRackId;
    }

    public void setDriRackId(String driRackId) {
        this.driRackId = driRackId;
    }

    public String getDriName() {
        return driName;
    }

    public void setDriName(String driName) {
        this.driName = driName;
    }

    public Date getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CheckRackItem{" +
        "id=" + id +
        ", checkrackid=" + checkrackid +
        ", item=" + item +
        ", status=" + status +
        ", workdate=" + workdate +
        ", rackname=" + rackname +
        ", itemid=" + itemid +
        "}";
    }
}
