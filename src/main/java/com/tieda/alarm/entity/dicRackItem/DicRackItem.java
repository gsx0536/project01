package com.tieda.alarm.entity.dicRackItem;

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
 * @since 2019-05-11
 */
@TableName("DIC_RACK_ITEM" )
public class DicRackItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID" )
    private String id;
    @TableField("RACKID" )
    private String rackid;
    @TableField("ITEM" )
    private String item;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRackid() {
        return rackid;
    }

    public void setRackid(String rackid) {
        this.rackid = rackid;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "DicRackItem{" +
                "id=" + id +
                ", rackid=" + rackid +
                ", item=" + item +
                "}";
    }
}
