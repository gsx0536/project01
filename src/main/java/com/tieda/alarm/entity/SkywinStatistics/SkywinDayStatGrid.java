package com.tieda.alarm.entity.SkywinStatistics;

public class SkywinDayStatGrid {
    private String vcType;//作业类型
    private String dtWorkday;//作业日期 - 点外
    private String vcProject;//作业项目 - 点外
    private String vcLevel;//作业级别
    private String vcWorkplace;//作业地点 - 点外
    private String vcSkywinstime;//作业开始时间 - 点外
    private String vcSkywinetime;//作业结束时间 - 点外
    private String vcSgroute;//作业线路
    private String vcWaperson;//作业负责人 - 点外
    private String vcSgdirectoryname;//作业行别
    //点外计划
    private String code;//命令号 - 点外
    private String workOrg;//部门 - 点外

    public String getVcType() {
        return vcType;
    }

    public void setVcType(String vcType) {
        this.vcType = vcType;
    }

    public String getDtWorkday() {
        return dtWorkday;
    }

    public void setDtWorkday(String dtWorkday) {
        this.dtWorkday = dtWorkday;
    }

    public String getVcProject() {
        return vcProject;
    }

    public void setVcProject(String vcProject) {
        this.vcProject = vcProject;
    }

    public String getVcLevel() {
        return vcLevel;
    }

    public void setVcLevel(String vcLevel) {
        this.vcLevel = vcLevel;
    }

    public String getVcWorkplace() {
        return vcWorkplace;
    }

    public void setVcWorkplace(String vcWorkplace) {
        this.vcWorkplace = vcWorkplace;
    }

    public String getVcSkywinstime() {
        return vcSkywinstime;
    }

    public void setVcSkywinstime(String vcSkywinstime) {
        this.vcSkywinstime = vcSkywinstime;
    }

    public String getVcSkywinetime() {
        return vcSkywinetime;
    }

    public void setVcSkywinetime(String vcSkywinetime) {
        this.vcSkywinetime = vcSkywinetime;
    }

    public String getVcSgroute() {
        return vcSgroute;
    }

    public void setVcSgroute(String vcSgroute) {
        this.vcSgroute = vcSgroute;
    }

    public String getVcWaperson() {
        return vcWaperson;
    }

    public void setVcWaperson(String vcWaperson) {
        this.vcWaperson = vcWaperson;
    }

    public String getVcSgdirectoryname() {
        return vcSgdirectoryname;
    }

    public void setVcSgdirectoryname(String vcSgdirectoryname) {
        this.vcSgdirectoryname = vcSgdirectoryname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWorkOrg() {
        return workOrg;
    }

    public void setWorkOrg(String workOrg) {
        this.workOrg = workOrg;
    }
}
