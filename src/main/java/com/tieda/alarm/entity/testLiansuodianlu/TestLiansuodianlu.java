package com.tieda.alarm.entity.testLiansuodianlu;

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
 * @since 2019-10-16
 */
@TableName("TEST_LIANSUODIANLU")
public class TestLiansuodianlu implements Serializable {

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
     * 正常开放信号
     */
    @TableField("ZCKFXH")
    private String zckfxh;
    /**
     * 道岔位置不对     不能开放信号 
     */
    @TableField("DCCWZBD")
    private String dccwzbd;
    /**
     * 道岔无表示
关闭信号
     */
    @TableField("DCWBS")
    private String dcwbs;
    /**
     * 区段占用不
能开放信号
     */
    @TableField("QDZY")
    private String qdzy;
    /**
     * 带动道岔
     */
    @TableField("DDDC")
    private String dddc;
    /**
     * 防护道岔
     */
    @TableField("FHDC")
    private String fhdc;
    /**
     * 信号开放后锁闭道岔
     */
    @TableField("HXKFHSBDC")
    private String hxkfhsbdc;
    /**
     * 敌对信号
     */
    @TableField("DDXH")
    private String ddxh;
    /**
     * 敌对照查
     */
    @TableField("DDZC")
    private String ddzc;
    /**
     * 随时关闭信号
     */
    @TableField("SSGBXH")
    private String ssgbxh;
    /**
     * 接近锁闭及区段核对
     */
    @TableField("JJSBQDHD")
    private String jjsbqdhd;
    /**
     * 取消进路解锁
     */
    @TableField("QXJLJS")
    private String qxjljs;
    /**
     * 人工延时解锁
     */
    @TableField("RGYSJS")
    private String rgysjs;
    /**
     * 区段人工解锁
     */
    @TableField("QDRKJS")
    private String qdrkjs;
    /**
     * 防止自动重复开放信号
     */
    @TableField("FZZDCFKFXH")
    private String fzzdcfkfxh;
    /**
     * 进路正常解锁
     */
    @TableField("JLZCJS")
    private String jlzcjs;
    /**
     * 局部控制
     */
    @TableField("JBKZ")
    private String jbkz;
    /**
     * 进路表示器
     */
    @TableField("JLBSQ")
    private String jlbsq;
    /**
     * 调车中途返回解锁
     */
    @TableField("DCZDFHJS")
    private String dczdfhjs;
    /**
     * 自闭离去区段占用或区间空闲检查
     */
    @TableField("ZBLQQDZYHQJKXJC")
    private String zblqqdzyhqjkxjc;
    /**
     * 半自动闭塞（自动站间闭塞）
     */
    @TableField("BZDSB")
    private String bzdsb;
    /**
     * 引导信号
     */
    @TableField("YDXH")
    private String ydxh;
    /**
     * 机务段同意
     */
    @TableField("JWDTY")
    private String jwdty;
    /**
     * 超限绝缘条件
     */
    @TableField("CXJYTJ")
    private String cxjytj;
    /**
     * 6‰下坡道
     */
    @TableField("XPD6")
    private String xpd6;
    /**
     * 到发线出岔
     */
    @TableField("DFXCC")
    private String dfxcc;
    /**
     * 非进路调车
     */
    @TableField("FJLDC")
    private String fjldc;
    /**
     * 其他联系电路
     */
    @TableField("QTLXDH")
    private String qtlxdh;
    /**
     * 防止迎面解锁
     */
    @TableField("FZYMJS")
    private String fzymjs;
    /**
     * 全站轨道停电恢复
     */
    @TableField("QZGDTDHF")
    private String qzgdtdhf;
    /**
     * 信号非正常关闭报警
     */
    @TableField("XHFZCGBBJ")
    private String xhfzcgbbj;
    /**
     * 道口通知及遮断试验
     */
    @TableField("DKTZJZDSY")
    private String dktzjzdsy;
    /**
     * 调车白灯保留检查
     */
    @TableField("DCBTBLJC")
    private String dcbtbljc;
    /**
     * 改变运行方向
     */
    @TableField("GBYXFX")
    private String gbyxfx;
    /**
     * 排列长调车进路
     */
    @TableField("PLCDCJL")
    private String plcdcjl;
    /**
     * 备 注
     */
    @TableField("NOTE")
    private String note;
    /**
     * 站名
     */
    @TableField("STATIONNAME")
    private String stationname;
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

