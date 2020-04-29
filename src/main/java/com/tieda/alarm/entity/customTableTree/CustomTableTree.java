package com.tieda.alarm.entity.customTableTree;

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
@TableName("CUSTOM_TABLE_TREE")
public class CustomTableTree implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private String id;
    @TableField("NAME")
    private String name;
    @TableField("PID")
    private String pid;
    @TableField("TABLENAME")
    private String tablename;
    @TableField("CODE")
    private String code;
    @TableField("LVL")
    private Integer lvl;
    @TableField("NUM")
    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getLvl() {
        return lvl;
    }

    public void setLvl(Integer lvl) {
        this.lvl = lvl;
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

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "CustomTableTree{" +
        "id=" + id +
        ", name=" + name +
        ", pid=" + pid +
        ", tablename=" + tablename +
        ", code=" + code +
        "}";
    }
}
