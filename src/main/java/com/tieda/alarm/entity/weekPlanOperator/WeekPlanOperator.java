package com.tieda.alarm.entity.weekPlanOperator;

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
 * @since 2020-01-13
 */
@TableName("WEEK_PLAN_OPERATOR")
public class WeekPlanOperator implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;
    @TableField("MID")
    private String mid;
    /**
     * 建议
     */
    @TableField("CONTENT")
    private String content;
    /**
     * 操作步骤
     */
    @TableField("OPERATE")
    private String operate;
    @TableField("CREATEDATE")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createdate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "WeekPlanOperator{" +
        "id=" + id +
        ", mid=" + mid +
        ", content=" + content +
        ", operate=" + operate +
        ", createdate=" + createdate +
        "}";
    }
}
