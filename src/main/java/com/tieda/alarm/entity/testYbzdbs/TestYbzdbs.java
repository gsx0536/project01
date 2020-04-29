package com.tieda.alarm.entity.testYbzdbs;

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
@TableName("TEST_YBZDBS")
public class TestYbzdbs implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    /**
     * 项目
     */
    @TableField("NAME")
    private String name;
    /**
     * 载频（HZ）
     */
    @TableField("ZP")
    private String zp;
    /**
     * 频率发送载频核对
     */
    @TableField("ZPHD")
    private String zphd;
    /**
     * 频率发送jc
     */
    @TableField("JC")
    private String jc;
    /**
     * 频率发送hu
     */
    @TableField("HU")
    private String hu;
    /**
     * 频率发送hb
     */
    @TableField("HB")
    private String hb;
    /**
     * 频率发送uu
     */
    @TableField("UU")
    private String uu;
    /**
     * 频率发送uus
     */
    @TableField("UUS")
    private String uus;
    /**
     * 频率发送u
     */
    @TableField("U")
    private String u;
    /**
     * 频率发送u2
     */
    @TableField("U2")
    private String u2;
    /**
     * 频率发送u2s
     */
    @TableField("U2S")
    private String u2s;
    /**
     * 频率发送lu
     */
    @TableField("LU")
    private String lu;
    /**
     * 频率发送l
     */
    @TableField("L")
    private String l;
    /**
     * 频率发送l2
     */
    @TableField("L2")
    private String l2;
    /**
     * 频率发送l3
     */
    @TableField("L3")
    private String l3;
    /**
     * 频率发送l4
     */
    @TableField("L4")
    private String l4;
    /**
     * 频率发送l5
     */
    @TableField("L5")
    private String l5;
    /**
     * 接收低频主机
     */
    @TableField("JS_DP_ZJ")
    private String jsDpZj;
    /**
     * 接收低频并机
     */
    @TableField("JS_DP_BJ")
    private String jsDpBj;
    /**
     * 接收移频主机
     */
    @TableField("JS_YP_ZJ")
    private String jsYpZj;
    /**
     * 接收移频并机
     */
    @TableField("JS_YP_BJ")
    private String jsYpBj;
    /**
     * 信号机灯位显示核对h
     */
    @TableField("DGXSHD_H")
    private String dgxshdH;
    /**
     * 信号机灯位显示核对u
     */
    @TableField("DGXSHD_U")
    private String dgxshdU;
    /**
     * 信号机灯位显示核对lu
     */
    @TableField("DGXSHD_LU")
    private String dgxshdLu;
    /**
     * 信号机灯位显示核对l
     */
    @TableField("DGXSHD_L")
    private String dgxshdL;
    /**
     * 主副丝转换及报警
     */
    @TableField("ZFSZH")
    private String zfszh;
    /**
     * 信号机灯光转移h
     */
    @TableField("DGZY_H")
    private String dgzyH;
    /**
     * 信号机灯光转移u
     */
    @TableField("DGZY_U")
    private String dgzyU;
    /**
     * 信号机灯光转移lu
     */
    @TableField("DGZY_LU")
    private String dgzyLu;
    /**
     * 信号机灯光转移l
     */
    @TableField("DGZY_L")
    private String dgzyL;
    /**
     * 发送接收故障报警
     */
    @TableField("FSJSGZ")
    private String fsjsgz;
    /**
     * 主轨区段核对
     */
    @TableField("ZGQDHD")
    private String zgqdhd;
    /**
     * 小轨区段核对
     */
    @TableField("XGQDHD")
    private String xgqdhd;
    /**
     * 残压测试
     */
    @TableField("CYCS")
    private String cycs;
    /**
     * 双机（N+1）转换及一致性试验
     */
    @TableField("SJZH")
    private String sjzh;
    /**
     * 发送接收端设置核对
     */
    @TableField("FSJSSZHD")
    private String fsjsszhd;
    /**
     * 进站口分割点核查
     */
    @TableField("JZKFGHC")
    private String jzkfghc;
    /**
     * 反向分割点核查
     */
    @TableField("FXFGHC")
    private String fxfghc;
    /**
     * 备注
     */
    @TableField("NOTE")
    private String note;
    /**
     * 试验者
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

    public String getZp() {
        return zp;
    }

    public void setZp(String zp) {
        this.zp = zp;
    }

    public String getZphd() {
        return zphd;
    }

    public void setZphd(String zphd) {
        this.zphd = zphd;
    }

    public String getJc() {
        return jc;
    }

    public void setJc(String jc) {
        this.jc = jc;
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

    public String getUus() {
        return uus;
    }

    public void setUus(String uus) {
        this.uus = uus;
    }

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public String getU2() {
        return u2;
    }

    public void setU2(String u2) {
        this.u2 = u2;
    }

    public String getU2s() {
        return u2s;
    }

    public void setU2s(String u2s) {
        this.u2s = u2s;
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

    public String getL4() {
        return l4;
    }

    public void setL4(String l4) {
        this.l4 = l4;
    }

    public String getL5() {
        return l5;
    }

    public void setL5(String l5) {
        this.l5 = l5;
    }

    public String getJsDpZj() {
        return jsDpZj;
    }

    public void setJsDpZj(String jsDpZj) {
        this.jsDpZj = jsDpZj;
    }

    public String getJsDpBj() {
        return jsDpBj;
    }

    public void setJsDpBj(String jsDpBj) {
        this.jsDpBj = jsDpBj;
    }

    public String getJsYpZj() {
        return jsYpZj;
    }

    public void setJsYpZj(String jsYpZj) {
        this.jsYpZj = jsYpZj;
    }

    public String getJsYpBj() {
        return jsYpBj;
    }

    public void setJsYpBj(String jsYpBj) {
        this.jsYpBj = jsYpBj;
    }

    public String getDgxshdH() {
        return dgxshdH;
    }

    public void setDgxshdH(String dgxshdH) {
        this.dgxshdH = dgxshdH;
    }

    public String getDgxshdU() {
        return dgxshdU;
    }

    public void setDgxshdU(String dgxshdU) {
        this.dgxshdU = dgxshdU;
    }

    public String getDgxshdLu() {
        return dgxshdLu;
    }

    public void setDgxshdLu(String dgxshdLu) {
        this.dgxshdLu = dgxshdLu;
    }

    public String getDgxshdL() {
        return dgxshdL;
    }

    public void setDgxshdL(String dgxshdL) {
        this.dgxshdL = dgxshdL;
    }

    public String getZfszh() {
        return zfszh;
    }

    public void setZfszh(String zfszh) {
        this.zfszh = zfszh;
    }

    public String getDgzyH() {
        return dgzyH;
    }

    public void setDgzyH(String dgzyH) {
        this.dgzyH = dgzyH;
    }

    public String getDgzyU() {
        return dgzyU;
    }

    public void setDgzyU(String dgzyU) {
        this.dgzyU = dgzyU;
    }

    public String getDgzyLu() {
        return dgzyLu;
    }

    public void setDgzyLu(String dgzyLu) {
        this.dgzyLu = dgzyLu;
    }

    public String getDgzyL() {
        return dgzyL;
    }

    public void setDgzyL(String dgzyL) {
        this.dgzyL = dgzyL;
    }

    public String getFsjsgz() {
        return fsjsgz;
    }

    public void setFsjsgz(String fsjsgz) {
        this.fsjsgz = fsjsgz;
    }

    public String getZgqdhd() {
        return zgqdhd;
    }

    public void setZgqdhd(String zgqdhd) {
        this.zgqdhd = zgqdhd;
    }

    public String getXgqdhd() {
        return xgqdhd;
    }

    public void setXgqdhd(String xgqdhd) {
        this.xgqdhd = xgqdhd;
    }

    public String getCycs() {
        return cycs;
    }

    public void setCycs(String cycs) {
        this.cycs = cycs;
    }

    public String getSjzh() {
        return sjzh;
    }

    public void setSjzh(String sjzh) {
        this.sjzh = sjzh;
    }

    public String getFsjsszhd() {
        return fsjsszhd;
    }

    public void setFsjsszhd(String fsjsszhd) {
        this.fsjsszhd = fsjsszhd;
    }

    public String getJzkfghc() {
        return jzkfghc;
    }

    public void setJzkfghc(String jzkfghc) {
        this.jzkfghc = jzkfghc;
    }

    public String getFxfghc() {
        return fxfghc;
    }

    public void setFxfghc(String fxfghc) {
        this.fxfghc = fxfghc;
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
        return "TestYbzdbs{" +
        "id=" + id +
        ", name=" + name +
        ", zp=" + zp +
        ", zphd=" + zphd +
        ", jc=" + jc +
        ", hu=" + hu +
        ", hb=" + hb +
        ", uu=" + uu +
        ", uus=" + uus +
        ", u=" + u +
        ", u2=" + u2 +
        ", u2s=" + u2s +
        ", lu=" + lu +
        ", l=" + l +
        ", l2=" + l2 +
        ", l3=" + l3 +
        ", l4=" + l4 +
        ", l5=" + l5 +
        ", jsDpZj=" + jsDpZj +
        ", jsDpBj=" + jsDpBj +
        ", jsYpZj=" + jsYpZj +
        ", jsYpBj=" + jsYpBj +
        ", dgxshdH=" + dgxshdH +
        ", dgxshdU=" + dgxshdU +
        ", dgxshdLu=" + dgxshdLu +
        ", dgxshdL=" + dgxshdL +
        ", zfszh=" + zfszh +
        ", dgzyH=" + dgzyH +
        ", dgzyU=" + dgzyU +
        ", dgzyLu=" + dgzyLu +
        ", dgzyL=" + dgzyL +
        ", fsjsgz=" + fsjsgz +
        ", zgqdhd=" + zgqdhd +
        ", xgqdhd=" + xgqdhd +
        ", cycs=" + cycs +
        ", sjzh=" + sjzh +
        ", fsjsszhd=" + fsjsszhd +
        ", jzkfghc=" + jzkfghc +
        ", fxfghc=" + fxfghc +
        ", note=" + note +
        ", operator=" + operator +
        ", director=" + director +
        ", designid=" + designid +
        ", createdate=" + createdate +
        "}";
    }
}
