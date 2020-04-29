package com.tieda.alarm.mapper.station;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tieda.alarm.entity.station.Station;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description:
 * @author: admin
 * @create: 2019-08-01 13:01
 */
@Mapper
public interface StationMapper extends BaseMapper<Station> {
    /**
     * 通过车站查询部门id
     * @param staId
     * @return
     */
    @Select("select vc_org$id from sys_v_org$station_query where vc_station$id = #{staId}")
    List<String> getOrgIdByStaId(String staId);

}
