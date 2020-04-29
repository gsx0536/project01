package com.tieda.alarm.entity.testJjsb;

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
@TableName("TEST_JJSB")
public class TestJjsb implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    /**
     * 信号机名称
     */
    @TableField("XHJMC")
    private String xhjmc;
    /**
     * 一接近
     */
    @TableField("JJ1")
    private String jj1;
    /**
     * 二接近
     */
    @TableField("JJ2")
    private String jj2;
    /**
     * 三接近
     */
    @TableField("JJ3")
    private String jj3;
    /**
     * 四接近
     */
    @TableField("JJ4")
    private String jj4;
    /**
     * 五接近
     */
    @TableField("JJ5")
    private String jj5;
    /**
     * 六接近
     */
    @TableField("JJ6")
    private String jj6;
    /**
     * 七接近
     */
    @TableField("JJ7")
    private String jj7;
    /**
     * 八接近
     */
    @TableField("JJ8")
    private String jj8;
    /**
     * 九接近
     */
    @TableField("JJ9")
    private String jj9;
    /**
     * 十接近
     */
    @TableField("JJ10")
    private String jj10;
    /**
     * 正线出站信号机接近延长试验
     */
    @TableField("JJYCSY")
    private String jjycsy;
    /**
     * 弯进弯出或弯进直出时发车进路接近区段延长至进站内方
     */
    @TableField("WJWC")
    private String wjwc;
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

    public String getXhjmc() {
        return xhjmc;
    }

    public void setXhjmc(String xhjmc) {
        this.xhjmc = xhjmc;
    }

    public String getJj1() {
        return jj1;
    }

    public void setJj1(String jj1) {
        this.jj1 = jj1;
    }

    public String getJj2() {
        return jj2;
    }

    public void setJj2(String jj2) {
        this.jj2 = jj2;
    }

    public String getJj3() {
        return jj3;
    }

    public void setJj3(String jj3) {
        this.jj3 = jj3;
    }

    public String getJj4() {
        return jj4;
    }

    public void setJj4(String jj4) {
        this.jj4 = jj4;
    }

    public String getJj5() {
        return jj5;
    }

    public void setJj5(String jj5) {
        this.jj5 = jj5;
    }

    public String getJj6() {
        return jj6;
    }

    public void setJj6(String jj6) {
        this.jj6 = jj6;
    }

    public String getJj7() {
        return jj7;
    }

    public void setJj7(String jj7) {
        this.jj7 = jj7;
    }

    public String getJj8() {
        return jj8;
    }

    public void setJj8(String jj8) {
        this.jj8 = jj8;
    }

    public String getJj9() {
        return jj9;
    }

    public void setJj9(String jj9) {
        this.jj9 = jj9;
    }

    public String getJj10() {
        return jj10;
    }

    public void setJj10(String jj10) {
        this.jj10 = jj10;
    }

    public String getJjycsy() {
        return jjycsy;
    }

    public void setJjycsy(String jjycsy) {
        this.jjycsy = jjycsy;
    }

    public String getWjwc() {
        return wjwc;
    }

    public void setWjwc(String wjwc) {
        this.wjwc = wjwc;
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
        return "TestJjsb{" +
        "id=" + id +
        ", xhjmc=" + xhjmc +
        ", jj1=" + jj1 +
        ", jj2=" + jj2 +
        ", jj3=" + jj3 +
        ", jj4=" + jj4 +
        ", jj5=" + jj5 +
        ", jj6=" + jj6 +
        ", jj7=" + jj7 +
        ", jj8=" + jj8 +
        ", jj9=" + jj9 +
        ", jj10=" + jj10 +
        ", jjycsy=" + jjycsy +
        ", wjwc=" + wjwc +
        ", note=" + note +
        ", operator=" + operator +
        ", director=" + director +
        ", designid=" + designid +
        ", createdate=" + createdate +
        "}";
    }
}
