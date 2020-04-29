package com.tieda.alarm.entity.wrongtree;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;

/**
 * <p>
 * 故障树
 * </p>
 *
 * @author
 * @since 2019-05-17
 */
public class Wrongtree implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 故障树ID
     */
    @TableId("N_ID" )
    private String nId;
    /**
     * 节点ID
     */
    @TableField("NODEID" )
    private String nodeid;
    /**
     * 父节点ID
     */
    @TableField("PARENTID" )
    private String parentid;
    /**
     * 监测数据类型（开关量，模拟量）
     */
    @TableField("MONITORTYPE" )
    private String monitortype;
    /**
     * 监测数据ID
     */
    @TableField("MONITORID" )
    private String monitorid;
    /**
     * 节点名称
     */
    @TableField("NODENAME" )
    private String nodename;
    /**
     * 树名称
     */
    @TableField("TREENAME" )
    private String treename;
    /**
     * 树id
     */
    @TableField("TREEID" )
    private String treeid;


    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getMonitortype() {
        return monitortype;
    }

    public void setMonitortype(String monitortype) {
        this.monitortype = monitortype;
    }

    public String getMonitorid() {
        return monitorid;
    }

    public void setMonitorid(String monitorid) {
        this.monitorid = monitorid;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    public String getTreename() {
        return treename;
    }

    public void setTreename(String treename) {
        this.treename = treename;
    }

    public String getTreeid() {
        return treeid;
    }

    public void setTreeid(String treeid) {
        this.treeid = treeid;
    }

    @Override
    public String toString() {
        return "Wrongtree{" +
                "nId=" + nId +
                ", nodeid=" + nodeid +
                ", parentid=" + parentid +
                ", monitortype=" + monitortype +
                ", monitorid=" + monitorid +
                ", nodename=" + nodename +
                ", treename=" + treename +
                ", treeid=" + treeid +
                "}";
    }
}
