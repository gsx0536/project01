package com.tieda.alarm.entity.jzjcProblem;

public class TreeEntity {

    private String id;
    private String text;
    private String pid;
    private String norder;
    private String nlevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getOrder() {
        return norder;
    }

    public void setOrder(String norder) {
        this.norder = norder;
    }

    public String getNlevel() {
        return nlevel;
    }

    public void setNlevel(String nlevel) {
        this.nlevel = nlevel;
    }
}
