package com.tieda.alarm.entity.testSchemePerson;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2019-12-11
 */
@TableName("TEST_SCHEME_PERSON")
public class TestSchemePerson implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;
    /**
     * 名字
     */
    @TableField("NAME")
    private String name;
    /**
     * 职务
     */
    @TableField("DUTY")
    private String duty;
    /**
     * 工作内容
     */
    @TableField("CONTENT")
    private String content;
    /**
     * 负责人：1 是；0 否
     */
    @TableField("CHARGE")
    private String charge;
    /**
     * 方案ID
     */
    @TableField("SCHEMEID")
    private String schemeid;


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

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getSchemeid() {
        return schemeid;
    }

    public void setSchemeid(String schemeid) {
        this.schemeid = schemeid;
    }

    @Override
    public String toString() {
        return "TestSchemePerson{" +
        "id=" + id +
        ", name=" + name +
        ", duty=" + duty +
        ", content=" + content +
        ", charge=" + charge +
        ", schemeid=" + schemeid +
        "}";
    }
}
