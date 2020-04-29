package com.tieda.alarm.entity.dicRack;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 机柜
 * </p>
 *
 * @author
 * @since 2019-05-11
 */
@TableName("DIC_RACK" )
public class DicRack implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID" )
    private String id;
    /**
     * 名称
     */
    @TableField("NAME" )
    private String name;
    /**
     * 编码
     */
    @TableField("CODE" )
    private String code;


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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "DicRack{" +
                "id=" + id +
                ", name=" + name +
                ", code=" + code +
                "}";
    }
}