    public String getZckfxh() {
        return zckfxh;
    }

    public void setZckfxh(String zckfxh) {
        this.zckfxh = zckfxh;
    }

    public String getDccwzbd() {
        return dccwzbd;
    }

    public void setDccwzbd(String dccwzbd) {
        this.dccwzbd = dccwzbd;
    }

    public String getDcwbs() {
        return dcwbs;
    }

    public void setDcwbs(String dcwbs) {
        this.dcwbs = dcwbs;
    }

    public String getQdzy() {
        return qdzy;
    }

    public void setQdzy(String qdzy) {
        this.qdzy = qdzy;
    }

    public String getDddc() {
        return dddc;
    }

    public void setDddc(String dddc) {
        this.dddc = dddc;
    }

    public String getFhdc() {
        return fhdc;
    }

    public void setFhdc(String fhdc) {
        this.fhdc = fhdc;
    }

    public String getHxkfhsbdc() {
        return hxkfhsbdc;
    }

    public void setHxkfhsbdc(String hxkfhsbdc) {
        this.hxkfhsbdc = hxkfhsbdc;
    }

    public String getDdxh() {
        return ddxh;
    }

    public void setDdxh(String ddxh) {
        this.ddxh = ddxh;
    }

    public String getDdzc() {
        return ddzc;
    }

    public void setDdzc(String ddzc) {
        this.ddzc = ddzc;
    }

    public String getSsgbxh() {
        return ssgbxh;
    }

    public void setSsgbxh(String ssgbxh) {
        this.ssgbxh = ssgbxh;
    }

    public String getJjsbqdhd() {
        return jjsbqdhd;
    }

    public void setJjsbqdhd(String jjsbqdhd) {
        this.jjsbqdhd = jjsbqdhd;
    }

    public String getQxjljs() {
        return qxjljs;
    }

    public void setQxjljs(String qxjljs) {
        this.qxjljs = qxjljs;
    }

    public String getRgysjs() {
        return rgysjs;
    }

    public void setRgysjs(String rgysjs) {
        this.rgysjs = rgysjs;
    }

    public String getQdrkjs() {
        return qdrkjs;
    }

    public void setQdrkjs(String qdrkjs) {
        this.qdrkjs = qdrkjs;
    }

    public String getFzzdcfkfxh() {
        return fzzdcfkfxh;
    }

    public void setFzzdcfkfxh(String fzzdcfkfxh) {
        this.fzzdcfkfxh = fzzdcfkfxh;
    }

    public String getJlzcjs() {
        return jlzcjs;
    }

    public void setJlzcjs(String jlzcjs) {
        this.jlzcjs = jlzcjs;
    }

    public String getJbkz() {
        return jbkz;
    }

    public void setJbkz(String jbkz) {
        this.jbkz = jbkz;
    }

    public String getJlbsq() {
        return jlbsq;
    }

    public void setJlbsq(String jlbsq) {
        this.jlbsq = jlbsq;
    }

    public String getDczdfhjs() {
        return dczdfhjs;
    }

    public void setDczdfhjs(String dczdfhjs) {
        this.dczdfhjs = dczdfhjs;
    }

    public String getZblqqdzyhqjkxjc() {
        return zblqqdzyhqjkxjc;
    }

    public void setZblqqdzyhqjkxjc(String zblqqdzyhqjkxjc) {
        this.zblqqdzyhqjkxjc = zblqqdzyhqjkxjc;
    }

    public String getBzdsb() {
        return bzdsb;
    }

    public void setBzdsb(String bzdsb) {
        this.bzdsb = bzdsb;
    }

    public String getYdxh() {
        return ydxh;
    }

    public void setYdxh(String ydxh) {
        this.ydxh = ydxh;
    }

    public String getJwdty() {
        return jwdty;
    }

    public void setJwdty(String jwdty) {
        this.jwdty = jwdty;
    }

    public String getCxjytj() {
        return cxjytj;
    }

