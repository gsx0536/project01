package com.tieda.alarm.entity.testTsdc;

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
@TableName("TEST_TSDC")
public class TestTsdc implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    /**
     * 项目
     */
    @TableField("NAME")
    private String name;
    /**
     * 核对位置定位
     */
    @TableField("HDWZDW")
    private String hdwzdw;
    /**
     * 核对位置反位
     */
    @TableField("HDWZFW")
    private String hdwzfw;
    /**
     * 道岔断表示接点定位1
     */
    @TableField("DCDDW1")
    private String dcddw1;
    /**
     * 道岔断表示接点定位2
     */
    @TableField("DCDDW2")
    private String dcddw2;
    /**
     * 道岔断表示接点定位3
     */
    @TableField("DCDDW3")
    private String dcddw3;
    /**
     * 道岔断表示接点反位1
     */
    @TableField("DCDFW1")
    private String dcdfw1;
    /**
     * 道岔断表示接点反位2
     */
    @TableField("DCDFW2")
    private String dcdfw2;
    /**
     * 道岔断表示接点反位3
     */
    @TableField("DCDFW3")
    private String dcdfw3;
    /**
     * 断相保护A
     */
    @TableField("DXBH1")
    private String dxbh1;
    /**
     * 断相保护B
     */
    @TableField("DXBH2")
    private String dxbh2;
    /**
     * 断相保护C
     */
    @TableField("DXBH3")
    private String dxbh3;
    /**
     * 四毫米
试验定位
     */
    @TableField("SY4DW")
    private String sy4dw;
    /**
     * 四毫米
试验反位
     */
    @TableField("SY4FW")
    private String sy4fw;
    /**
     * 五、六、十毫米试验定位
     */
    @TableField("SY5610DW")
    private String sy5610dw;
    /**
     * 五、六、十毫米试验反位
     */
    @TableField("SY5610FW")
    private String sy5610fw;
    /**
     * 2DQJ、
D（F）BJ
及道岔表示一致定位
     */
    @TableField("DCBSYZDW")
    private String dcbsyzdw;
    /**
     * 2DQJ、
D（F）BJ
及道岔表示一致反位
     */
    @TableField("DCBSYZFW")
    private String dcbsyzfw;
    /**
     * 道岔锁闭单独
     */
    @TableField("DCSBDD")
    private String dcsbdd;
    /**
     * 道岔锁闭区段
     */
    @TableField("DCSBQD")
    private String dcsbqd;
    /**
     * 道岔锁闭进路
     */
    @TableField("DCSBJL")
    private String dcsbjl;
    /**
     * 道岔锁闭引导总锁
     */
    @TableField("DCSBYDZS")
    private String dcsbydzs;
    /**
     * 断遮断器定位
     */
    @TableField("DZDQDW")
    private String dzdqdw;
    /**
     * 断遮断器反位
     */
    @TableField("DZDQFW")
    private String dzdqfw;
    /**
     * 多机牵引总保护
     */
    @TableField("DJQY")
    private String djqy;
    /**
     * 多机牵引总表示及双断检查
     */
    @TableField("DJQYSD")
    private String djqysd;
    /**
     * 道岔自闭电路试验
     */
    @TableField("DCZBDL")
    private String dczbdl;
    /**
     * 道岔间互锁
     */
    @TableField("DCJHS")
    private String dcjhs;
    /**
     * 挤岔断表示报警
     */
    @TableField("JCD")
    private String jcd;
    /**
     * 13、30S
切
断
     */
    @TableField("QD")
    private String qd;
    /**
     * 密贴检查器断表示接点定位密贴1
     */
    @TableField("DWMT1")
    private String dwmt1;
    /**
     * 密贴检查器断表示接点定位密贴2
     */
    @TableField("DWMT2")
    private String dwmt2;
    /**
     * 密贴检查器断表示接点定位斥离1
     */
    @TableField("DWCL1")
    private String dwcl1;
    /**
     * 密贴检查器断表示接点定位斥离2
     */
    @TableField("DWCL2")
    private String dwcl2;
    /**
     * 密贴检查器断表示接点反位密贴1
     */
    @TableField("FWMT1")
    private String fwmt1;
    /**
     * 密贴检查器断表示接点反位密贴2
     */
    @TableField("FWMT2")
    private String fwmt2;
    /**
     * 密贴检查器断表示接点反位斥离1
     */
    @TableField("FWCL1")
    private String fwcl1;
    /**
     * 密贴检查器断表示接点反位斥离2
     */
    @TableField("FWCL2")
    private String fwcl2;
    /**
     * 断表示保险试验
     */
    @TableField("DBSBX")
    private String dbsbx;
    /**
     * 下拉装置试验
     */
    @TableField("XLZZ")
    private String xlzz;
    /**
     * 道岔区段前接点接入启动电路
     */
    @TableField("JDJRQD")
    private String jdjrqd;
    /**
     * 道岔被阻后转换试验
     */
    @TableField("DCBZ")
    private String dcbz;
    /**
     * DKJ、DWJ、FWJ试验
     */
    @TableField("DKJDWJFWJ")
    private String dkjdwjfwj;
    /**
     * 副机不到位主机不停转
     */
    @TableField("FJBDW")
    private String fjbdw;
    /**
     * 试  验  者
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
     * 道岔断表示接点定位4
     */
    @TableField("DCDDW4")
    private String dcddw4;
    /**
     * 道岔断表示接点反位4
     */
    @TableField("DCDFW4")
    private String dcdfw4;


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

    public String getHdwzdw() {
        return hdwzdw;
    }

    public void setHdwzdw(String hdwzdw) {
        this.hdwzdw = hdwzdw;
    }

    public String getHdwzfw() {
        return hdwzfw;
    }

    public void setHdwzfw(String hdwzfw) {
        this.hdwzfw = hdwzfw;
    }

    public String getDcddw1() {
        return dcddw1;
    }

    public void setDcddw1(String dcddw1) {
        this.dcddw1 = dcddw1;
    }

    public String getDcddw2() {
        return dcddw2;
    }

    public void setDcddw2(String dcddw2) {
        this.dcddw2 = dcddw2;
    }

    public String getDcddw3() {
        return dcddw3;
    }

    public void setDcddw3(String dcddw3) {
        this.dcddw3 = dcddw3;
    }

    public String getDcdfw1() {
        return dcdfw1;
    }

    public void setDcdfw1(String dcdfw1) {
        this.dcdfw1 = dcdfw1;
    }

    public String getDcdfw2() {
        return dcdfw2;
    }

    public void setDcdfw2(String dcdfw2) {
        this.dcdfw2 = dcdfw2;
    }

    public String getDcdfw3() {
        return dcdfw3;
    }

    public void setDcdfw3(String dcdfw3) {
        this.dcdfw3 = dcdfw3;
    }

    public String getDxbh1() {
        return dxbh1;
    }

    public void setDxbh1(String dxbh1) {
        this.dxbh1 = dxbh1;
    }

    public String getDxbh2() {
        return dxbh2;
    }

    public void setDxbh2(String dxbh2) {
        this.dxbh2 = dxbh2;
    }

    public String getDxbh3() {
        return dxbh3;
    }

    public void setDxbh3(String dxbh3) {
        this.dxbh3 = dxbh3;
    }

    public String getSy4dw() {
        return sy4dw;
    }

    public void setSy4dw(String sy4dw) {
        this.sy4dw = sy4dw;
    }

    public String getSy4fw() {
        return sy4fw;
    }

    public void setSy4fw(String sy4fw) {
        this.sy4fw = sy4fw;
    }

    public String getSy5610dw() {
        return sy5610dw;
    }

    public void setSy5610dw(String sy5610dw) {
        this.sy5610dw = sy5610dw;
    }

    public String getSy5610fw() {
        return sy5610fw;
    }

    public void setSy5610fw(String sy5610fw) {
        this.sy5610fw = sy5610fw;
    }

    public String getDcbsyzdw() {
        return dcbsyzdw;
    }

    public void setDcbsyzdw(String dcbsyzdw) {
        this.dcbsyzdw = dcbsyzdw;
    }

    public String getDcbsyzfw() {
        return dcbsyzfw;
    }

    public void setDcbsyzfw(String dcbsyzfw) {
        this.dcbsyzfw = dcbsyzfw;
    }

    public String getDcsbdd() {
        return dcsbdd;
    }

    public void setDcsbdd(String dcsbdd) {
        this.dcsbdd = dcsbdd;
    }

    public String getDcsbqd() {
        return dcsbqd;
    }

    public void setDcsbqd(String dcsbqd) {
        this.dcsbqd = dcsbqd;
    }

    public String getDcsbjl() {
        return dcsbjl;
    }

    public void setDcsbjl(String dcsbjl) {
        this.dcsbjl = dcsbjl;
    }

    public String getDcsbydzs() {
        return dcsbydzs;
    }

    public void setDcsbydzs(String dcsbydzs) {
        this.dcsbydzs = dcsbydzs;
    }

    public String getDzdqdw() {
        return dzdqdw;
    }

    public void setDzdqdw(String dzdqdw) {
        this.dzdqdw = dzdqdw;
    }

    public String getDzdqfw() {
        return dzdqfw;
    }

    public void setDzdqfw(String dzdqfw) {
        this.dzdqfw = dzdqfw;
    }

    public String getDjqy() {
        return djqy;
    }

    public void setDjqy(String djqy) {
        this.djqy = djqy;
    }

    public String getDjqysd() {
        return djqysd;
    }

    public void setDjqysd(String djqysd) {
        this.djqysd = djqysd;
    }

    public String getDczbdl() {
        return dczbdl;
    }

    public void setDczbdl(String dczbdl) {
        this.dczbdl = dczbdl;
    }

    public String getDcjhs() {
        return dcjhs;
    }

    public void setDcjhs(String dcjhs) {
        this.dcjhs = dcjhs;
    }

    public String getJcd() {
        return jcd;
    }

    public void setJcd(String jcd) {
        this.jcd = jcd;
    }

    public String getQd() {
        return qd;
    }

    public void setQd(String qd) {
        this.qd = qd;
    }

    public String getDwmt1() {
        return dwmt1;
    }

    public void setDwmt1(String dwmt1) {
        this.dwmt1 = dwmt1;
    }

    public String getDwmt2() {
        return dwmt2;
    }

    public void setDwmt2(String dwmt2) {
        this.dwmt2 = dwmt2;
    }

    public String getDwcl1() {
        return dwcl1;
    }

    public void setDwcl1(String dwcl1) {
        this.dwcl1 = dwcl1;
    }

    public String getDwcl2() {
        return dwcl2;
    }

    public void setDwcl2(String dwcl2) {
        this.dwcl2 = dwcl2;
    }

    public String getFwmt1() {
        return fwmt1;
    }

    public void setFwmt1(String fwmt1) {
        this.fwmt1 = fwmt1;
    }

    public String getFwmt2() {
        return fwmt2;
    }

    public void setFwmt2(String fwmt2) {
        this.fwmt2 = fwmt2;
    }

    public String getFwcl1() {
        return fwcl1;
    }

    public void setFwcl1(String fwcl1) {
        this.fwcl1 = fwcl1;
    }

    public String getFwcl2() {
        return fwcl2;
    }

    public void setFwcl2(String fwcl2) {
        this.fwcl2 = fwcl2;
    }

    public String getDbsbx() {
        return dbsbx;
    }

    public void setDbsbx(String dbsbx) {
        this.dbsbx = dbsbx;
    }

    public String getXlzz() {
        return xlzz;
    }

    public void setXlzz(String xlzz) {
        this.xlzz = xlzz;
    }

    public String getJdjrqd() {
        return jdjrqd;
    }

    public void setJdjrqd(String jdjrqd) {
        this.jdjrqd = jdjrqd;
    }

    public String getDcbz() {
        return dcbz;
    }

    public void setDcbz(String dcbz) {
        this.dcbz = dcbz;
    }

    public String getDkjdwjfwj() {
        return dkjdwjfwj;
    }

    public void setDkjdwjfwj(String dkjdwjfwj) {
        this.dkjdwjfwj = dkjdwjfwj;
    }

    public String getFjbdw() {
        return fjbdw;
    }

    public void setFjbdw(String fjbdw) {
        this.fjbdw = fjbdw;
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

    public String getDcddw4() {
        return dcddw4;
    }

    public void setDcddw4(String dcddw4) {
        this.dcddw4 = dcddw4;
    }

    public String getDcdfw4() {
        return dcdfw4;
    }

    public void setDcdfw4(String dcdfw4) {
        this.dcdfw4 = dcdfw4;
    }

    @Override
    public String toString() {
        return "TestTsdc{" +
        "id=" + id +
        ", name=" + name +
        ", hdwzdw=" + hdwzdw +
        ", hdwzfw=" + hdwzfw +
        ", dcddw1=" + dcddw1 +
        ", dcddw2=" + dcddw2 +
        ", dcddw3=" + dcddw3 +
        ", dcdfw1=" + dcdfw1 +
        ", dcdfw2=" + dcdfw2 +
        ", dcdfw3=" + dcdfw3 +
        ", dxbh1=" + dxbh1 +
        ", dxbh2=" + dxbh2 +
        ", dxbh3=" + dxbh3 +
        ", sy4dw=" + sy4dw +
        ", sy4fw=" + sy4fw +
        ", sy5610dw=" + sy5610dw +
        ", sy5610fw=" + sy5610fw +
        ", dcbsyzdw=" + dcbsyzdw +
        ", dcbsyzfw=" + dcbsyzfw +
        ", dcsbdd=" + dcsbdd +
        ", dcsbqd=" + dcsbqd +
        ", dcsbjl=" + dcsbjl +
        ", dcsbydzs=" + dcsbydzs +
        ", dzdqdw=" + dzdqdw +
        ", dzdqfw=" + dzdqfw +
        ", djqy=" + djqy +
        ", djqysd=" + djqysd +
        ", dczbdl=" + dczbdl +
        ", dcjhs=" + dcjhs +
        ", jcd=" + jcd +
        ", qd=" + qd +
        ", dwmt1=" + dwmt1 +
        ", dwmt2=" + dwmt2 +
        ", dwcl1=" + dwcl1 +
        ", dwcl2=" + dwcl2 +
        ", fwmt1=" + fwmt1 +
        ", fwmt2=" + fwmt2 +
        ", fwcl1=" + fwcl1 +
        ", fwcl2=" + fwcl2 +
        ", dbsbx=" + dbsbx +
        ", xlzz=" + xlzz +
        ", jdjrqd=" + jdjrqd +
        ", dcbz=" + dcbz +
        ", dkjdwjfwj=" + dkjdwjfwj +
        ", fjbdw=" + fjbdw +
        ", operator=" + operator +
        ", director=" + director +
        ", designid=" + designid +
        ", createdate=" + createdate +
        ", dcddw4=" + dcddw4 +
        ", dcdfw4=" + dcdfw4 +
        "}";
    }
}
