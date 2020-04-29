package com.tieda.alarm.entity.testPtdc;

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
@TableName("TEST_PTDC")
public class TestPtdc implements Serializable {

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
    @TableField("DW")
    private String dw;
    /**
     * 核对位置反位
     */
    @TableField("FW")
    private String fw;
    /**
     * 断表示接点定位1
     */
    @TableField("DW1")
    private String dw1;
    /**
     * 断表示接点定位2
     */
    @TableField("DW2")
    private String dw2;
    /**
     * 断表示接点定位3
     */
    @TableField("DW3")
    private String dw3;
    /**
     * 断表示接点反位1
     */
    @TableField("FW1")
    private String fw1;
    /**
     * 断表示接点反位2
     */
    @TableField("FW2")
    private String fw2;
    /**
     * 断表示接点反位3
     */
    @TableField("FW3")
    private String fw3;
    /**
     * 断移位接触器定位
     */
    @TableField("DYWJQDW")
    private String dywjqdw;
    /**
     * 断移位接触器反位
     */
    @TableField("DYWJQFW")
    private String dywjqfw;
    /**
     * 4、6、10毫米  试验定位
     */
    @TableField("DW4610")
    private String dw4610;
    /**
     * 4、6、10毫米  试验反位
     */
    @TableField("FW4610")
    private String fw4610;
    /**
     * 道岔被阻后转换试验定位
     */
    @TableField("DCBZDW")
    private String dcbzdw;
    /**
     * 道岔被阻后转换试验反位
     */
    @TableField("DCBZFW")
    private String dcbzfw;
    /**
     * 断遮   断器定位
     */
    @TableField("DZDQDW")
    private String dzdqdw;
    /**
     * 断遮   断器反位
     */
    @TableField("DZDQFW")
    private String dzdqfw;
    /**
     * 断启动保险道岔不能扳动定位
     */
    @TableField("DQDBXDW")
    private String dqdbxdw;
    /**
     * 断启动保险道岔不能扳动反位
     */
    @TableField("DQDBXFW")
    private String dqdbxfw;
    /**
     * 2DQJ、D(F)BJ及道岔表示一致定位
     */
    @TableField("DCBYZDW")
    private String dcbyzdw;
    /**
     * 2DQJ、D(F)BJ及道岔表示一致反位
     */
    @TableField("DCBYZFW")
    private String dcbyzfw;
    /**
     * 断表示器的表示接点定位
     */
    @TableField("BSJDDW")
    private String bsjddw;
    /**
     * 断表示器的表示接点反位
     */
    @TableField("BSJDFW")
    private String bsjdfw;
    /**
     * 道岔锁闭单 独
     */
    @TableField("DCSBDD")
    private String dcsbdd;
    /**
     * 道岔锁闭区 段
     */
    @TableField("DCSBQD")
    private String dcsbqd;
    /**
     * 道岔锁闭进 路
     */
    @TableField("DCSBJL")
    private String dcsbjl;
    /**
     * 道岔锁闭引导总锁
     */
    @TableField("DCSBYDZS")
    private String dcsbydzs;
    /**
     * 道岔自闭电路试验
     */
    @TableField("DCZBDL")
    private String dczbdl;
    /**
     * 道岔间互锁
     */
    @TableField("DCHS")
    private String dchs;
    /**
     * 挤岔断表示报警
     */
    @TableField("JCDBSBJ")
    private String jcdbsbj;
    /**
     * 末端二极管核对
     */
    @TableField("MDEJGHD")
    private String mdejghd;
    /**
     * 多机牵引总表示及双断检查
     */
    @TableField("DJQY")
    private String djqy;
    /**
     * 断表示保险试验
     */
    @TableField("DBSBX")
    private String dbsbx;
    /**
     * 动作限时保护试验
     */
    @TableField("DZXS")
    private String dzxs;
    /**
     * 道岔区段前接点接入启动电路
     */
    @TableField("JLQDQ")
    private String jlqdq;
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

    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
        this.dw = dw;
    }

    public String getFw() {
        return fw;
    }

    public void setFw(String fw) {
        this.fw = fw;
    }

    public String getDw1() {
        return dw1;
    }

    public void setDw1(String dw1) {
        this.dw1 = dw1;
    }

    public String getDw2() {
        return dw2;
    }

    public void setDw2(String dw2) {
        this.dw2 = dw2;
    }

    public String getDw3() {
        return dw3;
    }

    public void setDw3(String dw3) {
        this.dw3 = dw3;
    }

    public String getFw1() {
        return fw1;
    }

    public void setFw1(String fw1) {
        this.fw1 = fw1;
    }

    public String getFw2() {
        return fw2;
    }

    public void setFw2(String fw2) {
        this.fw2 = fw2;
    }

    public String getFw3() {
        return fw3;
    }

    public void setFw3(String fw3) {
        this.fw3 = fw3;
    }

    public String getDywjqdw() {
        return dywjqdw;
    }

    public void setDywjqdw(String dywjqdw) {
        this.dywjqdw = dywjqdw;
    }

    public String getDywjqfw() {
        return dywjqfw;
    }

    public void setDywjqfw(String dywjqfw) {
        this.dywjqfw = dywjqfw;
    }

    public String getDw4610() {
        return dw4610;
    }

    public void setDw4610(String dw4610) {
        this.dw4610 = dw4610;
    }

    public String getFw4610() {
        return fw4610;
    }

    public void setFw4610(String fw4610) {
        this.fw4610 = fw4610;
    }

    public String getDcbzdw() {
        return dcbzdw;
    }

    public void setDcbzdw(String dcbzdw) {
        this.dcbzdw = dcbzdw;
    }

    public String getDcbzfw() {
        return dcbzfw;
    }

    public void setDcbzfw(String dcbzfw) {
        this.dcbzfw = dcbzfw;
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

    public String getDqdbxdw() {
        return dqdbxdw;
    }

    public void setDqdbxdw(String dqdbxdw) {
        this.dqdbxdw = dqdbxdw;
    }

    public String getDqdbxfw() {
        return dqdbxfw;
    }

    public void setDqdbxfw(String dqdbxfw) {
        this.dqdbxfw = dqdbxfw;
    }

    public String getDcbyzdw() {
        return dcbyzdw;
    }

    public void setDcbyzdw(String dcbyzdw) {
        this.dcbyzdw = dcbyzdw;
    }

    public String getDcbyzfw() {
        return dcbyzfw;
    }

    public void setDcbyzfw(String dcbyzfw) {
        this.dcbyzfw = dcbyzfw;
    }

    public String getBsjddw() {
        return bsjddw;
    }

    public void setBsjddw(String bsjddw) {
        this.bsjddw = bsjddw;
    }

    public String getBsjdfw() {
        return bsjdfw;
    }

    public void setBsjdfw(String bsjdfw) {
        this.bsjdfw = bsjdfw;
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

    public String getDczbdl() {
        return dczbdl;
    }

    public void setDczbdl(String dczbdl) {
        this.dczbdl = dczbdl;
    }

    public String getDchs() {
        return dchs;
    }

    public void setDchs(String dchs) {
        this.dchs = dchs;
    }

    public String getJcdbsbj() {
        return jcdbsbj;
    }

    public void setJcdbsbj(String jcdbsbj) {
        this.jcdbsbj = jcdbsbj;
    }

    public String getMdejghd() {
        return mdejghd;
    }

    public void setMdejghd(String mdejghd) {
        this.mdejghd = mdejghd;
    }

    public String getDjqy() {
        return djqy;
    }

    public void setDjqy(String djqy) {
        this.djqy = djqy;
    }

    public String getDbsbx() {
        return dbsbx;
    }

    public void setDbsbx(String dbsbx) {
        this.dbsbx = dbsbx;
    }

    public String getDzxs() {
        return dzxs;
    }

    public void setDzxs(String dzxs) {
        this.dzxs = dzxs;
    }

    public String getJlqdq() {
        return jlqdq;
    }

    public void setJlqdq(String jlqdq) {
        this.jlqdq = jlqdq;
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
        return "TestPtdc{" +
        "id=" + id +
        ", name=" + name +
        ", dw=" + dw +
        ", fw=" + fw +
        ", dw1=" + dw1 +
        ", dw2=" + dw2 +
        ", dw3=" + dw3 +
        ", fw1=" + fw1 +
        ", fw2=" + fw2 +
        ", fw3=" + fw3 +
        ", dywjqdw=" + dywjqdw +
        ", dywjqfw=" + dywjqfw +
        ", dw4610=" + dw4610 +
        ", fw4610=" + fw4610 +
        ", dcbzdw=" + dcbzdw +
        ", dcbzfw=" + dcbzfw +
        ", dzdqdw=" + dzdqdw +
        ", dzdqfw=" + dzdqfw +
        ", dqdbxdw=" + dqdbxdw +
        ", dqdbxfw=" + dqdbxfw +
        ", dcbyzdw=" + dcbyzdw +
        ", dcbyzfw=" + dcbyzfw +
        ", bsjddw=" + bsjddw +
        ", bsjdfw=" + bsjdfw +
        ", dcsbdd=" + dcsbdd +
        ", dcsbqd=" + dcsbqd +
        ", dcsbjl=" + dcsbjl +
        ", dcsbydzs=" + dcsbydzs +
        ", dczbdl=" + dczbdl +
        ", dchs=" + dchs +
        ", jcdbsbj=" + jcdbsbj +
        ", mdejghd=" + mdejghd +
        ", djqy=" + djqy +
        ", dbsbx=" + dbsbx +
        ", dzxs=" + dzxs +
        ", jlqdq=" + jlqdq +
        ", note=" + note +
        ", operator=" + operator +
        ", director=" + director +
        ", designid=" + designid +
        ", createdate=" + createdate +
        "}";
    }
}
