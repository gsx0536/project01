package com.tieda.alarm.entity.testLiansuoCheck;

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
 * @since 2019-09-28
 */
@TableName("TEST_LIANSUO_CHECK")
public class TestLiansuoCheck implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    /**
     * 进路号
     */
    @TableField("CODE")
    private String code;
    /**
     * 进路名称



     */
    @TableField("NAME")
    private String name;
    /**
     * 接近区段有限速
进站信号机显示降为UU，码降为UU码

     */
    @TableField("WJZC_JJQDYXS")
    private String wjzcJjqdyxs;
    /**
     * 接车进路有限速	
进站信号机显示降为UU，码降为UU码	
     */
    @TableField("WJZC_JCJLYXS_D")
    private String wjzcJcjlyxsD;
    /**
     * 出站信号机显示及码保持不变

     */
    @TableField("WJZC_JCJLYXS")
    private String wjzcJcjlyxs;
    /**
     * 发车进路有限速	
进站信号机显示降为UU，码降为UU码	

     */
    @TableField("WJZC_FCJLYXS_D")
    private String wjzcFcjlyxsD;
    /**
     * 出站信号机显示及码保持不变

     */
    @TableField("WJZC_FCJLYXS")
    private String wjzcFcjlyxs;
    /**
     * 离去L1有限速	
进站信号机显示降为UU，码降为UU码
     */
    @TableField("WJZC_LQL1YXS_D")
    private String wjzcLql1yxsD;
    /**
     * 出站信号机显示及码保持不变

     */
    @TableField("WJZC_LQL1YXS")
    private String wjzcLql1yxs;
    /**
     * 接近区段有限速
进站信号机显示降为UU，码降为UU码

     */
    @TableField("WJWC_F_JJQDYXS")
    private String wjwcFJjqdyxs;
    /**
     * 接车进路有限速	
进站信号机显示降为UU，码降为UU码
     */
    @TableField("WJWC_F_JCJLYXS_D")
    private String wjwcFJcjlyxsD;
    /**
     * 出站信号机显示及码保持不变
     */
    @TableField("WJWC_F_JCJLYXS")
    private String wjwcFJcjlyxs;
    /**
     * 出站信号机显示保持不变，码降为UU
     */
    @TableField("WJWC_F_FCJLYXS_D")
    private String wjwcFFcjlyxsD;
    /**
     * 站信号机显示保持不变，码降为UU
     */
    @TableField("WJWC_F_LQL1YXS_D")
    private String wjwcFLql1yxsD;
    /**
     * 离去L1有限速	
进站信号机显示及码保持不变	出
     */
    @TableField("WJWC_F_LQL1YXS")
    private String wjwcFLql1yxs;
    /**
     * 侧线有限速	
进站信号机显示降为UU，码降为UU码	出
     */
    @TableField("WJWC_F_CXYXS_D")
    private String wjwcFCxyxsD;
    /**
     * 站信号机显示保持不变，码降为UU

     */
    @TableField("WJWC_F_CXYXS")
    private String wjwcFCxyxs;
    /**
     * 接近区段有限速
进站信号机显示降为UU，码降为UU码

     */
    @TableField("WJWC_C_JJQDXS_D")
    private String wjwcCJjqdxsD;
    /**
     * 接车进路有限速
进站信号机显示降为UU，码降为UU码

     */
    @TableField("WJWC_C_JCJLYXS_D")
    private String wjwcCJcjlyxsD;
    /**
     * 发车进路有限速
出站信号机显示及码保持不变

     */
    @TableField("WJWC_C_FCJLYXS")
    private String wjwcCFcjlyxs;
    /**
     * 离去L1有限速
出站信号机显示及码保持不变
     */
    @TableField("WJWC_C_LQL1YXS")
    private String wjwcCLql1yxs;
    /**
     * 侧线有限速
进站信号机显示降为UU，码降为UU码

     */
    @TableField("WJWC_C_CXYXS_D")
    private String wjwcCCxyxsD;
    /**
     * 股道有限速	
进站信号机显示不变，码码降为U2码	
     */
    @TableField("ZJWC_GDYXS_JZ")
    private String zjwcGdyxsJz;
    /**
     * 出站信号机显示不变，码降为UU码

     */
    @TableField("ZJWC_GDYXS_CZ")
    private String zjwcGdyxsCz;
    /**
     * 发车进路有限速	
进站信号机显示不变，码降为U2码
     */
    @TableField("ZJWC_FCJLYXS_JZ")
    private String zjwcFcjlyxsJz;
    /**
     * 	出站信号机显示不变，码降为UU码

     */
    @TableField("ZJWC_FCJLYXS_CZ")
    private String zjwcFcjlyxsCz;
    /**
     * 离去L1有限速	
进站信号机显示不变，码降为U2码
     */
    @TableField("ZJWC_LQL1YXS_JZ")
    private String zjwcLql1yxsJz;
    /**
     * 出站信号机显示不变，码降为UU码
     */
    @TableField("ZJWC_LQL1YXS_CZ")
    private String zjwcLql1yxsCz;
    /**
     * 列控中心重启且在初始化前，USU显示与低频均降为UU
     */
    @TableField("LKZX")
    private String lkzx;
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
     * 发车进路有限速	
