package com.tieda.alarm.entity.SkywinStatistics;

/***
 * 天窗月统计查询对象
 */
public class SkywinMonthStat {

    private String skywinType;//天窗类型
    private String orgName;//电务段名称
    private String line;//线别

    private String applyCount;//申请个数
    private String applyInplanCount;//列入计划个数
    private String applyCountRate;//列入计划率

    private String applyTime;//申请时间
    private String applyInplanTime;//列入计划时间
    private String applyTimeRate;//列入计划时间率


    private String planCount;//计划数
    private String planCash;//计划兑现数
    private String planCashRate;//计划兑现率

    private String planTime;//计划时间
    private String planCashTime;//计划兑现时间
    private String planCashTimeRate;//计划兑现时间率
    private String reason;//天窗兑现情况及未完成原因分析

    public String getSkywinType() {
        return skywinType;
    }

    public void setSkywinType(String skywinType) {
        this.skywinType = skywinType;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getApplyCount() {
        return applyCount;
    }

    public void setApplyCount(String applyCount) {
        this.applyCount = applyCount;
    }

    public String getApplyInplanCount() {
        return applyInplanCount;
    }

    public void setApplyInplanCount(String applyInplanCount) {
        this.applyInplanCount = applyInplanCount;
    }

    public String getApplyCountRate() {
        return applyCountRate;
    }

    public void setApplyCountRate(String applyCountRate) {
        this.applyCountRate = applyCountRate;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getApplyInplanTime() {
        return applyInplanTime;
    }

    public void setApplyInplanTime(String applyInplanTime) {
        this.applyInplanTime = applyInplanTime;
    }

    public String getApplyTimeRate() {
        return applyTimeRate;
    }

    public void setApplyTimeRate(String applyTimeRate) {
        this.applyTimeRate = applyTimeRate;
    }

    public String getPlanCount() {
        return planCount;
    }

    public void setPlanCount(String planCount) {
        this.planCount = planCount;
    }

    public String getPlanCash() {
        return planCash;
    }

    public void setPlanCash(String planCash) {
        this.planCash = planCash;
    }

    public String getPlanCashRate() {
        return planCashRate;
    }

    public void setPlanCashRate(String planCashRate) {
        this.planCashRate = planCashRate;
    }

    public String getPlanTime() {
        return planTime;
    }

    public void setPlanTime(String planTime) {
        this.planTime = planTime;
    }

    public String getPlanCashTime() {
        return planCashTime;
    }

    public void setPlanCashTime(String planCashTime) {
        this.planCashTime = planCashTime;
    }

    public String getPlanCashTimeRate() {
        return planCashTimeRate;
    }

    public void setPlanCashTimeRate(String planCashTimeRate) {
        this.planCashTimeRate = planCashTimeRate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "SkywinMonthStat{" +
                "skywinType='" + skywinType + '\'' +
                ", orgName='" + orgName + '\'' +
                ", applyCount='" + applyCount + '\'' +
                ", applyInplanCount='" + applyInplanCount + '\'' +
                ", applyCountRate='" + applyCountRate + '\'' +
                ", applyTime='" + applyTime + '\'' +
                ", applyInplanTime='" + applyInplanTime + '\'' +
                ", applyTimeRate='" + applyTimeRate + '\'' +
                ", planCount='" + planCount + '\'' +
                ", planCash='" + planCash + '\'' +
                ", planCashRate='" + planCashRate + '\'' +
                ", planTime='" + planTime + '\'' +
                ", planCashTime='" + planCashTime + '\'' +
                ", planCashTimeRate='" + planCashTimeRate + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
