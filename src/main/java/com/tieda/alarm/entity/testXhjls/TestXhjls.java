package com.tieda.alarm.entity.testXhjls;

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
@TableName("TEST_XHJLS")
public class TestXhjls implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    /**
     * 项目
     */
    @TableField("NAME")
    private String name;
    /**
     * 安装位置及显示方向核对
     */
    @TableField("AZWZ")
    private String azwz;
    /**
     * 灯位及显示核对h
     */
    @TableField("DWXSHD_H")
    private String dwxshdH;
    /**
     * 灯位及显示核对u
     */
    @TableField("DWXSHD_U")
    private String dwxshdU;
    /**
     * 灯位及显示核对uu
     */
    @TableField("DWXSHD_UU")
    private String dwxshdUu;
    /**
     * 灯位及显示核对U 闪 U
     */
    @TableField("DWXSHD_USU")
    private String dwxshdUsu;
    /**
     * 灯位及显示核对lu
     */
    @TableField("DWXSHD_LU")
    private String dwxshdLu;
    /**
     * 灯位及显示核对ll
     */
    @TableField("DWXSHD_LL")
    private String dwxshdLl;
    /**
     * 灯位及显示核对hb
     */
    @TableField("DWXSHD_HB")
    private String dwxshdHb;
    /**
     * 灯位及显示核对a
     */
    @TableField("DWXSHD_A")
    private String dwxshdA;
    /**
     * 灯位及显示核对b
     */
    @TableField("DWXSHD_B")
    private String dwxshdB;
    /**
     * 主付丝（灯泡）转换1u
     */
    @TableField("ZFS_1U")
    private String zfs1u;
    /**
     * 主付丝（灯泡）转换l
     */
    @TableField("ZFS_L")
    private String zfsL;
    /**
     * 主付丝（灯泡）转换h
     */
    @TableField("ZFS_H")
    private String zfsH;
    /**
     * 主付丝（灯泡）转换2u
     */
    @TableField("ZFS_2U")
    private String zfs2u;
    /**
     * 主付丝（灯泡）转换b
     */
    @TableField("ZFS_B")
    private String zfsB;
    /**
     * 主付丝（灯泡）转换a
     */
    @TableField("ZFS_A")
    private String zfsA;
    /**
     * 进路表示器核对
     */
    @TableField("JLBSQHD")
    private String jlbsqhd;
    /**
     * 灯光转移
     */
    @TableField("DGZY")
    private String dgzy;
    /**
     * 红灯断丝不能开放信号
     */
    @TableField("HDDS")
    private String hdds;
    /**
     * 侧线出站红灯断丝能开放信号
     */
    @TableField("CXCZ")
    private String cxcz;
    /**
     * 断路器作用试验
     */
    @TableField("DLQ")
    private String dlq;
    /**
     * 同名端核对
     */
    @TableField("TMDHD")
    private String tmdhd;
    /**
     * 备  注
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
    /**
     * 断丝表示1u
     */
    @TableField("DS_1U")
    private String ds1u;
    /**
     * 断丝表示l
     */
    @TableField("DS_L")
    private String dsL;
    /**
     * 断丝表示h
     */
    @TableField("DS_H")
    private String dsH;
    /**
     * 断丝表示2u
     */
    @TableField("DS_2U")
    private String ds2u;
    /**
     * 断丝表示b
     */
    @TableField("DS_B")
    private String dsB;
    /**
     * 断丝表示a
     */
    @TableField("DS_A")
    private String dsA;
    /**
     * 灯位及显示核对l
     */
    @TableField("DWXSHD_L")
    private String dwxshdL;


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

    public String getAzwz() {
        return azwz;
    }

    public void setAzwz(String azwz) {
        this.azwz = azwz;
    }

    public String getDwxshdH() {
        return dwxshdH;
    }

    public void setDwxshdH(String dwxshdH) {
        this.dwxshdH = dwxshdH;
    }

    public String getDwxshdU() {
        return dwxshdU;
    }

    public void setDwxshdU(String dwxshdU) {
        this.dwxshdU = dwxshdU;
    }

    public String getDwxshdUu() {
        return dwxshdUu;
    }

    public void setDwxshdUu(String dwxshdUu) {
        this.dwxshdUu = dwxshdUu;
    }

    public String getDwxshdUsu() {
        return dwxshdUsu;
    }

    public void setDwxshdUsu(String dwxshdUsu) {
        this.dwxshdUsu = dwxshdUsu;
    }

    public String getDwxshdLu() {
        return dwxshdLu;
    }

    public void setDwxshdLu(String dwxshdLu) {
        this.dwxshdLu = dwxshdLu;
    }

    public String getDwxshdLl() {
        return dwxshdLl;
    }

    public void setDwxshdLl(String dwxshdLl) {
        this.dwxshdLl = dwxshdLl;
    }

    public String getDwxshdHb() {
        return dwxshdHb;
    }

    public void setDwxshdHb(String dwxshdHb) {
        this.dwxshdHb = dwxshdHb;
    }

    public String getDwxshdA() {
        return dwxshdA;
    }

    public void setDwxshdA(String dwxshdA) {
        this.dwxshdA = dwxshdA;
    }

    public String getDwxshdB() {
        return dwxshdB;
    }

    public void setDwxshdB(String dwxshdB) {
        this.dwxshdB = dwxshdB;
    }

    public String getZfs1u() {
        return zfs1u;
    }

    public void setZfs1u(String zfs1u) {
        this.zfs1u = zfs1u;
    }

    public String getZfsL() {
        return zfsL;
    }

    public void setZfsL(String zfsL) {
        this.zfsL = zfsL;
    }

    public String getZfsH() {
        return zfsH;
    }

    public void setZfsH(String zfsH) {
        this.zfsH = zfsH;
    }

    public String getZfs2u() {
        return zfs2u;
    }

    public void setZfs2u(String zfs2u) {
        this.zfs2u = zfs2u;
    }

    public String getZfsB() {
        return zfsB;
    }

    public void setZfsB(String zfsB) {
        this.zfsB = zfsB;
    }

    public String getZfsA() {
        return zfsA;
    }

    public void setZfsA(String zfsA) {
        this.zfsA = zfsA;
    }

    public String getJlbsqhd() {
        return jlbsqhd;
    }

    public void setJlbsqhd(String jlbsqhd) {
        this.jlbsqhd = jlbsqhd;
    }

    public String getDgzy() {
        return dgzy;
    }

    public void setDgzy(String dgzy) {
        this.dgzy = dgzy;
    }

    public String getHdds() {
        return hdds;
    }

    public void setHdds(String hdds) {
        this.hdds = hdds;
    }

    public String getCxcz() {
        return cxcz;
    }

    public void setCxcz(String cxcz) {
        this.cxcz = cxcz;
    }

    public String getDlq() {
        return dlq;
    }

    public void setDlq(String dlq) {
        this.dlq = dlq;
    }

    public String getTmdhd() {
        return tmdhd;
    }

    public void setTmdhd(String tmdhd) {
        this.tmdhd = tmdhd;
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

    public String getDs1u() {
        return ds1u;
    }

    public void setDs1u(String ds1u) {
        this.ds1u = ds1u;
    }

    public String getDsL() {
        return dsL;
    }

    public void setDsL(String dsL) {
        this.dsL = dsL;
    }

    public String getDsH() {
        return dsH;
    }

    public void setDsH(String dsH) {
        this.dsH = dsH;
    }

    public String getDs2u() {
        return ds2u;
    }

    public void setDs2u(String ds2u) {
        this.ds2u = ds2u;
    }

    public String getDsB() {
        return dsB;
    }

    public void setDsB(String dsB) {
        this.dsB = dsB;
    }

    public String getDsA() {
        return dsA;
    }

    public void setDsA(String dsA) {
        this.dsA = dsA;
    }

    public String getDwxshdL() {
        return dwxshdL;
    }

    public void setDwxshdL(String dwxshdL) {
        this.dwxshdL = dwxshdL;
    }

    @Override
    public String toString() {
        return "TestXhjls{" +
        "id=" + id +
        ", name=" + name +
        ", azwz=" + azwz +
        ", dwxshdH=" + dwxshdH +
        ", dwxshdU=" + dwxshdU +
        ", dwxshdUu=" + dwxshdUu +
        ", dwxshdUsu=" + dwxshdUsu +
        ", dwxshdLu=" + dwxshdLu +
        ", dwxshdLl=" + dwxshdLl +
        ", dwxshdHb=" + dwxshdHb +
        ", dwxshdA=" + dwxshdA +
        ", dwxshdB=" + dwxshdB +
        ", zfs1u=" + zfs1u +
        ", zfsL=" + zfsL +
        ", zfsH=" + zfsH +
        ", zfs2u=" + zfs2u +
        ", zfsB=" + zfsB +
        ", zfsA=" + zfsA +
        ", jlbsqhd=" + jlbsqhd +
        ", dgzy=" + dgzy +
        ", hdds=" + hdds +
        ", cxcz=" + cxcz +
        ", dlq=" + dlq +
        ", tmdhd=" + tmdhd +
        ", note=" + note +
        ", operator=" + operator +
        ", director=" + director +
        ", designid=" + designid +
        ", createdate=" + createdate +
        ", ds1u=" + ds1u +
        ", dsL=" + dsL +
        ", dsH=" + dsH +
        ", ds2u=" + ds2u +
        ", dsB=" + dsB +
        ", dsA=" + dsA +
        ", dwxshdL=" + dwxshdL +
        "}";
    }
}
