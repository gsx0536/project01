package com.tieda.alarm.entity.SkywinStatistics;

/***
 * 天窗日统计查询对象
 */
public class SkywinDayStatSearch {
    private String unit;//单位编号（'电务段编号','车间编号','工区编号','车站编号'）
    private String unitType;//单位类型
    private String workshop;//车间
    private String workshopName;//车间
    private String workarea;//工区
    private String workareaName;//工区
    private String station;//车站
    private String stationName;//车站
    private String workdateStart;//起始时间
    private String workdateEnd;//截止时间
    private String detailType;//明细内容查看类型 施工计划项数A  施工兑现项数B  维修计划项数C  维修兑现项数D 点外今天E 点外明天F 点外总数G

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

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getWorkdateStart() {
        return workdateStart;
    }

    public void setWorkdateStart(String workdateStart) {
        this.workdateStart = workdateStart;
    }

    public String getWorkdateEnd() {
        return workdateEnd;
    }

    public void setWorkdateEnd(String workdateEnd) {
        this.workdateEnd = workdateEnd;
    }

    public String getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getWorkareaName() {
        return workareaName;
    }

    public void setWorkareaName(String workareaName) {
        this.workareaName = workareaName;
    }

    public String getDetailType() {
        return detailType;
    }

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    @Override
    public String toString() {
        return "SkywinDayStatSearch{" +
                "workshop='" + workshop + '\'' +
                ", workarea='" + workarea + '\'' +
                ", station='" + station + '\'' +
                ", workdateStart='" + workdateStart + '\'' +
                ", workdateEnd='" + workdateEnd + '\'' +
                '}';
    }
}