进站信号机显示及码保持不变	
     */
    @TableField("WJWC_F_FCJLYXS")
    private String wjwcFFcjlyxs;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWjzcJjqdyxs() {
        return wjzcJjqdyxs;
    }

    public void setWjzcJjqdyxs(String wjzcJjqdyxs) {
        this.wjzcJjqdyxs = wjzcJjqdyxs;
    }

    public String getWjzcJcjlyxsD() {
        return wjzcJcjlyxsD;
    }

    public void setWjzcJcjlyxsD(String wjzcJcjlyxsD) {
        this.wjzcJcjlyxsD = wjzcJcjlyxsD;
    }

    public String getWjzcJcjlyxs() {
        return wjzcJcjlyxs;
    }

    public void setWjzcJcjlyxs(String wjzcJcjlyxs) {
        this.wjzcJcjlyxs = wjzcJcjlyxs;
    }

    public String getWjzcFcjlyxsD() {
        return wjzcFcjlyxsD;
    }

    public void setWjzcFcjlyxsD(String wjzcFcjlyxsD) {
        this.wjzcFcjlyxsD = wjzcFcjlyxsD;
    }

    public String getWjzcFcjlyxs() {
        return wjzcFcjlyxs;
    }

    public void setWjzcFcjlyxs(String wjzcFcjlyxs) {
        this.wjzcFcjlyxs = wjzcFcjlyxs;
    }

    public String getWjzcLql1yxsD() {
        return wjzcLql1yxsD;
    }

    public void setWjzcLql1yxsD(String wjzcLql1yxsD) {
        this.wjzcLql1yxsD = wjzcLql1yxsD;
    }

    public String getWjzcLql1yxs() {
        return wjzcLql1yxs;
    }

    public void setWjzcLql1yxs(String wjzcLql1yxs) {
        this.wjzcLql1yxs = wjzcLql1yxs;
    }

    public String getWjwcFJjqdyxs() {
        return wjwcFJjqdyxs;
    }

    public void setWjwcFJjqdyxs(String wjwcFJjqdyxs) {
        this.wjwcFJjqdyxs = wjwcFJjqdyxs;
    }

    public String getWjwcFJcjlyxsD() {
        return wjwcFJcjlyxsD;
    }

    public void setWjwcFJcjlyxsD(String wjwcFJcjlyxsD) {
        this.wjwcFJcjlyxsD = wjwcFJcjlyxsD;
    }

    public String getWjwcFJcjlyxs() {
        return wjwcFJcjlyxs;
    }

    public void setWjwcFJcjlyxs(String wjwcFJcjlyxs) {
        this.wjwcFJcjlyxs = wjwcFJcjlyxs;
    }

    public String getWjwcFFcjlyxsD() {
        return wjwcFFcjlyxsD;
    }

    public void setWjwcFFcjlyxsD(String wjwcFFcjlyxsD) {
        this.wjwcFFcjlyxsD = wjwcFFcjlyxsD;
    }

    public String getWjwcFLql1yxsD() {
        return wjwcFLql1yxsD;
    }

    public void setWjwcFLql1yxsD(String wjwcFLql1yxsD) {
        this.wjwcFLql1yxsD = wjwcFLql1yxsD;
    }

    public String getWjwcFLql1yxs() {
        return wjwcFLql1yxs;
    }

    public void setWjwcFLql1yxs(String wjwcFLql1yxs) {
        this.wjwcFLql1yxs = wjwcFLql1yxs;
    }

    public String getWjwcFCxyxsD() {
        return wjwcFCxyxsD;
    }

    public void setWjwcFCxyxsD(String wjwcFCxyxsD) {
        this.wjwcFCxyxsD = wjwcFCxyxsD;
    }

    public String getWjwcFCxyxs() {
        return wjwcFCxyxs;
    }

    public void setWjwcFCxyxs(String wjwcFCxyxs) {
        this.wjwcFCxyxs = wjwcFCxyxs;
    }

    public String getWjwcCJjqdxsD() {
        return wjwcCJjqdxsD;
    }

    public void setWjwcCJjqdxsD(String wjwcCJjqdxsD) {
        this.wjwcCJjqdxsD = wjwcCJjqdxsD;
    }

    public String getWjwcCJcjlyxsD() {
        return wjwcCJcjlyxsD;
    }

    public void setWjwcCJcjlyxsD(String wjwcCJcjlyxsD) {
        this.wjwcCJcjlyxsD = wjwcCJcjlyxsD;
    }

    public String getWjwcCFcjlyxs() {
        return wjwcCFcjlyxs;
    }

    public void setWjwcCFcjlyxs(String wjwcCFcjlyxs) {
        this.wjwcCFcjlyxs = wjwcCFcjlyxs;
    }

    public String getWjwcCLql1yxs() {
        return wjwcCLql1yxs;
    }

    public void setWjwcCLql1yxs(String wjwcCLql1yxs) {
        this.wjwcCLql1yxs = wjwcCLql1yxs;
    }

    public String getWjwcCCxyxsD() {
        return wjwcCCxyxsD;
    }

    public void setWjwcCCxyxsD(String wjwcCCxyxsD) {
        this.wjwcCCxyxsD = wjwcCCxyxsD;
    }

    public String getZjwcGdyxsJz() {
        return zjwcGdyxsJz;
    }

    public void setZjwcGdyxsJz(String zjwcGdyxsJz) {
        this.zjwcGdyxsJz = zjwcGdyxsJz;
    }

    public String getZjwcGdyxsCz() {
        return zjwcGdyxsCz;
    }

    public void setZjwcGdyxsCz(String zjwcGdyxsCz) {
        this.zjwcGdyxsCz = zjwcGdyxsCz;
    }

    public String getZjwcFcjlyxsJz() {
        return zjwcFcjlyxsJz;
    }

    public void setZjwcFcjlyxsJz(String zjwcFcjlyxsJz) {
        this.zjwcFcjlyxsJz = zjwcFcjlyxsJz;
    }

    public String getZjwcFcjlyxsCz() {
        return zjwcFcjlyxsCz;
    }

    public void setZjwcFcjlyxsCz(String zjwcFcjlyxsCz) {
        this.zjwcFcjlyxsCz = zjwcFcjlyxsCz;
    }

    public String getZjwcLql1yxsJz() {
        return zjwcLql1yxsJz;
    }

    public void setZjwcLql1yxsJz(String zjwcLql1yxsJz) {
        this.zjwcLql1yxsJz = zjwcLql1yxsJz;
    }

    public String getZjwcLql1yxsCz() {
        return zjwcLql1yxsCz;
    }

    public void setZjwcLql1yxsCz(String zjwcLql1yxsCz) {
        this.zjwcLql1yxsCz = zjwcLql1yxsCz;
    }

    public String getLkzx() {
        return lkzx;
    }

    public void setLkzx(String lkzx) {
        this.lkzx = lkzx;
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

    public String getWjwcFFcjlyxs() {
        return wjwcFFcjlyxs;
    }

    public void setWjwcFFcjlyxs(String wjwcFFcjlyxs) {
        this.wjwcFFcjlyxs = wjwcFFcjlyxs;
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
        return "TestLiansuoCheck{" +
        "id=" + id +
        ", code=" + code +
        ", name=" + name +
        ", wjzcJjqdyxs=" + wjzcJjqdyxs +
        ", wjzcJcjlyxsD=" + wjzcJcjlyxsD +
        ", wjzcJcjlyxs=" + wjzcJcjlyxs +
        ", wjzcFcjlyxsD=" + wjzcFcjlyxsD +
        ", wjzcFcjlyxs=" + wjzcFcjlyxs +
        ", wjzcLql1yxsD=" + wjzcLql1yxsD +
        ", wjzcLql1yxs=" + wjzcLql1yxs +
        ", wjwcFJjqdyxs=" + wjwcFJjqdyxs +
        ", wjwcFJcjlyxsD=" + wjwcFJcjlyxsD +
        ", wjwcFJcjlyxs=" + wjwcFJcjlyxs +
        ", wjwcFFcjlyxsD=" + wjwcFFcjlyxsD +
        ", wjwcFLql1yxsD=" + wjwcFLql1yxsD +
        ", wjwcFLql1yxs=" + wjwcFLql1yxs +
        ", wjwcFCxyxsD=" + wjwcFCxyxsD +
        ", wjwcFCxyxs=" + wjwcFCxyxs +
        ", wjwcCJjqdxsD=" + wjwcCJjqdxsD +
        ", wjwcCJcjlyxsD=" + wjwcCJcjlyxsD +
        ", wjwcCFcjlyxs=" + wjwcCFcjlyxs +
        ", wjwcCLql1yxs=" + wjwcCLql1yxs +
        ", wjwcCCxyxsD=" + wjwcCCxyxsD +
        ", zjwcGdyxsJz=" + zjwcGdyxsJz +
        ", zjwcGdyxsCz=" + zjwcGdyxsCz +
        ", zjwcFcjlyxsJz=" + zjwcFcjlyxsJz +
        ", zjwcFcjlyxsCz=" + zjwcFcjlyxsCz +
        ", zjwcLql1yxsJz=" + zjwcLql1yxsJz +
        ", zjwcLql1yxsCz=" + zjwcLql1yxsCz +
        ", lkzx=" + lkzx +
        ", operator=" + operator +
        ", createdate=" + createdate +
        ", charge=" + charge +
        ", wjwcFFcjlyxs=" + wjwcFFcjlyxs +
        ", stationname=" + stationname +
        ", director=" + director +
        "}";
    }
}
