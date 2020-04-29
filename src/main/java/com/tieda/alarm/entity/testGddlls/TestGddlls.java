package com.tieda.alarm.entity.testGddlls;

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
 * @since 2019-10-11
 */
@TableName("TEST_GDDLLS")
public class TestGddlls implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    /**
     * 项目
     */
    @TableField("NAME")
    private String name;
    /**
     * 区段核对
     */
    @TableField("QDHD")
    private String qdhd;
    /**
     * 区段核对1对多
     */
    @TableField("QDHDD")
    private String qdhdd;
    /**
     * 极性交叉
     */
    @TableField("JXJC")
    private String jxjc;
    /**
     * 极性交叉1对多
     */
    @TableField("JXJCD")
    private String jxjcd;
    /**
     * 分路残压
     */
    @TableField("FLCY")
    private String flcy;
    /**
     * 分路残压1对多
     */
    @TableField("FLCYD")
    private String flcyd;
    /**
     * 绝缘节侵限检查
     */
    @TableField("JYJQX")
    private String jyjqx;
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
     * 时间
     */
    @TableField("CREATEDATE")
    private Date createdate;
    /**
     * 主持试验人
     */
    @TableField("CHARGE")
    private String charge;
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

    public String getQdhd() {
        return qdhd;
    }

    public void setQdhd(String qdhd) {
        this.qdhd = qdhd;
    }

    public String getQdhdd() {
        return qdhdd;
    }

    public void setQdhdd(String qdhdd) {
        this.qdhdd = qdhdd;
    }

    public String getJxjc() {
        return jxjc;
    }

    public void setJxjc(String jxjc) {
        this.jxjc = jxjc;
    }

    public String getJxjcd() {
        return jxjcd;
    }

    public void setJxjcd(String jxjcd) {
        this.jxjcd = jxjcd;
    }

    public String getFlcy() {
        return flcy;
    }

    public void setFlcy(String flcy) {
        this.flcy = flcy;
    }

    public String getFlcyd() {
        return flcyd;
    }

    public void setFlcyd(String flcyd) {
        this.flcyd = flcyd;
    }

    public String getJyjqx() {
        return jyjqx;
    }

    public void setJyjqx(String jyjqx) {
        this.jyjqx = jyjqx;
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

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
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

    @Override
    public String toString() {
        return "TestGddlls{" +
        "id=" + id +
        ", name=" + name +
        ", qdhd=" + qdhd +
        ", qdhdd=" + qdhdd +
        ", jxjc=" + jxjc +
        ", jxjcd=" + jxjcd +
        ", flcy=" + flcy +
        ", flcyd=" + flcyd +
        ", jyjqx=" + jyjqx +
        ", note=" + note +
        ", operator=" + operator +
        ", createdate=" + createdate +
        ", charge=" + charge +
        ", stationname=" + stationname +
        ", director=" + director +
        "}";
    }
}
