package com.tieda.alarm.entity.workdoor;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import java.io.Serializable;

/**
 * <p>
 * 作业门信息
 * </p>
 *
 * @author 
 * @since 2019-05-22
 */
public class Workdoor implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 记录ID
     */
    @TableId("N_ID")
    private String nId;
    /**
     * 作业门名称
     */
    @TableField("NAME")
    private String name;
    /**
     * 包含设备
     */
    @TableField("DEV")
    private String dev;
    /**
     * 所属车站
     */
    @TableField("STATION")
    private String station;
    /**
     * 钥匙所在地
     */
    @TableField("DOORKEY")
    private String doorkey;
    /**
     * 交通图链接地址
     */
    @TableField("ADDR_URL")
    private String addrUrl;
    /**
     * 作业门ID
     */
    @TableField("DOORID")
    private String doorid;
    /**
     * 车站2ID
     */
    @TableField("STATION2ID")
    private String station2id;
    /**
     * 车站2 设备
     */
    @TableField("S2DEVS")
    private String s2devs;


    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getDoorkey() {
        return doorkey;
    }

    public void setDoorkey(String doorkey) {
        this.doorkey = doorkey;
    }

    public String getAddrUrl() {
        return addrUrl;
    }

    public void setAddrUrl(String addrUrl) {
        this.addrUrl = addrUrl;
    }

    public String getDoorid() {
        return doorid;
    }

    public void setDoorid(String doorid) {
        this.doorid = doorid;
    }

    public String getStation2id() {
        return station2id;
    }

    public void setStation2id(String station2id) {
        this.station2id = station2id;
    }

    public String getS2devs() {
        return s2devs;
    }

    public void setS2devs(String s2devs) {
        this.s2devs = s2devs;
    }

    @Override
    public String toString() {
        return "Workdoor{" +
        "nId=" + nId +
        ", name=" + name +
        ", dev=" + dev +
        ", station=" + station +
        ", doorkey=" + doorkey +
        ", addrUrl=" + addrUrl +
        ", doorid=" + doorid +
        ", station2id=" + station2id +
        ", s2devs=" + s2devs +
        "}";
    }
}
