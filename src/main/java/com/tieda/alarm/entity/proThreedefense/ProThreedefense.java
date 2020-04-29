package com.tieda.alarm.entity.proThreedefense;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 派工单作业项目与三防相关关联关系表
 * </p>
 *
 * @author 
 * @since 2019-09-04
 */
@TableName("PRO_THREEDEFENSE")
public class ProThreedefense implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 作业项目编号--text
     */
    @TableId("PRO_ID")
    private Double proId;
    /**
     * 风险提示--text
     */
    @TableField("RISKWARN")
    private String riskwarn;
    /**
     * 防范措施--text
     */
    @TableField("PREVENTION")
    private String prevention;
    /**
     * 作业项目名称--text
     */
    @TableField("PRO_NAME")
    private String proName;
    /**
     * 技术准备--text
     */
    @TableField("TECHNICAL")
    private String technical;
    /**
     * 作业门相关--text
     */
    @TableField("WORKDOOR")
    private String workdoor;
    /**
     * 工器具准备--text
     */
    @TableField("TOOLS")
    private String tools;


    public Double getProId() {
        return proId;
    }

    public void setProId(Double proId) {
        this.proId = proId;
    }

    public String getRiskwarn() {
        return riskwarn;
    }

    public void setRiskwarn(String riskwarn) {
        this.riskwarn = riskwarn;
    }

    public String getPrevention() {
        return prevention;
    }

    public void setPrevention(String prevention) {
        this.prevention = prevention;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getTechnical() {
        return technical;
    }

    public void setTechnical(String technical) {
        this.technical = technical;
    }

    public String getWorkdoor() {
        return workdoor;
    }

    public void setWorkdoor(String workdoor) {
        this.workdoor = workdoor;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    @Override
    public String toString() {
        return "ProThreedefense{" +
        "proId=" + proId +
        ", riskwarn=" + riskwarn +
        ", prevention=" + prevention +
        ", proName=" + proName +
        ", technical=" + technical +
        ", workdoor=" + workdoor +
        ", tools=" + tools +
        "}";
    }
}
