package com.tieda.alarm.entity.testLiansuodl;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2019-10-16
 */
@TableName("TEST_LIANSUODL")
public class TestLiansuodl implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    /**
     * 进路号码
     */
    @TableField("JLHM")
    private String jlhm;
    /**
     * 进路始端
     */
    @TableField("JLSD")
    private String jlsd;
    /**
     * 进路变通
     */
    @TableField("JLBT")
    private String jlbt;
    /**
     * 进路终端
     */
    @TableField("JLZD")
    private String jlzd;
    /**
     * 点灯状态下办理正反向发车进路（含引导）检查区间所有区段空闲
     */
    @TableField("DTZFFC")
    private String dtzffc;
    /**
     * 点灯状态下办理正反向发车进路（含引导）检查区间所有区段空闲
     */
    @TableField("MTFX")
    private String mtfx;
    /**
     * 灭灯状态下办理正向引导发车进路不检查区间一离去条件
     */
    @TableField("MTZX")
    private String mtzx;
    /**
     * 引导总锁时不能开放引导信号
     */
    @TableField("ZSBKF")
    private String zsbkf;
    /**
     * 停稳计时（40秒）
     */
    @TableField("TWJS")
    private String twjs;
    /**
     * 站间闭塞状态下办理发车进路连续检查区间空闲13秒
     */
    @TableField("ZJBSFC")
    private String zjbsfc;
    /**
     * 未办理进路能改变点灯状态
     */
    @TableField("WBLJL")
    private String wbljl;
    /**
     * 进路办理好后不能改变相应信号机的点灯状态
     */
    @TableField("JLBLBGB")
    private String jlblbgb;
    /**
     * 点灯状态进路正常解锁时红灯灭、留时机
     */
    @TableField("DTXGJCD")
    private String dtxgjcd;
    /**
     * 点灯状态向股道接车（含引导）或调车时出站红灯应自动点亮
     */
    @TableField("DTGDJX")
    private String dtgdjx;
    /**
     * 点灯状态下进站信号机开放信号检查出站信号机红灯灯丝（不含引导及调车）
     */
    @TableField("HTTS")
    private String htts;
    /**
     * 点灯状态股道进行列车或调车折返作业时，进路解锁且股道空闲后原点亮的出站信号机应自动灭灯
     */
    @TableField("JLJS")
    private String jljs;
    /**
     * 点灯状态正线进（出）站信号机红灯灭灯时不能开放信号
     */
    @TableField("DTZXJC")
    private String dtzxjc;
    /**
     * 点灯状态时，允许灯光断丝转点禁止灯光检查
     */
    @TableField("JZDGJC")
    private String jzdgjc;
    /**
     * 临时限速降级信号显示
     */
    @TableField("LSXS")
    private String lsxs;
    /**
     * 落物试验
     */
    @TableField("LWSY")
    private String lwsy;
    /**
     * 备 注
     */
    @TableField("NOTE")
    private String note;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJlhm() {
        return jlhm;
    }

    public void setJlhm(String jlhm) {
        this.jlhm = jlhm;
    }

    public String getJlsd() {
        return jlsd;
    }

    public void setJlsd(String jlsd) {
        this.jlsd = jlsd;
    }

    public String getJlbt() {
        return jlbt;
    }

    public void setJlbt(String jlbt) {
        this.jlbt = jlbt;
    }

    public String getJlzd() {
        return jlzd;
    }

    public void setJlzd(String jlzd) {
        this.jlzd = jlzd;
    }

    public String getDtzffc() {
        return dtzffc;
    }

    public void setDtzffc(String dtzffc) {
        this.dtzffc = dtzffc;
    }

    public String getMtfx() {
        return mtfx;
    }

    public void setMtfx(String mtfx) {
        this.mtfx = mtfx;
    }

    public String getMtzx() {
        return mtzx;
    }

    public void setMtzx(String mtzx) {
        this.mtzx = mtzx;
    }

    public String getZsbkf() {
        return zsbkf;
    }

    public void setZsbkf(String zsbkf) {
        this.zsbkf = zsbkf;
    }

    public String getTwjs() {
        return twjs;
    }

    public void setTwjs(String twjs) {
        this.twjs = twjs;
    }

    public String getZjbsfc() {
        return zjbsfc;
    }

    public void setZjbsfc(String zjbsfc) {
        this.zjbsfc = zjbsfc;
    }

    public String getWbljl() {
        return wbljl;
    }

    public void setWbljl(String wbljl) {
        this.wbljl = wbljl;
    }

    public String getJlblbgb() {
        return jlblbgb;
    }

    public void setJlblbgb(String jlblbgb) {
        this.jlblbgb = jlblbgb;
    }

    public String getDtxgjcd() {
        return dtxgjcd;
    }

    public void setDtxgjcd(String dtxgjcd) {
        this.dtxgjcd = dtxgjcd;
    }

    public String getDtgdjx() {
        return dtgdjx;
    }

    public void setDtgdjx(String dtgdjx) {
        this.dtgdjx = dtgdjx;
    }

    public String getHtts() {
        return htts;
    }

    public void setHtts(String htts) {
        this.htts = htts;
    }

    public String getJljs() {
        return jljs;
    }

    public void setJljs(String jljs) {
        this.jljs = jljs;
    }

    public String getDtzxjc() {
        return dtzxjc;
    }

    public void setDtzxjc(String dtzxjc) {
        this.dtzxjc = dtzxjc;
    }

    public String getJzdgjc() {
        return jzdgjc;
    }

    public void setJzdgjc(String jzdgjc) {
        this.jzdgjc = jzdgjc;
    }

    public String getLsxs() {
        return lsxs;
    }

    public void setLsxs(String lsxs) {
        this.lsxs = lsxs;
    }

    public String getLwsy() {
        return lwsy;
    }

    public void setLwsy(String lwsy) {
        this.lwsy = lwsy;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "TestLiansuodl{" +
        "id=" + id +
        ", jlhm=" + jlhm +
        ", jlsd=" + jlsd +
        ", jlbt=" + jlbt +
        ", jlzd=" + jlzd +
        ", dtzffc=" + dtzffc +
        ", mtfx=" + mtfx +
        ", mtzx=" + mtzx +
        ", zsbkf=" + zsbkf +
        ", twjs=" + twjs +
        ", zjbsfc=" + zjbsfc +
        ", wbljl=" + wbljl +
        ", jlblbgb=" + jlblbgb +
        ", dtxgjcd=" + dtxgjcd +
        ", dtgdjx=" + dtgdjx +
        ", htts=" + htts +
        ", jljs=" + jljs +
        ", dtzxjc=" + dtzxjc +
        ", jzdgjc=" + jzdgjc +
        ", lsxs=" + lsxs +
        ", lwsy=" + lwsy +
        ", note=" + note +
        "}";
    }
}
