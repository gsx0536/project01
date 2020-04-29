package com.tieda.alarm.entity.SkywinStatistics;

import java.util.ArrayList;
import java.util.List;

/***
 * 天窗日统计实体对象
 */
public class SkywinDayStat {
    private String orgName;//部门名称
    private String unit;//部门编号
    private int sgPlanCou;
    private int sgPlanCash;
    private String sgPlanCashRate;
    private int sgTime;
    private int sgTimeCash;
    private String sgTimeCashRate;
    private int wxPlanCou;
    private int wxPlanCash;
    private String wxPlanCashRate;
    private int wxTime;
    private int wxTimeCash;
    private String wxTimeCashRate;
    private int dwTodayCou;
    private int dwTommrowCou;
    private int dwCou;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getSgPlanCou() {
        return sgPlanCou;
    }

    public void setSgPlanCou(int sgPlanCou) {
        this.sgPlanCou = sgPlanCou;
    }

    public int getSgPlanCash() {
        return sgPlanCash;
    }

    public void setSgPlanCash(int sgPlanCash) {
        this.sgPlanCash = sgPlanCash;
    }

    public String getSgPlanCashRate() {
        return sgPlanCashRate;
    }

    public void setSgPlanCashRate(String sgPlanCashRate) {
        this.sgPlanCashRate = sgPlanCashRate;
    }

    public int getSgTime() {
        return sgTime;
    }

    public void setSgTime(int sgTime) {
        this.sgTime = sgTime;
    }

    public int getSgTimeCash() {
        return sgTimeCash;
    }

    public void setSgTimeCash(int sgTimeCash) {
        this.sgTimeCash = sgTimeCash;
    }

    public String getSgTimeCashRate() {
        return sgTimeCashRate;
    }

    public void setSgTimeCashRate(String sgTimeCashRate) {
        this.sgTimeCashRate = sgTimeCashRate;
    }

    public int getWxPlanCou() {
        return wxPlanCou;
    }

    public void setWxPlanCou(int wxPlanCou) {
        this.wxPlanCou = wxPlanCou;
    }

    public int getWxPlanCash() {
        return wxPlanCash;
    }

    public void setWxPlanCash(int wxPlanCash) {
        this.wxPlanCash = wxPlanCash;
    }

    public String getWxPlanCashRate() {
        return wxPlanCashRate;
    }

    public void setWxPlanCashRate(String wxPlanCashRate) {
        this.wxPlanCashRate = wxPlanCashRate;
    }

    public int getWxTime() {
        return wxTime;
    }

    public void setWxTime(int wxTime) {
        this.wxTime = wxTime;
    }

    public int getWxTimeCash() {
        return wxTimeCash;
    }

    public void setWxTimeCash(int wxTimeCash) {
        this.wxTimeCash = wxTimeCash;
    }

    public String getWxTimeCashRate() {
        return wxTimeCashRate;
    }

    public void setWxTimeCashRate(String wxTimeCashRate) {
        this.wxTimeCashRate = wxTimeCashRate;
    }

    public int getDwTodayCou() {
        return dwTodayCou;
    }

    public void setDwTodayCou(int dwTodayCou) {
        this.dwTodayCou = dwTodayCou;
    }

    public int getDwTommrowCou() {
        return dwTommrowCou;
    }

    public void setDwTommrowCou(int dwTommrowCou) {
        this.dwTommrowCou = dwTommrowCou;
    }

    public int getDwCou() {
        return dwCou;
    }

    public void setDwCou(int dwCou) {
        this.dwCou = dwCou;
    }
}
