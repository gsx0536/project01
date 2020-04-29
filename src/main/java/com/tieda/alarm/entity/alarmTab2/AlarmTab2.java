package com.tieda.alarm.entity.alarmTab2;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author
 * @since 2019-05-23
 */
@TableName("ALARM_TAB2" )
public class AlarmTab2 implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("Y_DAY" )
    private Long yDay;
    @TableField("U_TIME" )
    private Long uTime;
    @TableField("DBM" )
    private String dbm;
    @TableField("ALARMLEVEL" )
    private Long alarmlevel;
    @TableField("ALARMTYPE" )
    private String alarmtype;
    @TableField("EX_TYPE" )
    private Long exType;
    @TableField("DEV_TYPE" )
    private String devType;
    @TableField("DEV_NO" )
    private Long devNo;
    @TableField("STATUE" )
    private Long statue;
    @TableField("TC_FLAG" )
    private Long tcFlag;
    @TableField("E_TIME" )
    private Long eTime;
    @TableField("D_TIME" )
    private Long dTime;
    @TableField("DEVNAME" )
    private String devname;
    @TableField("ALARMTEXT" )
    private String alarmtext;
    @TableField("CONFIRMNAME" )
    private String confirmname;
    @TableField("CONFIRMTIME" )
    private Long confirmtime;
    @TableField("CONFIRMTEXT" )
    private String confirmtext;
    @TableField("ALARMCODE" )
    private String alarmcode;
    @TableField("ALARMSOURCEFLAG" )
    private Long alarmsourceflag;
    @TableField("ALARMFROMTABLE" )
    private String alarmfromtable;
    @TableField("EXPERT_REL_LIST" )
    private String expertRelList;
    @TableField("EQUIPMENTTYPECODE" )
    private String equipmenttypecode;
    @TableField("EQUIPMENTSUBID" )
    private String equipmentsubid;
    @TableField("ALARMID" )
    private String alarmid;
    @TableField("ALARMSUBID" )
    private String alarmsubid;
    @TableField("REASON" )
    private String reason;
    @TableField("ALARMDESCRIPTION" )
    private String alarmdescription;
    @TableField("PRIORITY" )
    private String priority;
    @TableField("DIAGNOSEPATH" )
    private String diagnosepath;
    @TableField("BDISPOSE" )
    private Long bdispose;
    @TableField("ANALOGDATATRANSFER" )
    private Long analogdatatransfer;
    @TableField("POSITION" )
    private String position;
    @TableField("PROPOSE" )
    private String propose;
    @TableField("STATIONNAME" )
    private String stationname;
    @TableField("N_ID" )
    private String nId;
    /**
     * 0:未处理，1：已处理
     */
    @TableField("TYPE" )
    private String type;
    @TableField("STATIONID" )
    private String stationid;
    @TableField("score" )
    private Integer score;

    private String alarmTypeName;
    private String devTypeName;
    private String czjy;
    private String workshop;
    private String workarea;
    private Long beginTime;
    private Long endTime;


    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
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

    public String getAlarmTypeName() {
        return alarmTypeName;
    }

    public void setAlarmTypeName(String alarmTypeName) {
        this.alarmTypeName = alarmTypeName;
    }

    public String getDevTypeName() {
        return devTypeName;
    }

    public void setDevTypeName(String devTypeName) {
        this.devTypeName = devTypeName;
    }

    public String getCzjy() {
        return czjy;
    }

    public void setCzjy(String czjy) {
        this.czjy = czjy;
    }

    public Long getyDay() {
        return yDay;
    }

    public void setyDay(Long yDay) {
        this.yDay = yDay;
    }

    public Long getuTime() {
        return uTime;
    }

    public void setuTime(Long uTime) {
        this.uTime = uTime;
    }

    public String getDbm() {
        return dbm;
    }

    public void setDbm(String dbm) {
        this.dbm = dbm;
    }

    public Long getAlarmlevel() {
        return alarmlevel;
    }

    public void setAlarmlevel(Long alarmlevel) {
        this.alarmlevel = alarmlevel;
    }

    public String getAlarmtype() {
        return alarmtype;
    }

    public void setAlarmtype(String alarmtype) {
        this.alarmtype = alarmtype;
    }

    public Long getExType() {
        return exType;
    }

    public void setExType(Long exType) {
        this.exType = exType;
    }

    public String getDevType() {
        return devType;
    }

    public void setDevType(String devType) {
        this.devType = devType;
    }

    public Long getDevNo() {
        return devNo;
    }

    public void setDevNo(Long devNo) {
        this.devNo = devNo;
    }

    public Long getStatue() {
        return statue;
    }

    public void setStatue(Long statue) {
        this.statue = statue;
    }

    public Long getTcFlag() {
        return tcFlag;
    }

    public void setTcFlag(Long tcFlag) {
        this.tcFlag = tcFlag;
    }

    public Long geteTime() {
        return eTime;
    }

    public void seteTime(Long eTime) {
        this.eTime = eTime;
    }

    public Long getdTime() {
        return dTime;
    }

    public void setdTime(Long dTime) {
        this.dTime = dTime;
    }

    public String getDevname() {
        return devname;
    }

    public void setDevname(String devname) {
        this.devname = devname;
    }

    public String getAlarmtext() {
        return alarmtext;
    }

    public void setAlarmtext(String alarmtext) {
        this.alarmtext = alarmtext;
    }

    public String getConfirmname() {
        return confirmname;
    }

    public void setConfirmname(String confirmname) {
        this.confirmname = confirmname;
    }

    public Long getConfirmtime() {
        return confirmtime;
    }

    public void setConfirmtime(Long confirmtime) {
        this.confirmtime = confirmtime;
    }

    public String getConfirmtext() {
        return confirmtext;
    }

    public void setConfirmtext(String confirmtext) {
        this.confirmtext = confirmtext;
    }

    public String getAlarmcode() {
        return alarmcode;
    }

    public void setAlarmcode(String alarmcode) {
        this.alarmcode = alarmcode;
    }

    public Long getAlarmsourceflag() {
        return alarmsourceflag;
    }

    public void setAlarmsourceflag(Long alarmsourceflag) {
        this.alarmsourceflag = alarmsourceflag;
    }

    public String getAlarmfromtable() {
        return alarmfromtable;
    }

    public void setAlarmfromtable(String alarmfromtable) {
        this.alarmfromtable = alarmfromtable;
    }

    public String getExpertRelList() {
        return expertRelList;
    }

    public void setExpertRelList(String expertRelList) {
        this.expertRelList = expertRelList;
    }

    public String getEquipmenttypecode() {
        return equipmenttypecode;
    }

    public void setEquipmenttypecode(String equipmenttypecode) {
        this.equipmenttypecode = equipmenttypecode;
    }

    public String getEquipmentsubid() {
        return equipmentsubid;
    }

    public void setEquipmentsubid(String equipmentsubid) {
        this.equipmentsubid = equipmentsubid;
    }

    public String getAlarmid() {
        return alarmid;
    }

    public void setAlarmid(String alarmid) {
        this.alarmid = alarmid;
    }

    public String getAlarmsubid() {
        return alarmsubid;
    }

    public void setAlarmsubid(String alarmsubid) {
        this.alarmsubid = alarmsubid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getAlarmdescription() {
        return alarmdescription;
    }

    public void setAlarmdescription(String alarmdescription) {
        this.alarmdescription = alarmdescription;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDiagnosepath() {
        return diagnosepath;
    }

    public void setDiagnosepath(String diagnosepath) {
        this.diagnosepath = diagnosepath;
    }

    public Long getBdispose() {
        return bdispose;
    }

    public void setBdispose(Long bdispose) {
        this.bdispose = bdispose;
    }

    public Long getAnalogdatatransfer() {
        return analogdatatransfer;
    }

    public void setAnalogdatatransfer(Long analogdatatransfer) {
        this.analogdatatransfer = analogdatatransfer;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPropose() {
        return propose;
    }

    public void setPropose(String propose) {
        this.propose = propose;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
    }

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStationid() {
        return stationid;
    }

    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    @Override
    public String toString() {
        return "AlarmTab2{" +
                "yDay=" + yDay +
                ", uTime=" + uTime +
                ", dbm=" + dbm +
                ", alarmlevel=" + alarmlevel +
                ", alarmtype=" + alarmtype +
                ", exType=" + exType +
                ", devType=" + devType +
                ", devNo=" + devNo +
                ", statue=" + statue +
                ", tcFlag=" + tcFlag +
                ", eTime=" + eTime +
                ", dTime=" + dTime +
                ", devname=" + devname +
                ", alarmtext=" + alarmtext +
                ", confirmname=" + confirmname +
                ", confirmtime=" + confirmtime +
                ", confirmtext=" + confirmtext +
                ", alarmcode=" + alarmcode +
                ", alarmsourceflag=" + alarmsourceflag +
                ", alarmfromtable=" + alarmfromtable +
                ", expertRelList=" + expertRelList +
                ", equipmenttypecode=" + equipmenttypecode +
                ", equipmentsubid=" + equipmentsubid +
                ", alarmid=" + alarmid +
                ", alarmsubid=" + alarmsubid +
                ", reason=" + reason +
                ", alarmdescription=" + alarmdescription +
                ", priority=" + priority +
                ", diagnosepath=" + diagnosepath +
                ", bdispose=" + bdispose +
                ", analogdatatransfer=" + analogdatatransfer +
                ", position=" + position +
                ", propose=" + propose +
                ", stationname=" + stationname +
                ", nId=" + nId +
                ", type=" + type +
                ", stationid=" + stationid +
                "}";
    }
}
