package com.tieda.alarm.entity.emAlarmelect;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 报警电路图对应表
 * </p>
 *
 * @author
 * @since 2019-05-18
 */
@TableName("EM_ALARMELECT" )
public class EmAlarmelect implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 关系序号
     */
    @TableId("N_ID" )
    private String nId;
    /**
     * 报警类型ID
     */
    @TableField("ALARMTYPEID" )
    private String alarmtypeid;
    /**
     * 报警电路图ID
     */
    @TableField("ALARMELEMAPID" )
    private String alarmelemapid;
    /**
     * 报警电路图名称
     */
    @TableField("ALARMELEMAPNAME" )
    private String alarmelemapname;
    /**
     * 报警电路图节点
     */
    @TableField("ALARMELEMAPNODES" )
    private String alarmelemapnodes;


    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getAlarmtypeid() {
        return alarmtypeid;
    }

    public void setAlarmtypeid(String alarmtypeid) {
        this.alarmtypeid = alarmtypeid;
    }

    public String getAlarmelemapid() {
        return alarmelemapid;
    }

    public void setAlarmelemapid(String alarmelemapid) {
        this.alarmelemapid = alarmelemapid;
    }

    public String getAlarmelemapname() {
        return alarmelemapname;
    }

    public void setAlarmelemapname(String alarmelemapname) {
        this.alarmelemapname = alarmelemapname;
    }

    public String getAlarmelemapnodes() {
        return alarmelemapnodes;
    }

    public void setAlarmelemapnodes(String alarmelemapnodes) {
        this.alarmelemapnodes = alarmelemapnodes;
    }

    @Override
    public String toString() {
        return "EmAlarmelect{" +
                "nId=" + nId +
                ", alarmtypeid=" + alarmtypeid +
                ", alarmelemapid=" + alarmelemapid +
                ", alarmelemapname=" + alarmelemapname +
                ", alarmelemapnodes=" + alarmelemapnodes +
                "}";
    }
}
