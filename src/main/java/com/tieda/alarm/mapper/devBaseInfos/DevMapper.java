package com.tieda.alarm.mapper.devBaseInfos;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tieda.alarm.entity.devBaseInfos.DevBaseInfos;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @description:设备表
 * @author: admin
 * @create: 2019-10-12 17:37
 */
@Repository
@Mapper
public interface DevMapper extends BaseMapper<DevBaseInfos> {

    @Select("select min(id) id from DEV_BASEINFOS where station=#{param1} and replace(vc_name,'#')=replace(#{param2},'#') ")
    String getDevId(String staId,String devName);

}
