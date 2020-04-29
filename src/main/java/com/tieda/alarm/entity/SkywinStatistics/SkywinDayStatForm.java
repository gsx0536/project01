package com.tieda.alarm.entity.SkywinStatistics;

import java.util.ArrayList;
import java.util.List;

/***
 * 天窗日统计实体对象
 */
public class SkywinDayStatForm {
    private String givePointInfos;
    private String noCashInfos;
    private String thirtyInfos;

    private String station;
    private String workLevel;
    private int nums;

    public String getGivePointInfos() {
        return givePointInfos;
    }

    public void setGivePointInfos(String givePointInfos) {
        this.givePointInfos = givePointInfos;
    }

    public String getNoCashInfos() {
        return noCashInfos;
    }

    public void setNoCashInfos(String noCashInfos) {
        this.noCashInfos = noCashInfos;
    }

    public String getThirtyInfos() {
        return thirtyInfos;
    }

    public void setThirtyInfos(String thirtyInfos) {
        this.thirtyInfos = thirtyInfos;
    }

    public String getStatoin() {
        return station;
    }

    public void setStatoin(String station) {
        this.station = station;
    }

    public String getWorkLevel() {
        return workLevel;
    }

    public void setWorkLevel(String workLevel) {
        this.workLevel = workLevel;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }
}
