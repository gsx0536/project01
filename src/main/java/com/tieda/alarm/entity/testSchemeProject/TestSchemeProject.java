package com.tieda.alarm.entity.testSchemeProject;

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
@TableName("TEST_SCHEME_PROJECT")
public class TestSchemeProject implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;
    /**
     * 名称
     */
    @TableField("NAME")
    private String name;
    /**
     * 范围
     */
    @TableField("RANGE")
    private String range;
    /**
     * 项目
     */
    @TableField("PROJECT")
    private String project;
    /**
     * 使用表格
     */
    @TableField("TAB")
    private String tab;
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

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }

    public String getSchemeid() {
        return schemeid;
    }

    public void setSchemeid(String schemeid) {
        this.schemeid = schemeid;
    }

    @Override
    public String toString() {
        return "TestSchemeProject{" +
        "id=" + id +
        ", name=" + name +
        ", range=" + range +
        ", project=" + project +
        ", tab=" + tab +
        ", schemeid=" + schemeid +
        "}";
    }
}
