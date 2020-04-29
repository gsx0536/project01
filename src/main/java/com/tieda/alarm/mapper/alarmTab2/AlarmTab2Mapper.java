package com.tieda.alarm.mapper.alarmTab2;

import com.tieda.alarm.entity.alarmTab2.AlarmTab2;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author
 * @since 2019-05-23
 */
@Repository
@Mapper
public interface AlarmTab2Mapper extends BaseMapper<AlarmTab2> {

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return AlarmTab2
     */
    AlarmTab2 getAlarmTab2ById(Long id);

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<AlarmTab2>
     */
    List<AlarmTab2> getAlarmTab2List(Map<String, Object> params);
    List<AlarmTab2> alarmScore(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addAlarmTab2(AlarmTab2 obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchAlarmTab2(List<AlarmTab2> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateAlarmTab2(AlarmTab2 obj);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchAlarmTab2(List<AlarmTab2> list);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deleteAlarmTab2ById(Long id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchAlarmTab2(List<Long> ids);



    List<Map> groupbyStation(Map params);

    List<Map> groupbyTime(Map params);

    List<Map> charts(Map params);

    List<Map> chartsWorkarea(Map params);
    List<Map> chartsWorkshop(Map params);
    List<Map> chartsDevTypeName(Map params);
    List<Map> chartsStationName(Map params);
    List<Map> chartsUTime(Map params);

    List<Map> analyseWorkshop(Map params);
    List<Map> analyseLine(Map params);
    List<Map> analyseStationByWorkshop(Map params);
    List<Map> analyseStationByLine(Map params);
    List<Map> analyseDevType(Map params);
    List<Map> analyseDev(Map params);
    List<Map> analyseAlarmType(Map params);
    List<Map> alarmAnalyseByTime(Map params);
    List<Map> alarmDev(Map params);
    List<Map> alarmTime(Map params);
    List<Map> groupByAlarmType(Map params);
}
