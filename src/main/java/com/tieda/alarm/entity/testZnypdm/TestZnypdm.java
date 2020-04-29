package com.tieda.alarm.entity.testZnypdm;

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
 * @since 2019-10-17
 */
@TableName("TEST_ZNYPDM")
public class TestZnypdm implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    /**
     * 名  称
     */
    @TableField("NAME")
    private String name;
    /**
     * 站内电码化移频频率
     */
    @TableField("YPPL")
    private String yppl;
    /**
     * 站内电码化低频频率hu
     */
    @TableField("HU")
    private String hu;
    /**
     * 站内电码化低频频率hb
     */
    @TableField("HB")
    private String hb;
    /**
     * 站内电码化低频频率uu
     */
    @TableField("UU")
    private String uu;
    /**
     * 站内电码化低频频率u2
     */
    @TableField("U2")
    private String u2;
    /**
     * 站内电码化低频频率uus
     */
    @TableField("UUS")
    private String uus;
    /**
     * 站内电码化低频频率u2s
     */
    @TableField("U2S")
    private String u2s;
    /**
     * 站内电码化低频频率u
     */
    @TableField("U")
    private String u;
    /**
     * 站内电码化低频频率lu
     */
    @TableField("LU")
    private String lu;
    /**
     * 站内电码化低频频率l
     */
    @TableField("L")
    private String l;
    /**
     * 站内电码化低频频率l2
     */
    @TableField("L2")
    private String l2;
    /**
     * 站内电码化低频频率l3
     */
    @TableField("L3")
    private String l3;
    /**
     * 站内电码化低频频率jc
     */
    @TableField("JC")
    private String jc;
    /**
     * 站内电码化低频频率zp
     */
    @TableField("ZP")
    private String zp;
    /**
     * 站内电码化站内发码预叠加发码
     */
    @TableField("YDJFM")
    private String ydjfm;
    /**
     * 站内电码化站内发码发码顺序核对
     */
    @TableField("FMSXHD")
    private String fmsxhd;
    /**
     * 站内电码化站内发码各区段发码方向核对
     */
    @TableField("GQDFM")
    private String gqdfm;
    /**
     * 站内电码化站内发码闭环检测
     */
    @TableField("BHJC")
    private String bhjc;
    /**
     * 站内电码化站内发码直进直出转频码检查
     */
    @TableField("ZJZC")
    private String zjzc;
    /**
     * 双机（N+1）转换及一致性试验
     */
    @TableField("SJZH")
    private String sjzh;
    /**
     * 发送故障报警
     */
    @TableField("FSGZ")
    private String fsgz;
    /**
     * 切码时机及发码恢复
     */
    @TableField("QMSJ")
    private String qmsj;
    /**
     * 中岔调号开放是否切码
     */
    @TableField("ZCTHKF")
    private String zcthkf;
    /**
     * 高普结合站发车口与1LQ码序一致性核对（区间红灯转移时）
     */
    @TableField("GPJHZ")
    private String gpjhz;
    /**
     * 备注
     */
    @TableField("NOTE")
    private String note;
    /**
     * 试 验 者
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYppl() {
        return yppl;
    }

    public void setYppl(String yppl) {
        this.yppl = yppl;
    }

    public String getHu() {
        return hu;
    }

    public void setHu(String hu) {
        this.hu = hu;
    }

    public String getHb() {
        return hb;
    }

    public void setHb(String hb) {
        this.hb = hb;
    }

    public String getUu() {
        return uu;
    }

    public void setUu(String uu) {
        this.uu = uu;
    }

    public String getU2() {
        return u2;
    }

    public void setU2(String u2) {
        this.u2 = u2;
    }

    public String getUus() {
        return uus;
    }

    public void setUus(String uus) {
        this.uus = uus;
    }

    public String getU2s() {
        return u2s;
    }

    public void setU2s(String u2s) {
        this.u2s = u2s;
    }

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public String getLu() {
        return lu;
    }

    public void setLu(String lu) {
        this.lu = lu;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getL2() {
        return l2;
    }

    public void setL2(String l2) {
        this.l2 = l2;
    }

    public String getL3() {
        return l3;
    }

    public void setL3(String l3) {
        this.l3 = l3;
    }

    public String getJc() {
        return jc;
    }

    public void setJc(String jc) {
        this.jc = jc;
    }

    public String getZp() {
        return zp;
    }

    public void setZp(String zp) {
        this.zp = zp;
    }

    public String getYdjfm() {
        return ydjfm;
    }

    public void setYdjfm(String ydjfm) {
        this.ydjfm = ydjfm;
    }

    public String getFmsxhd() {
        return fmsxhd;
    }

    public void setFmsxhd(String fmsxhd) {
        this.fmsxhd = fmsxhd;
    }

    public String getGqdfm() {
        return gqdfm;
    }

    public void setGqdfm(String gqdfm) {
        this.gqdfm = gqdfm;
    }

    public String getBhjc() {
        return bhjc;
    }

    public void setBhjc(String bhjc) {
        this.bhjc = bhjc;
    }

    public String getZjzc() {
        return zjzc;
    }

    public void setZjzc(String zjzc) {
        this.zjzc = zjzc;
    }

    public String getSjzh() {
        return sjzh;
    }

    public void setSjzh(String sjzh) {
        this.sjzh = sjzh;
    }

    public String getFsgz() {
        return fsgz;
    }

    public void setFsgz(String fsgz) {
        this.fsgz = fsgz;
    }

    public String getQmsj() {
        return qmsj;
    }

    public void setQmsj(String qmsj) {
        this.qmsj = qmsj;
    }

    public String getZcthkf() {
        return zcthkf;
    }

    public void setZcthkf(String zcthkf) {
        this.zcthkf = zcthkf;
    }

    public String getGpjhz() {
        return gpjhz;
    }

    public void setGpjhz(String gpjhz) {
        this.gpjhz = gpjhz;
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
        return "TestZnypdm{" +
        "id=" + id +
        ", name=" + name +
        ", yppl=" + yppl +
        ", hu=" + hu +
        ", hb=" + hb +
        ", uu=" + uu +
        ", u2=" + u2 +
        ", uus=" + uus +
        ", u2s=" + u2s +
        ", u=" + u +
        ", lu=" + lu +
        ", l=" + l +
        ", l2=" + l2 +
        ", l3=" + l3 +
        ", jc=" + jc +
        ", zp=" + zp +
        ", ydjfm=" + ydjfm +
        ", fmsxhd=" + fmsxhd +
        ", gqdfm=" + gqdfm +
        ", bhjc=" + bhjc +
        ", zjzc=" + zjzc +
        ", sjzh=" + sjzh +
        ", fsgz=" + fsgz +
        ", qmsj=" + qmsj +
        ", zcthkf=" + zcthkf +
        ", gpjhz=" + gpjhz +
        ", note=" + note +
        ", operator=" + operator +
        ", director=" + director +
        ", designid=" + designid +
        ", createdate=" + createdate +
        "}";
    }
}
