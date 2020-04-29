package com.tieda.alarm.entity.jzjcProblemHandle;

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
@TableName("JZJC_PROBLEM_HANDLE")
public class JzjcProblemHandle implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;
    @TableField("PROBLEMID")
    private String problemid;
    @TableField("CREATEDATE")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date createdate;
    @TableField("ORG")
    private String org;
    @TableField("ORGNAME")
    private String orgname;
    @TableField("OPERATOR")
    private String operator;
    @TableField("CONTENT")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

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

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "JzjcProblemHandle{" +
                "id=" + id +
                ", problemid=" + problemid +
                ", createdate=" + createdate +
                ", org=" + org +
                ", orgname=" + orgname +
                ", operator=" + operator +
                "}";
    }
}
