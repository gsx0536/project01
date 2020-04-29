package com.tieda.alarm.entity.sysTRulesblob;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 技术规章文件表
 * </p>
 *
 * @author
 * @since 2019-09-03
 */
@TableName("SYS_T_RULES$BLOB")
public class SysTRulesblob implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 技术规章信息表id--text
     */
    @TableId("N_ID")
    private Double nId;
    /**
     * 文件电子档案--blob
     */
    @TableField("VC_ELECTRONIC$BLOB")
    private Object vcElectronicblob;
    /**
     * 附件一--blob
     */
    @TableField("VC_ANNEX$ONE$BLOB")
    private Object vcAnnexoneblob;
    /**
     * 附件二--blob
     */
    @TableField("VC_ANNEX$TWO$BLOB")
    private Object vcAnnextwoblob;


    public Double getnId() {
        return nId;
    }

    public void setnId(Double nId) {
        this.nId = nId;
    }

    public Object getVcElectronicblob() {
        return vcElectronicblob;
    }

    public void setVcElectronicblob(Object vcElectronicblob) {
        this.vcElectronicblob = vcElectronicblob;
    }

    public Object getVcAnnexoneblob() {
        return vcAnnexoneblob;
    }

    public void setVcAnnexoneblob(Object vcAnnexoneblob) {
        this.vcAnnexoneblob = vcAnnexoneblob;
    }

    public Object getVcAnnextwoblob() {
        return vcAnnextwoblob;
    }

    public void setVcAnnextwoblob(Object vcAnnextwoblob) {
        this.vcAnnextwoblob = vcAnnextwoblob;
    }

    @Override
    public String toString() {
        return "SysTRules$blob{" +
                "nId=" + nId +
                ", vcElectronicblob=" + vcElectronicblob +
                ", vcAnnexoneblob=" + vcAnnexoneblob +
                ", vcAnnextwoblob=" + vcAnnextwoblob +
                '}';
    }
}
