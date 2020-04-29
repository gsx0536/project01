package com.tieda.alarm.entity.testLkJh;

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
 * @since 2019-10-09
 */
@TableName("TEST_LK_JH")
public class TestLkJh implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    /**
     * 方向电路名称
     */
    @TableField("NAME")
    private String name;
    /**
     * 站内
各区段发码方向应先置为默认方向（所有FQJ落下）


     */
    @TableField("INSIDE")
    private String inside;
    /**
     * 邻站为发车方向，则本站初始化为接车方向

     */
    @TableField("LZFC")
    private String lzfc;
    /**
     * 邻站为接车方向，本站FJ为发车方向，则本站初始化为发车方向

     */
    @TableField("LZJC")
    private String lzjc;
    /**
     * 上电初始化6秒内，未满足上述条件完成本站方向初始化，则本站初始化为无方向

     */
    @TableField("ZJTXZC")
    private String zjtxzc;
    /**
     * 本站初始化为无方向

     */
    @TableField("ZJTXZD")
    private String zjtxzd;
    /**
     * 与主站通信正常，则本中继站与主站方向一致


     */
    @TableField("ZJZ_YZ")
    private String zjzYz;
    /**
     * 与主站通信中断，则本中继站始化为无方向


     */
    @TableField("ZJZ_WFX")
    private String zjzWfx;
    /**
     * 车站与相邻车站或所属中继站通信中断后，本车站区间方向维持中断前方向不变




     */
    @TableField("ZDBZBB")
    private String zdbzbb;
    /**
     * 中继站与主站通信中断后，区间方向维持中断前方向不变




     */
    @TableField("ZDQJBB")
    private String zdqjbb;
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

    @TableField("DESIGNID")
    private String designId;


    public String getDesignId() {
        return designId;
    }

    public void setDesignId(String designId) {
        this.designId = designId;
    }

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

    public String getInside() {
        return inside;
    }

    public void setInside(String inside) {
        this.inside = inside;
    }

    public String getLzfc() {
        return lzfc;
    }

    public void setLzfc(String lzfc) {
        this.lzfc = lzfc;
    }

    public String getLzjc() {
        return lzjc;
    }

    public void setLzjc(String lzjc) {
        this.lzjc = lzjc;
    }

    public String getZjtxzc() {
        return zjtxzc;
    }

    public void setZjtxzc(String zjtxzc) {
        this.zjtxzc = zjtxzc;
    }

    public String getZjtxzd() {
        return zjtxzd;
    }

    public void setZjtxzd(String zjtxzd) {
        this.zjtxzd = zjtxzd;
    }

    public String getZjzYz() {
        return zjzYz;
    }

    public void setZjzYz(String zjzYz) {
        this.zjzYz = zjzYz;
    }

    public String getZjzWfx() {
        return zjzWfx;
    }

    public void setZjzWfx(String zjzWfx) {
        this.zjzWfx = zjzWfx;
    }

    public String getZdbzbb() {
        return zdbzbb;
    }

    public void setZdbzbb(String zdbzbb) {
        this.zdbzbb = zdbzbb;
    }

    public String getZdqjbb() {
        return zdqjbb;
    }

    public void setZdqjbb(String zdqjbb) {
        this.zdqjbb = zdqjbb;
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
        return "TestLkJh{" +
        "id=" + id +
        ", name=" + name +
        ", inside=" + inside +
        ", lzfc=" + lzfc +
        ", lzjc=" + lzjc +
        ", zjtxzc=" + zjtxzc +
        ", zjtxzd=" + zjtxzd +
        ", zjzYz=" + zjzYz +
        ", zjzWfx=" + zjzWfx +
        ", zdbzbb=" + zdbzbb +
        ", zdqjbb=" + zdqjbb +
        ", note=" + note +
        ", operator=" + operator +
        ", createdate=" + createdate +
        ", charge=" + charge +
        ", stationname=" + stationname +
        ", director=" + director +
        "}";
    }
}
