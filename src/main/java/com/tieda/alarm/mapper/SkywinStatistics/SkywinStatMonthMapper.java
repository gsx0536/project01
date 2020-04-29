package com.tieda.alarm.mapper.SkywinStatistics;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tieda.alarm.entity.SkywinStatistics.SkywinDayStatGrid;
import com.tieda.alarm.entity.SkywinStatistics.SkywinMonthStat;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface SkywinStatMonthMapper extends BaseMapper<SkywinMonthStat> {

    public List<SkywinMonthStat> skywinStatMonthForApply(Map map);

    public List<SkywinMonthStat> skywinStatMonthForPlan(Map map);

    public List<SkywinDayStatGrid> monthStatDetailApplyC(Map map);

    public List<SkywinDayStatGrid> monthStatDetailinPlan(Map map);

    public List<SkywinDayStatGrid> monthStatDetailPlanC(Map map);

    public List<SkywinDayStatGrid> monthStatDetailCashC(Map map);

}
