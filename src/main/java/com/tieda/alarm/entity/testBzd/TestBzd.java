package com.tieda.alarm.entity.testBzd;

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
@TableName("TEST_BZD")
public class TestBzd implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    /**
     * 闭塞类型
     */
    @TableField("BSLX")
    private String bslx;
    /**
     * 正常办理办理发车
     */
    @TableField("ZC_BSFC")
    private String zcBsfc;
    /**
     * 正常办理同意发车
     */
    @TableField("ZC_TYFC")
    private String zcTyfc;
    /**
     * 正常办理列车出发
     */
    @TableField("ZC_LCFC")
    private String zcLcfc;
    /**
     * 正常办理列车在区间运行
     */
    @TableField("ZC_LCYX")
    private String zcLcyx;
    /**
     * 正常办理列车到达
     */
    @TableField("ZC_LCDD")
    private String zcLcdd;
    /**
     * 取消复原办理发车站取得发车权，一度停电恢复
     */
    @TableField("QXFY")
    private String qxfy;
    /**
     * 故障复原办理发车站取得发车权，一度停电恢复
     */
    @TableField("GZFY_FCQ")
    private String gzfyFcq;
    /**
     * 故障复原办理区间空闲，一站一度停电恢复
     */
    @TableField("GZFY_YZYD")
    private String gzfyYzyd;
    /**
     * 故障复原办理区间空闲，两站一度停电恢复
     */
    @TableField("GZFY_LZYD")
    private String gzfyLzyd;
    /**
     * 故障复原办理停电后恢复供电时，甲乙两站在人工复原前不能办理发车进路
     */
    @TableField("GZFY_BBSLFCJL")
    private String gzfyBbslfcjl;
    /**
     * 接、发车站正常办理及各种表示显示正确
     */
    @TableField("JFCZCBL")
    private String jfczcbl;
    /**
     * 未办妥闭塞，办理发车进路时，进路能锁闭但信号不能开放
     */
    @TableField("WBTBS")
    private String wbtbs;
    /**
     * 发车站闭塞区段轨道电路故障闭塞不能办理
     */
    @TableField("GDDLGZ")
    private String gddlgz;
    /**
     * 发车信号开放后，发车站轨道电路故障，接车站接车表示灯和发车站发车表示灯亮红灯，故障恢复时，闭塞应不能自动复原，须由发车站办理事故复原
     */
    @TableField("BSBZDFY")
    private String bsbzdfy;
    /**
     * 发车站列车出发后，接车站闭塞轨道电路故障，闭塞不能自动复原，需由接车站办理事故复原
     */
    @TableField("JCZBLFY")
    private String jczblfy;
    /**
     * 发车站办理取消时，应先取消发车进路再办理取消闭塞手续
     */
    @TableField("QXBS")
    private String qxbs;
    /**
     * 办理闭塞并在列车出发后，接车站在列车未到达时不能办理闭塞复原
     */
    @TableField("WDDBBLBS")
    private String wddbblbs;
    /**
     * 闭塞办理完毕，车站不允许向同一区间开放出站信号
     */
    @TableField("BFCZXH")
    private String bfczxh;
    /**
     * 邻站发车有”邻站开出“的语音提示或响铃正确
     */
    @TableField("TSZQ")
    private String tszq;
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
    /**
     * 引导接车时，需由接车站采用事故复原办法办理复原
     */
    @TableField("YDJC")
    private String ydjc;
    /**
     * 办理闭塞后，如未办理发车进路，发车站可利用发车闭塞轨道电路进行调车
     */
    @TableField("GDDLTC")
    private String gddltc;


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

    public String getZcBsfc() {
        return zcBsfc;
    }

    public void setZcBsfc(String zcBsfc) {
        this.zcBsfc = zcBsfc;
    }

    public String getZcTyfc() {
        return zcTyfc;
    }

    public void setZcTyfc(String zcTyfc) {
        this.zcTyfc = zcTyfc;
    }

    public String getZcLcfc() {
        return zcLcfc;
    }

    public void setZcLcfc(String zcLcfc) {
        this.zcLcfc = zcLcfc;
    }

    public String getZcLcyx() {
        return zcLcyx;
    }

    public void setZcLcyx(String zcLcyx) {
        this.zcLcyx = zcLcyx;
    }

    public String getZcLcdd() {
        return zcLcdd;
    }

    public void setZcLcdd(String zcLcdd) {
        this.zcLcdd = zcLcdd;
    }

    public String getQxfy() {
        return qxfy;
    }

    public void setQxfy(String qxfy) {
        this.qxfy = qxfy;
    }

    public String getGzfyFcq() {
        return gzfyFcq;
    }

    public void setGzfyFcq(String gzfyFcq) {
        this.gzfyFcq = gzfyFcq;
    }

    public String getGzfyYzyd() {
        return gzfyYzyd;
    }

    public void setGzfyYzyd(String gzfyYzyd) {
        this.gzfyYzyd = gzfyYzyd;
    }

    public String getGzfyLzyd() {
        return gzfyLzyd;
    }

    public void setGzfyLzyd(String gzfyLzyd) {
        this.gzfyLzyd = gzfyLzyd;
    }

    public String getGzfyBbslfcjl() {
        return gzfyBbslfcjl;
    }

    public void setGzfyBbslfcjl(String gzfyBbslfcjl) {
        this.gzfyBbslfcjl = gzfyBbslfcjl;
    }

    public String getJfczcbl() {
        return jfczcbl;
    }

    public void setJfczcbl(String jfczcbl) {
        this.jfczcbl = jfczcbl;
    }

    public String getWbtbs() {
        return wbtbs;
    }

    public void setWbtbs(String wbtbs) {
        this.wbtbs = wbtbs;
    }

    public String getGddlgz() {
        return gddlgz;
    }

    public void setGddlgz(String gddlgz) {
        this.gddlgz = gddlgz;
    }

    public String getBsbzdfy() {
        return bsbzdfy;
    }

    public void setBsbzdfy(String bsbzdfy) {
        this.bsbzdfy = bsbzdfy;
    }

    public String getJczblfy() {
        return jczblfy;
    }

    public void setJczblfy(String jczblfy) {
        this.jczblfy = jczblfy;
    }

    public String getQxbs() {
        return qxbs;
    }

    public void setQxbs(String qxbs) {
        this.qxbs = qxbs;
    }

    public String getWddbblbs() {
        return wddbblbs;
    }

    public void setWddbblbs(String wddbblbs) {
        this.wddbblbs = wddbblbs;
    }

    public String getBfczxh() {
        return bfczxh;
    }

    public void setBfczxh(String bfczxh) {
        this.bfczxh = bfczxh;
    }

    public String getTszq() {
        return tszq;
    }

    public void setTszq(String tszq) {
        this.tszq = tszq;
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

    public String getYdjc() {
        return ydjc;
    }

    public void setYdjc(String ydjc) {
        this.ydjc = ydjc;
    }

    public String getGddltc() {
        return gddltc;
    }

    public void setGddltc(String gddltc) {
        this.gddltc = gddltc;
    }

    @Override
    public String toString() {
        return "TestBzd{" +
        "id=" + id +
        ", bslx=" + bslx +
        ", zcBsfc=" + zcBsfc +
        ", zcTyfc=" + zcTyfc +
        ", zcLcfc=" + zcLcfc +
        ", zcLcyx=" + zcLcyx +
        ", zcLcdd=" + zcLcdd +
        ", qxfy=" + qxfy +
        ", gzfyFcq=" + gzfyFcq +
        ", gzfyYzyd=" + gzfyYzyd +
        ", gzfyLzyd=" + gzfyLzyd +
        ", gzfyBbslfcjl=" + gzfyBbslfcjl +
        ", jfczcbl=" + jfczcbl +
        ", wbtbs=" + wbtbs +
        ", gddlgz=" + gddlgz +
        ", bsbzdfy=" + bsbzdfy +
        ", jczblfy=" + jczblfy +
        ", qxbs=" + qxbs +
        ", wddbblbs=" + wddbblbs +
        ", bfczxh=" + bfczxh +
        ", tszq=" + tszq +
        ", note=" + note +
        ", operator=" + operator +
        ", director=" + director +
        ", designid=" + designid +
        ", createdate=" + createdate +
        ", ydjc=" + ydjc +
        ", gddltc=" + gddltc +
        "}";
    }
}