    public void setCxjytj(String cxjytj) {
        this.cxjytj = cxjytj;
    }

    public String getXpd6() {
        return xpd6;
    }

    public void setXpd6(String xpd6) {
        this.xpd6 = xpd6;
    }

    public String getDfxcc() {
        return dfxcc;
    }

    public void setDfxcc(String dfxcc) {
        this.dfxcc = dfxcc;
    }

    public String getFjldc() {
        return fjldc;
    }

    public void setFjldc(String fjldc) {
        this.fjldc = fjldc;
    }

    public String getQtlxdh() {
        return qtlxdh;
    }

    public void setQtlxdh(String qtlxdh) {
        this.qtlxdh = qtlxdh;
    }

    public String getFzymjs() {
        return fzymjs;
    }

    public void setFzymjs(String fzymjs) {
        this.fzymjs = fzymjs;
    }

    public String getQzgdtdhf() {
        return qzgdtdhf;
    }

    public void setQzgdtdhf(String qzgdtdhf) {
        this.qzgdtdhf = qzgdtdhf;
    }

    public String getXhfzcgbbj() {
        return xhfzcgbbj;
    }

    public void setXhfzcgbbj(String xhfzcgbbj) {
        this.xhfzcgbbj = xhfzcgbbj;
    }

    public String getDktzjzdsy() {
        return dktzjzdsy;
    }

    public void setDktzjzdsy(String dktzjzdsy) {
        this.dktzjzdsy = dktzjzdsy;
    }

    public String getDcbtbljc() {
        return dcbtbljc;
    }

    public void setDcbtbljc(String dcbtbljc) {
        this.dcbtbljc = dcbtbljc;
    }

    public String getGbyxfx() {
        return gbyxfx;
    }

    public void setGbyxfx(String gbyxfx) {
        this.gbyxfx = gbyxfx;
    }

    public String getPlcdcjl() {
        return plcdcjl;
    }

    public void setPlcdcjl(String plcdcjl) {
        this.plcdcjl = plcdcjl;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname;
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
        return "TestLiansuodianlu{" +
        "id=" + id +
        ", jlhm=" + jlhm +
        ", jlsd=" + jlsd +
        ", jlbt=" + jlbt +
        ", jlzd=" + jlzd +
        ", zckfxh=" + zckfxh +
        ", dccwzbd=" + dccwzbd +
        ", dcwbs=" + dcwbs +
        ", qdzy=" + qdzy +
        ", dddc=" + dddc +
        ", fhdc=" + fhdc +
        ", hxkfhsbdc=" + hxkfhsbdc +
        ", ddxh=" + ddxh +
        ", ddzc=" + ddzc +
        ", ssgbxh=" + ssgbxh +
        ", jjsbqdhd=" + jjsbqdhd +
        ", qxjljs=" + qxjljs +
        ", rgysjs=" + rgysjs +
        ", qdrkjs=" + qdrkjs +
        ", fzzdcfkfxh=" + fzzdcfkfxh +
        ", jlzcjs=" + jlzcjs +
        ", jbkz=" + jbkz +
        ", jlbsq=" + jlbsq +
        ", dczdfhjs=" + dczdfhjs +
        ", zblqqdzyhqjkxjc=" + zblqqdzyhqjkxjc +
        ", bzdsb=" + bzdsb +
        ", ydxh=" + ydxh +
        ", jwdty=" + jwdty +
        ", cxjytj=" + cxjytj +
        ", xpd6=" + xpd6 +
        ", dfxcc=" + dfxcc +
        ", fjldc=" + fjldc +
        ", qtlxdh=" + qtlxdh +
        ", fzymjs=" + fzymjs +
        ", qzgdtdhf=" + qzgdtdhf +
        ", xhfzcgbbj=" + xhfzcgbbj +
        ", dktzjzdsy=" + dktzjzdsy +
        ", dcbtbljc=" + dcbtbljc +
        ", gbyxfx=" + gbyxfx +
        ", plcdcjl=" + plcdcjl +
        ", note=" + note +
        ", stationname=" + stationname +
        ", director=" + director +
        ", designid=" + designid +
        ", createdate=" + createdate +
        "}";
    }
}
