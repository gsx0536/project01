package com.tieda.alarm.entity.emAlarmwrongtree;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 设备故障树对应关系表
 * </p>
 *
 * @author
 * @since 2019-05-18
 */
@TableName("EM_ALARMWRONGTREE" )
public class EmAlarmwrongtree implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 记录ID
     */
    @TableId("N_ID" )
    private String nId;
    /**
     * 设备类型ID
     */
    @TableField("DEVTYPEID" )
    private String devtypeid;
    /**
     * 设备类型名称
     */
    @TableField("DEVTYPENAME" )
    private String devtypename;
    /**
     * 报警类型ID
     */
    @TableField("ALARMTYPEID" )
    private String alarmtypeid;
    /**
     * 报警类型名称
     */
    @TableField("ALARMTYPENAME" )
    private String alarmtypename;
    /**
     * 故障树ID
     */
    @TableField("WRONGTREEID" )
    private String wrongtreeid;
    /**
     * 故障树名称
     */
    @TableField("WRONGTREENAME" )
    private String wrongtreename;
    /**
     * 故障树节点ID
     */
    @TableField("NODEID" )
    private String nodeid;
    /**
     * 故障树节点名称
     */
    @TableField("NODENAME" )
    private String nodename;


    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getDevtypeid() {
        return devtypeid;
    }

    public void setDevtypeid(String devtypeid) {
        this.devtypeid = devtypeid;
    }

    public String getDevtypename() {
        return devtypename;
    }

    public void setDevtypename(String devtypename) {
        this.devtypename = devtypename;
    }

    public String getAlarmtypeid() {
        return alarmtypeid;
    }

    public void setAlarmtypeid(String alarmtypeid) {
        this.alarmtypeid = alarmtypeid;
    }

    public String getAlarmtypename() {
        return alarmtypename;
    }

    public void setAlarmtypename(String alarmtypename) {
        this.alarmtypename = alarmtypename;
    }

    public String getWrongtreeid() {
        return wrongtreeid;
    }

    public void setWrongtreeid(String wrongtreeid) {
        this.wrongtreeid = wrongtreeid;
    }

    public String getWrongtreename() {
        return wrongtreename;
    }

    public void setWrongtreename(String wrongtreename) {
        this.wrongtreename = wrongtreename;
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid;
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename;
    }

    @Override
    public String toString() {
        return "EmAlarmwrongtree{" +
                "nId=" + nId +
                ", devtypeid=" + devtypeid +
                ", devtypename=" + devtypename +
                ", alarmtypeid=" + alarmtypeid +
                ", alarmtypename=" + alarmtypename +
                ", wrongtreeid=" + wrongtreeid +
                ", wrongtreename=" + wrongtreename +
                ", nodeid=" + nodeid +
                ", nodename=" + nodename +
                "}";
    }
}
