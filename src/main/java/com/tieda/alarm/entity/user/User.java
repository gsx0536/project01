package com.tieda.alarm.entity.user;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: �Ϻ��������</p>
 *
 * @author fmzhang
 * @version 1.0
 */
public class User implements Serializable {


    /**
     * ���û�����session�������
     */
    public static final String USER_SESSION_NAME = "CURRENT_USER";

    public static final String SERVER_ID="KMBUR_KMNSEG";

    /**
     * ȱʡ���û�����
     */
    public static final String DEFAULT_PASSWORD = "123456";

    private String vcServer;

    private String vcOrgId;

    private String vcNumber;

    private String vcName;

    private String vcOtherPerson;

    private String vcGkeId;

    private boolean admin;

    private String vcOrgName;

    private String pageSize;

    private String orgLevel;

    private String vcParOrgId;

    private String showInfo;

    private String pwd;

    private String vcWorkPos;

    public String getVcWorkPos() {
        return vcWorkPos;
    }

    public void setVcWorkPos(String vcWorkPos) {
        this.vcWorkPos = vcWorkPos;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public User() {
    }

    public String getVcServer() {
        return vcServer;
    }

    public void setVcServer(String vcServer) {
        this.vcServer = vcServer;
    }

    public static User getCurrUser(HttpServletRequest request) {
        return (User) request.getSession().getAttribute(USER_SESSION_NAME);
    }

    public void setVcOrgId(String vcOrgId) {
        this.vcOrgId = vcOrgId;
    }

    public void setVcNumber(String vcNumber) {
        this.vcNumber = vcNumber;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName;
    }

    public void setVcGkeId(String vcGkeId) {
        this.vcGkeId = vcGkeId;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void setVcOrgName(String vcOrgName) {
        this.vcOrgName = vcOrgName;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public void setOrgLevel(String orgLevel) {
        this.orgLevel = orgLevel;
    }

    public void setVcParOrgId(String vcParOrgId) {
        this.vcParOrgId = vcParOrgId;
    }

    public String getVcOrgId() {
        return vcOrgId;
    }

    public String getVcNumber() {
        return vcNumber;
    }

    public String getVcName() {
        return vcName;
    }

    public String getVcGkeId() {
        return vcGkeId;
    }

    public boolean isAdmin() {
        return admin;
    }

    public String getVcOrgName() {
        return vcOrgName;
    }

    public String getPageSize() {
        return pageSize;
    }

    public String getOrgLevel() {
        return orgLevel;
    }

    public String getVcParOrgId() {
        return vcParOrgId;
    }

    public String getVcOtherPerson() {
        return vcOtherPerson;
    }

    public void setVcOtherPerson(String vcOtherPerson) {
        this.vcOtherPerson = vcOtherPerson;
    }

    public String getShowInfo() {
        if (admin) {
            return this.vcName;
        } else {
            return this.vcOrgName + "&nbsp;&nbsp;&nbsp;" + this.vcName;
        }
    }

    public String toString() {
        return this.vcName;
    }

}
