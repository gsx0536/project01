package com.tieda.alarm.entity.testSjmx;

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
@TableName("TEST_SJMX")
public class TestSjmx implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    /**
     * 区段名称
     */
    @TableField("NAME")
    private String name;
    /**
     * HU（26.8）→U（16.9）
     */
    @TableField("HU_U")
    private String huU;
    /**
     * HU（26.8）→UUS（19.1）
     */
    @TableField("HU_UUS")
    private String huUus;
    /**
     * HU（26.8）→U2S（20.2）
     */
    @TableField("HU_U2S")
    private String huU2s;
    /**
     * HU（26.8）→LU（13.6）
     */
    @TableField("HU_LU")
    private String huLu;
    /**
     * HU（26.8）→L1（11.4）
     */
    @TableField("HU_L1")
    private String huL1;
    /**
     * HU（26.8）→L2（12.5）
     */
    @TableField("HU_L2")
    private String huL2;
    /**
     * HU（26.8）→L3（10.3）
     */
    @TableField("HU_L3")
    private String huL3;
    /**
     * HU（26.8）→L4（23.5）
     */
    @TableField("HU_L4")
    private String huL4;
    /**
     * HU（26.8）→L5（21.3）
     */
    @TableField("HU_L5")
    private String huL5;
    /**
     * U（16.9）→LU（13.6）
     */
    @TableField("U_LU")
    private String uLu;
    /**
     * U（16.9）→U2（14.7）
     */
    @TableField("U_U2")
    private String uU2;
    /**
     * LU（13.6）→L1（11.4）
     */
    @TableField("LU_L1")
    private String luL1;
    /**
     * L1（11.4）→L2（12.5）
     */
    @TableField("L1_L2")
    private String l1L2;
    /**
     * L2（12.5）→L3（10.3）
     */
    @TableField("L2_L3")
    private String l2L3;
    /**
     * L3（10.3）→L4（23.5）
     */
    @TableField("L3_L4")
    private String l3L4;
    /**
     * L4（23.5）→L5（21.3）
     */
    @TableField("L4_L5")
    private String l4L5;
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
    /**
     * HU（26.8）→U2（14.7）
     */
    @TableField("HU_U2")
    private String huU2;
    /**
     * U（16.9）→U2S（20.2）
     */
    @TableField("U_U2S")
    private String uU2s;


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

    public String getHuU() {
        return huU;
    }

    public void setHuU(String huU) {
        this.huU = huU;
    }

    public String getHuUus() {
        return huUus;
    }

    public void setHuUus(String huUus) {
        this.huUus = huUus;
    }

    public String getHuU2s() {
        return huU2s;
    }

    public void setHuU2s(String huU2s) {
        this.huU2s = huU2s;
    }

    public String getHuLu() {
        return huLu;
    }

    public void setHuLu(String huLu) {
        this.huLu = huLu;
    }

    public String getHuL1() {
        return huL1;
    }

    public void setHuL1(String huL1) {
        this.huL1 = huL1;
    }

    public String getHuL2() {
        return huL2;
    }

    public void setHuL2(String huL2) {
        this.huL2 = huL2;
    }

    public String getHuL3() {
        return huL3;
    }

    public void setHuL3(String huL3) {
        this.huL3 = huL3;
    }

    public String getHuL4() {
        return huL4;
    }

    public void setHuL4(String huL4) {
        this.huL4 = huL4;
    }

    public String getHuL5() {
        return huL5;
    }

    public void setHuL5(String huL5) {
        this.huL5 = huL5;
    }

    public String getuLu() {
        return uLu;
    }

    public void setuLu(String uLu) {
        this.uLu = uLu;
    }

    public String getuU2() {
        return uU2;
    }

    public void setuU2(String uU2) {
        this.uU2 = uU2;
    }

    public String getLuL1() {
        return luL1;
    }

    public void setLuL1(String luL1) {
        this.luL1 = luL1;
    }

    public String getL1L2() {
        return l1L2;
    }

    public void setL1L2(String l1L2) {
        this.l1L2 = l1L2;
    }

    public String getL2L3() {
        return l2L3;
    }

    public void setL2L3(String l2L3) {
        this.l2L3 = l2L3;
    }

    public String getL3L4() {
        return l3L4;
    }

    public void setL3L4(String l3L4) {
        this.l3L4 = l3L4;
    }

    public String getL4L5() {
        return l4L5;
    }

    public void setL4L5(String l4L5) {
        this.l4L5 = l4L5;
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

    public String getHuU2() {
        return huU2;
    }

    public void setHuU2(String huU2) {
        this.huU2 = huU2;
    }

    public String getuU2s() {
        return uU2s;
    }

    public void setuU2s(String uU2s) {
        this.uU2s = uU2s;
    }

    @Override
    public String toString() {
        return "TestSjmx{" +
        "id=" + id +
        ", name=" + name +
        ", huU=" + huU +
        ", huUus=" + huUus +
        ", huU2s=" + huU2s +
        ", huLu=" + huLu +
        ", huL1=" + huL1 +
        ", huL2=" + huL2 +
        ", huL3=" + huL3 +
        ", huL4=" + huL4 +
        ", huL5=" + huL5 +
        ", uLu=" + uLu +
        ", uU2=" + uU2 +
        ", luL1=" + luL1 +
        ", l1L2=" + l1L2 +
        ", l2L3=" + l2L3 +
        ", l3L4=" + l3L4 +
        ", l4L5=" + l4L5 +
        ", note=" + note +
        ", operator=" + operator +
        ", director=" + director +
        ", designid=" + designid +
        ", createdate=" + createdate +
        ", huU2=" + huU2 +
        ", uU2s=" + uU2s +
        "}";
    }
}
