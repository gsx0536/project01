package com.tieda.alarm.entity.station;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * @description:车站表
 * @author: admin
 * @create: 2019-08-01 13:04
 */
@TableName("SYS_T_STATION")
public class Station implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId("VC_STATION$ID")
    private String vcStationId;

    @TableField("VC_NAME")
    private String vcName;

    public String getVcStationId() {
        return vcStationId;
    }

    public void setVcStationId(String vcStationId) {
        this.vcStationId = vcStationId;
    }

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName;
    }
}
