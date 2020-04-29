package com.tieda.alarm.entity.jzjcProblemLog;

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
 * @since 2019-11-16
 */
@TableName("JZJC_PROBLEM_LOG")
public class JzjcProblemLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;
    @TableField("PROBLEMID")
    private String problemid;
    @TableField("CREATEDATE")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date createdate;
    @TableField("INFOR")
    private String infor;
    @TableField("OPERORG")
    private String operorg;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProblemid() {
        return problemid;
    }

    public void setProblemid(String problemid) {
        this.problemid = problemid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    public String getOperorg() {
        return operorg;
    }

    public void setOperorg(String operorg) {
        this.operorg = operorg;
    }

    @Override
    public String toString() {
        return "JzjcProblemLog{" +
                "id=" + id +
                ", problemid=" + problemid +
                ", createdate=" + createdate +
                ", infor=" + infor +
                "}";
    }
}
