package com.tieda.alarm.entity.testZdzjbs;

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
@TableName("TEST_ZDZJBS")
public class TestZdzjbs implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    /**
     * 进路始端
     */
    @TableField("JLSD")
    private String jlsd;
    /**
     * 进路终端
     */
    @TableField("JLZD")
    private String jlzd;
    /**
     * 自动站间闭塞首次办理
     */
    @TableField("ZDBS")
    private String zdbs;
    /**
     * 正常办理办理发车
     */
    @TableField("ZC_BLFC")
    private String zcBlfc;
    /**
     * 正常办理同意发车
     */
    @TableField("ZC_TYFC")
    private String zcTyfc;
    /**
     * 正常办理列车出发
     */
    @TableField("ZC_LCCF")
    private String zcLccf;
    /**
     * 正常办理列车在区间运行
     */
    @TableField("ZC_LCYX")
    private String zcLcyx;
    /**
     * 正常办理列车到达
     */
    @TableField("ZC_LCDD")
    private String zcLcdd;
    /**
     * 取消复原办理
     */
    @TableField("QXFY")
    private String qxfy;
    /**
     * 转为半自动闭塞办理办理发车
     */
    @TableField("BZD_BLFC")
    private String bzdBlfc;
    /**
     * 转为半自动闭塞办理同意发车
     */
    @TableField("BZD_TYFC")
    private String bzdTyfc;
    /**
     * 转为半自动闭塞办理列车出发
     */
    @TableField("BZD_LCFC")
    private String bzdLcfc;
    /**
     * 转为半自动闭塞办理列车在区间运行
     */
    @TableField("BZD_LCYX")
    private String bzdLcyx;
    /**
     * 转为半自动闭塞办理列车到达
     */
    @TableField("BZD_LCDD")
    private String bzdLcdd;
    /**
     * 故障复原办理发车站取得发车权，一度停电恢复
     */
    @TableField("GZ_FCQ")
    private String gzFcq;
    /**
     * 故障复原办理区间空闲，一站一度停电恢复
     */
    @TableField("GZ_QJKXYZ")
    private String gzQjkxyz;
    /**
     * 故障复原办理区间空闲，两站一度停电恢复
     */
    @TableField("GZ_QJKXLZ")
    private String gzQjkxlz;
    /**
     * 故障复原办理停电后恢复供电时，甲乙两站在人工复原前不能办理发车进路
     */
    @TableField("GZ_BNFC")
    private String gzBnfc;
    /**
     * 故障复原办理区间设备故障修复，由半自动闭塞制式恢复为站间闭塞制式运行
     */
    @TableField("GZ_BZD")
    private String gzBzd;
    /**
     * 区间设备故障转为半自动闭塞办理
     */
    @TableField("SBZBZD")
    private String sbzbzd;
    /**
     * 区间占用，甲乙两站均不能办理闭塞开放信号
     */
    @TableField("LZBBL")
    private String lzbbl;
    /**
     * 甲站开放出站信号，乙站不能向同一区间开放出站信号
     */
    @TableField("LZBTQ")
    private String lzbtq;
    /**
     * 备注
     */
    @TableField("NOTE")
    private String note;
    /**
     * 试验人员
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

    public String getJlsd() {
        return jlsd;
    }

    public void setJlsd(String jlsd) {
        this.jlsd = jlsd;
    }

    public String getJlzd() {
        return jlzd;
    }

    public void setJlzd(String jlzd) {
        this.jlzd = jlzd;
    }

    public String getZdbs() {
        return zdbs;
    }

    public void setZdbs(String zdbs) {
        this.zdbs = zdbs;
    }

    public String getZcBlfc() {
        return zcBlfc;
    }

    public void setZcBlfc(String zcBlfc) {
        this.zcBlfc = zcBlfc;
    }

    public String getZcTyfc() {
        return zcTyfc;
    }

    public void setZcTyfc(String zcTyfc) {
        this.zcTyfc = zcTyfc;
    }

    public String getZcLccf() {
        return zcLccf;
    }

    public void setZcLccf(String zcLccf) {
        this.zcLccf = zcLccf;
    }

    public String getZcLcyx() {
        return zcLcyx;
    }

    public void setZcLcyx(String zcLcyx) {
        this.zcLcyx = zcLcyx;
    }

    public String getZcLcdd() {
        return zcLcdd;
    }

    public void setZcLcdd(String zcLcdd) {
        this.zcLcdd = zcLcdd;
    }

    public String getQxfy() {
        return qxfy;
    }

    public void setQxfy(String qxfy) {
        this.qxfy = qxfy;
    }

    public String getBzdBlfc() {
        return bzdBlfc;
    }

    public void setBzdBlfc(String bzdBlfc) {
        this.bzdBlfc = bzdBlfc;
    }

    public String getBzdTyfc() {
        return bzdTyfc;
    }

    public void setBzdTyfc(String bzdTyfc) {
        this.bzdTyfc = bzdTyfc;
    }

    public String getBzdLcfc() {
        return bzdLcfc;
    }

    public void setBzdLcfc(String bzdLcfc) {
        this.bzdLcfc = bzdLcfc;
    }

    public String getBzdLcyx() {
        return bzdLcyx;
    }

    public void setBzdLcyx(String bzdLcyx) {
        this.bzdLcyx = bzdLcyx;
    }

    public String getBzdLcdd() {
        return bzdLcdd;
    }

    public void setBzdLcdd(String bzdLcdd) {
        this.bzdLcdd = bzdLcdd;
    }

    public String getGzFcq() {
        return gzFcq;
    }

    public void setGzFcq(String gzFcq) {
        this.gzFcq = gzFcq;
    }

    public String getGzQjkxyz() {
        return gzQjkxyz;
    }

    public void setGzQjkxyz(String gzQjkxyz) {
        this.gzQjkxyz = gzQjkxyz;
    }

    public String getGzQjkxlz() {
        return gzQjkxlz;
    }

    public void setGzQjkxlz(String gzQjkxlz) {
        this.gzQjkxlz = gzQjkxlz;
    }

    public String getGzBnfc() {
        return gzBnfc;
    }

    public void setGzBnfc(String gzBnfc) {
        this.gzBnfc = gzBnfc;
    }

    public String getGzBzd() {
        return gzBzd;
    }

    public void setGzBzd(String gzBzd) {
        this.gzBzd = gzBzd;
    }

    public String getSbzbzd() {
        return sbzbzd;
    }

    public void setSbzbzd(String sbzbzd) {
        this.sbzbzd = sbzbzd;
    }

    public String getLzbbl() {
        return lzbbl;
    }

    public void setLzbbl(String lzbbl) {
        this.lzbbl = lzbbl;
    }

    public String getLzbtq() {
        return lzbtq;
    }

    public void setLzbtq(String lzbtq) {
        this.lzbtq = lzbtq;
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
        return "TestZdzjbs{" +
        "id=" + id +
        ", jlsd=" + jlsd +
        ", jlzd=" + jlzd +
        ", zdbs=" + zdbs +
        ", zcBlfc=" + zcBlfc +
        ", zcTyfc=" + zcTyfc +
        ", zcLccf=" + zcLccf +
        ", zcLcyx=" + zcLcyx +
        ", zcLcdd=" + zcLcdd +
        ", qxfy=" + qxfy +
        ", bzdBlfc=" + bzdBlfc +
        ", bzdTyfc=" + bzdTyfc +
        ", bzdLcfc=" + bzdLcfc +
        ", bzdLcyx=" + bzdLcyx +
        ", bzdLcdd=" + bzdLcdd +
        ", gzFcq=" + gzFcq +
        ", gzQjkxyz=" + gzQjkxyz +
        ", gzQjkxlz=" + gzQjkxlz +
        ", gzBnfc=" + gzBnfc +
        ", gzBzd=" + gzBzd +
        ", sbzbzd=" + sbzbzd +
        ", lzbbl=" + lzbbl +
        ", lzbtq=" + lzbtq +
        ", note=" + note +
        ", operator=" + operator +
        ", director=" + director +
        ", designid=" + designid +
        ", createdate=" + createdate +
        "}";
    }
}
