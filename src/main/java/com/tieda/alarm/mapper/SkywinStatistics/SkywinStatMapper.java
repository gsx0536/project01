package com.tieda.alarm.mapper.SkywinStatistics;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tieda.alarm.entity.SkywinStatistics.SkywinDayStat;
import com.tieda.alarm.entity.SkywinStatistics.SkywinDayStatForm;
import com.tieda.alarm.entity.SkywinStatistics.SkywinDayStatGrid;
import com.tieda.alarm.entity.SkywinStatistics.SkywinDayStatSearch;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SkywinStatMapper extends BaseMapper<SkywinDayStat> {
    /***
     * 日统计 - 施工 - 按段统计
     * @param skywinDayStatSearch
     * @return
     */
    public SkywinDayStat getSgskywinDayStatSeg(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 日统计 - 施工 - 按车间统计
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStat> getSgskywinDayStatCj(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 日统计 - 施工 - 按工区统计
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStat> getSgskywinDayStatGq(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 日统计 - 施工 - 按车站统计
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStat> getSgskywinDayStatCz(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 日统计 - 维修 - 按段统计
     * @param skywinDayStatSearch
     * @return
     */
    public SkywinDayStat getWxskywinDayStatSeg(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 日统计 - 维修 - 按车间统计
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStat> getWxskywinDayStatCj(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 日统计 - 维修 - 按工区统计
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStat> getWxskywinDayStatGq(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 日统计 - 维修 - 按车站统计
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStat> getWxskywinDayStatCz(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 日统计 - 点外（段）
     * @param skywinDayStatSearch
     * @return
     */
    public SkywinDayStat getDwMoredayskywinDayStatSeg(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 日统计 - 点外（车间）
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStat> getDwMoredayskywinDayStatCj(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 日统计 - 点外（工区）
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStat> getDwMoredayskywinDayStatGq(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 日统计 - 点外（段） - 固定日期
     * @param skywinDayStatSearch
     * @return
     */
    public SkywinDayStat getDwDayskywinDayStatSeg(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 日统计 - 点外（车间） - 固定日期
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStat> getDwDayskywinDayStatCj(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 日统计 - 点外（工区） - 固定日期
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStat> getDwDayskywinDayStatGq(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 日统计 - 未兑现信息
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStatForm> getSkywinDayStatNoCashInfos(SkywinDayStatSearch skywinDayStatSearch);

    /***
     *日统计 - 多、少给点  - 维修
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStatForm> getSkywinDayStatGivePointInfosWx(SkywinDayStatSearch skywinDayStatSearch);

    /***
     *日统计 - 多、少给点  - 施工
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStatForm> getSkywinDayStatGivePointInfosSg(SkywinDayStatSearch skywinDayStatSearch);

    /***
     *日统计 - 小于30分钟天窗及原因
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStatForm> getSkywinDayStatthirtyInfos(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 根据机构编号获取机构等级
     * @param unit
     * @return
     */
    public String getOrgLevel(String unit);

    /***
     * 维修计划项数据明细
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStatGrid> dayStatDetailWxPlanCou(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 施工计划项数明细
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStatGrid> dayStatDetailSgPlanCou(SkywinDayStatSearch skywinDayStatSearch);

    /**
     * 维修兑现项数明细
     *
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStatGrid> dayStatDetailWxPlanCash(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 施工兑现项数明细
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStatGrid> dayStatDetailSgPlanCash(SkywinDayStatSearch skywinDayStatSearch);

    /***
     * 点外个数明细数据
     * @param skywinDayStatSearch
     * @return
     */
    public List<SkywinDayStatGrid> dayStatDetailDwPlan(SkywinDayStatSearch skywinDayStatSearch);
}
