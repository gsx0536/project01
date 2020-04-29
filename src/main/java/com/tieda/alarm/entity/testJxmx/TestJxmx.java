package com.tieda.alarm.entity.testJxmx;

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
@TableName("TEST_JXMX")
public class TestJxmx implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    /**
     * 区段名称
     */
    @TableField("NAME")
    private String name;
    /**
     * U（16.9）→HU（26.8）
     */
    @TableField("U_HU")
    private String uHu;
    /**
     * U2（14.7）→HU（26.8）
     */
    @TableField("U2_HU")
    private String u2Hu;
    /**
     * UUS（19.1）→HU（26.8）
     */
    @TableField("UUS_HU")
    private String uusHu;
    /**
     * U2S（20.2）→HU（26.8）
     */
    @TableField("U2S_HU")
    private String u2sHu;
    /**
     * LU（13.6）→HU（26.8）
     */
    @TableField("LU_HU")
    private String luHu;
    /**
     * L1（11.4）→HU（26.8）
     */
    @TableField("L1_HU")
    private String l1Hu;
    /**
     * L2（12.5）→HU（26.8）
     */
    @TableField("L2_HU")
    private String l2Hu;
    /**
     * L3（10.3）→HU（26.8）
     */
    @TableField("L3_HU")
    private String l3Hu;
    /**
     * L4（23.5）→HU（26.8）
     */
    @TableField("L4_HU")
    private String l4Hu;
    /**
     * L5（21.3）→HU（26.8）
     */
    @TableField("L5_HU")
    private String l5Hu;
    /**
     * LU（13.6）→U（16.9）
     */
    @TableField("LU_U")
    private String luU;
    /**
     * U2（14.7）→U（16.9）
     */
    @TableField("U2_U")
    private String u2U;
    /**
     * U2S（20.2）→U2（14.7）
     */
    @TableField("U2S_U2")
    private String u2sU2;
    /**
     * L1（11.4）→LU（13.6）
     */
    @TableField("L1_LU")
    private String l1Lu;
    /**
     * L2（12.5）→L1（11.4）
     */
    @TableField("L2_L1")
    private String l2L1;
    /**
     * L3（10.3）→L2（12.5）
     */
    @TableField("L3_L2")
    private String l3L2;
    /**
     * L4（23.5）→L3（10.3）
     */
    @TableField("L4_L3")
    private String l4L3;
    /**
     * L5（21.3）→L4（23.5）
     */
    @TableField("L5_L4")
    private String l5L4;
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

    public String getuHu() {
        return uHu;
    }

    public void setuHu(String uHu) {
        this.uHu = uHu;
    }

    public String getU2Hu() {
        return u2Hu;
    }

    public void setU2Hu(String u2Hu) {
        this.u2Hu = u2Hu;
    }

    public String getUusHu() {
        return uusHu;
    }

    public void setUusHu(String uusHu) {
        this.uusHu = uusHu;
    }

    public String getU2sHu() {
        return u2sHu;
    }

    public void setU2sHu(String u2sHu) {
        this.u2sHu = u2sHu;
    }

    public String getLuHu() {
        return luHu;
    }

    public void setLuHu(String luHu) {
        this.luHu = luHu;
    }

    public String getL1Hu() {
        return l1Hu;
    }

    public void setL1Hu(String l1Hu) {
        this.l1Hu = l1Hu;
    }

    public String getL2Hu() {
        return l2Hu;
    }

    public void setL2Hu(String l2Hu) {
        this.l2Hu = l2Hu;
    }

    public String getL3Hu() {
        return l3Hu;
    }

    public void setL3Hu(String l3Hu) {
        this.l3Hu = l3Hu;
    }

    public String getL4Hu() {
        return l4Hu;
    }

    public void setL4Hu(String l4Hu) {
        this.l4Hu = l4Hu;
    }

    public String getL5Hu() {
        return l5Hu;
    }

    public void setL5Hu(String l5Hu) {
        this.l5Hu = l5Hu;
    }

    public String getLuU() {
        return luU;
    }

    public void setLuU(String luU) {
        this.luU = luU;
    }

    public String getU2U() {
        return u2U;
    }

    public void setU2U(String u2U) {
        this.u2U = u2U;
    }

    public String getU2sU2() {
        return u2sU2;
    }

    public void setU2sU2(String u2sU2) {
        this.u2sU2 = u2sU2;
    }

    public String getL1Lu() {
        return l1Lu;
    }

    public void setL1Lu(String l1Lu) {
        this.l1Lu = l1Lu;
    }

    public String getL2L1() {
        return l2L1;
    }

    public void setL2L1(String l2L1) {
        this.l2L1 = l2L1;
    }

    public String getL3L2() {
        return l3L2;
    }

    public void setL3L2(String l3L2) {
        this.l3L2 = l3L2;
    }

    public String getL4L3() {
        return l4L3;
    }

    public void setL4L3(String l4L3) {
        this.l4L3 = l4L3;
    }

    public String getL5L4() {
        return l5L4;
    }

    public void setL5L4(String l5L4) {
        this.l5L4 = l5L4;
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
        return "TestJxmx{" +
        "id=" + id +
        ", name=" + name +
        ", uHu=" + uHu +
        ", u2Hu=" + u2Hu +
        ", uusHu=" + uusHu +
        ", u2sHu=" + u2sHu +
        ", luHu=" + luHu +
        ", l1Hu=" + l1Hu +
        ", l2Hu=" + l2Hu +
        ", l3Hu=" + l3Hu +
        ", l4Hu=" + l4Hu +
        ", l5Hu=" + l5Hu +
        ", luU=" + luU +
        ", u2U=" + u2U +
        ", u2sU2=" + u2sU2 +
        ", l1Lu=" + l1Lu +
        ", l2L1=" + l2L1 +
        ", l3L2=" + l3L2 +
        ", l4L3=" + l4L3 +
        ", l5L4=" + l5L4 +
        ", note=" + note +
        ", operator=" + operator +
        ", director=" + director +
        ", designid=" + designid +
        ", createdate=" + createdate +
        "}";
    }
}
