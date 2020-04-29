package com.tieda.alarm.entity.emerEqpTemplate;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 应急处置设备故障相关模板
 * </p>
 *
 * @author
 * @since 2019-05-26
 */
@TableName("EMER_EQP_TEMPLATE")
public class EmerEqpTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId("ID")
    private Long id;
    /**
     * 车站id
     */
    @TableField("STATION")
    private String station;
    /**
     * 设备名称
     */
    @TableField("EQUIP_NAME")
    private String equipName;
    /**
     * 设备坐标或起止里程
     */
    @TableField("EQUIP_POSITION")
    private String equipPosition;
    /**
     * 对应作业门名称及里程
     */
    @TableField("WORK_DOOR")
    private String workDoor;
    /**
     * 登记停用及行车限制条件模板
     */
    @TableField("RESTRICT_RUN")
    private String restrictRun;
    /**
     * 申请上道处理登记模板
     */
    @TableField("APPLY_TO_RAIL")
    private String applyToRail;
    /**
     * 设备恢复销记模板
     */
    @TableField("EQUIP_RECOVER")
    private String equipRecover;
    /**
     * 处理完毕下道销记模板
     */
    @TableField("EXIT_RAIL")
    private String exitRail;
    /**
     * 登乘动车登记模板
     */
    @TableField("TAKE_TRAIN")
    private String takeTrain;
    /**
     * 备注
     */
    @TableField("REMARK")
    private String remark;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    public String getEquipPosition() {
        return equipPosition;
    }

    public void setEquipPosition(String equipPosition) {
        this.equipPosition = equipPosition;
    }

    public String getWorkDoor() {
        return workDoor;
    }

    public void setWorkDoor(String workDoor) {
        this.workDoor = workDoor;
    }

    public String getRestrictRun() {
        return restrictRun == null ? null : restrictRun.replace("\n", "<br/>");
    }

    public void setRestrictRun(String restrictRun) {
        this.restrictRun = restrictRun;
    }

    public String getApplyToRail() {
        return applyToRail == null ? null : applyToRail.replace("\n", "<br/>");
    }

    public void setApplyToRail(String applyToRail) {
        this.applyToRail = applyToRail;
    }

    public String getEquipRecover() {
        return equipRecover == null ? null : equipRecover.replace("\n", "<br/>");
    }

    public void setEquipRecover(String equipRecover) {
        this.equipRecover = equipRecover;
    }

    public String getExitRail() {
        return exitRail == null ? null : exitRail.replace("\n", "<br/>");
    }

    public void setExitRail(String exitRail) {
        this.exitRail = exitRail;
    }

    public String getTakeTrain() {
        return takeTrain == null ? null : takeTrain.replace("\n", "<br/>");
    }

    public void setTakeTrain(String takeTrain) {
        this.takeTrain = takeTrain;
    }

    public String getRemark() {
        return remark == null ? null : remark.replace("\n", "<br/>");
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "EmerEqpTemplate{" +
                "id=" + id +
                ", station=" + station +
                ", equipName=" + equipName +
                ", equipPosition=" + equipPosition +
                ", workDoor=" + workDoor +
                ", restrictRun=" + restrictRun +
                ", applyToRail=" + applyToRail +
                ", equipRecover=" + equipRecover +
                ", exitRail=" + exitRail +
                ", takeTrain=" + takeTrain +
                ", remark=" + remark +
                "}";
    }
}
