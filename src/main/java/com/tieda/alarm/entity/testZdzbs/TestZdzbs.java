package com.tieda.alarm.entity.testZdzbs;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2019-10-18
 */
@TableName("TEST_ZDZBS")
public class TestZdzbs implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    /**
     * 闭塞类型
     */
    @TableField("BSLX")
    private String bslx;
    /**
     * 接、发车站正常办理及各种表示显示正确
     */
    @TableField("JFCZCBS")
    private String jfczcbs;
    /**
     * 未办妥闭塞，办理发车进路时，进路能锁闭但信号不能开放
     */
    @TableField("WBTSFCJL")
    private String wbtsfcjl;
    /**
     * 发车站闭塞区段轨道电路故障，闭塞不能办理
     */
    @TableField("FCBSDDGZ")
    private String fcbsddgz;
    /**
     * 发车信号开放后，发车站轨道电路故障，发车信号立即关闭，接车站接车表示灯和发车站发车表示灯亮红灯，故障恢复时，闭塞应不能自动复原，须由发车站经人工办理事故复原
     */
    @TableField("FCXHGB")
    private String fcxhgb;
    /**
     * 发车站列车出发后，接车站闭塞轨道电路故障，闭塞不能自动复原，需由接车站办理事故复原
     */
    @TableField("JCZBSGDLZ")
    private String jczbsgdlz;
    /**
     * 引导接车时，需由接车站采用事故复原办法办理复原
     */
    @TableField("SGFYBS")
    private String sgfybs;
    /**
     * 发车站办理取消时，应先取消发车进路再办理取消闭塞手续
     */
    @TableField("QXFCJL")
    private String qxfcjl;
    /**
     * 办理闭塞并在列车出发后，接车站在列车未到达时不能办理闭塞复原
     */
    @TableField("LCWDD")
    private String lcwdd;
    /**
     * 办理闭塞后，如未办理发车进路，发车站可利用发车闭塞轨道电路进行调车
     */
    @TableField("BSGDDLDC")
    private String bsgddldc;
    /**
     * 闭塞办理完毕，接车站不允许向同一区间开放出站信号
     */
    @TableField("BKFXH")
    private String bkfxh;
    /**
     * 备注
     */
    @TableField("NOTE")
    private String note;
    /**
     * 试验人员
     */
    @TableField("OPERATOR")
    private String operator;
    /**
     * 联锁主任
     */
    @TableField("DIRECTOR")
    private String director;
    /**
     * 设计表ID
     */
    @TableField("DESIGNID")
    private String designid;
    /**
     * 时间
     */
    @TableField("CREATEDATE")
    private Date createdate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBslx() {
        return bslx;
    }

    public void setBslx(String bslx) {
        this.bslx = bslx;
    }

    public String getJfczcbs() {
        return jfczcbs;
    }

    public void setJfczcbs(String jfczcbs) {
        this.jfczcbs = jfczcbs;
    }

    public String getWbtsfcjl() {
        return wbtsfcjl;
    }

    public void setWbtsfcjl(String wbtsfcjl) {
        this.wbtsfcjl = wbtsfcjl;
    }

    public String getFcbsddgz() {
        return fcbsddgz;
    }

    public void setFcbsddgz(String fcbsddgz) {
        this.fcbsddgz = fcbsddgz;
    }

    public String getFcxhgb() {
        return fcxhgb;
    }

    public void setFcxhgb(String fcxhgb) {
        this.fcxhgb = fcxhgb;
    }

    public String getJczbsgdlz() {
        return jczbsgdlz;
    }

    public void setJczbsgdlz(String jczbsgdlz) {
        this.jczbsgdlz = jczbsgdlz;
    }

    public String getSgfybs() {
        return sgfybs;
    }

    public void setSgfybs(String sgfybs) {
        this.sgfybs = sgfybs;
    }

    public String getQxfcjl() {
        return qxfcjl;
    }

    public void setQxfcjl(String qxfcjl) {
        this.qxfcjl = qxfcjl;
    }

    public String getLcwdd() {
        return lcwdd;
    }

    public void setLcwdd(String lcwdd) {
        this.lcwdd = lcwdd;
    }

    public String getBsgddldc() {
        return bsgddldc;
    }

    public void setBsgddldc(String bsgddldc) {
        this.bsgddldc = bsgddldc;
    }

    public String getBkfxh() {
        return bkfxh;
    }

    public void setBkfxh(String bkfxh) {
        this.bkfxh = bkfxh;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDesignid() {
        return designid;
    }

    public void setDesignid(String designid) {
        this.designid = designid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "TestZdzbs{" +
        "id=" + id +
        ", bslx=" + bslx +
        ", jfczcbs=" + jfczcbs +
        ", wbtsfcjl=" + wbtsfcjl +
        ", fcbsddgz=" + fcbsddgz +
        ", fcxhgb=" + fcxhgb +
        ", jczbsgdlz=" + jczbsgdlz +
        ", sgfybs=" + sgfybs +
        ", qxfcjl=" + qxfcjl +
        ", lcwdd=" + lcwdd +
        ", bsgddldc=" + bsgddldc +
        ", bkfxh=" + bkfxh +
        ", note=" + note +
        ", operator=" + operator +
        ", director=" + director +
        ", designid=" + designid +
        ", createdate=" + createdate +
        "}";
    }
}
