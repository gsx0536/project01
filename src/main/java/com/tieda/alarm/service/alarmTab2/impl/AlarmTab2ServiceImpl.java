package com.tieda.alarm.service.alarmTab2.impl;

import com.tieda.alarm.entity.alarmTab2.AlarmTab2;
import com.tieda.alarm.mapper.alarmTab2.AlarmTab2Mapper;
import com.tieda.alarm.service.alarmTab2.IAlarmTab2Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author
 * @since 2019-05-23
 */
@Service
@Transactional
public class AlarmTab2ServiceImpl extends ServiceImpl<AlarmTab2Mapper, AlarmTab2> implements IAlarmTab2Service {


    @Autowired
    AlarmTab2Mapper alarmTab2Mapper;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return AlarmTab2
     */
    @Override
    public AlarmTab2 getAlarmTab2ById(Long id) {
        return alarmTab2Mapper.getAlarmTab2ById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<AlarmTab2>
     */
    @Override
    public List<AlarmTab2> getAlarmTab2List(Map<String, Object> params) {
        return alarmTab2Mapper.getAlarmTab2List(params);
    }
    @Override
    public List<AlarmTab2> alarmScore(Map<String, Object> params) {
        return alarmTab2Mapper.alarmScore(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addAlarmTab2(AlarmTab2 obj) {
        alarmTab2Mapper.addAlarmTab2(obj);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchAlarmTab2(List<AlarmTab2> list) {
        alarmTab2Mapper.addBatchAlarmTab2(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateAlarmTab2(AlarmTab2 obj) {
        alarmTab2Mapper.updateAlarmTab2(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchAlarmTab2(List<AlarmTab2> list) {
        alarmTab2Mapper.updateBatchAlarmTab2(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteAlarmTab2ById(Long id) {
        alarmTab2Mapper.deleteAlarmTab2ById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchAlarmTab2(List<Long> ids) {
        alarmTab2Mapper.deleteBatchAlarmTab2(ids);
    }



    public List<Map> groupbyStation(Map params) {
        return alarmTab2Mapper.groupbyStation(params);
    }

    public List<Map> groupbyTime(Map params) {
        return alarmTab2Mapper.groupbyTime(params);
    }

    public List<Map> charts(Map params) {
        return alarmTab2Mapper.charts(params);
    }

    public List<Map> chartsWorkarea(Map params) {
        return alarmTab2Mapper.chartsWorkarea(params);
    }
    public List<Map> chartsWorkshop(Map params) {
        return alarmTab2Mapper.chartsWorkshop(params);
    }
    public List<Map> chartsDevTypeName(Map params) {
        return alarmTab2Mapper.chartsDevTypeName(params);
    }
    public List<Map> chartsStationName(Map params) {
        return alarmTab2Mapper.chartsStationName(params);
    }
    public List<Map> chartsUTime(Map params) {
        return alarmTab2Mapper.chartsUTime(params);
    }

    public List<Map> analyseWorkshop(Map params) {
        return alarmTab2Mapper.analyseWorkshop(params);
    }
    public List<Map> analyseLine(Map params) {
        return alarmTab2Mapper.analyseLine(params);
    }
    public List<Map> analyseStationByWorkshop(Map params) {
        return alarmTab2Mapper.analyseStationByWorkshop(params);
    }
    public List<Map> analyseStationByLine(Map params) {
        return alarmTab2Mapper.analyseStationByLine(params);
    }
    public List<Map> analyseDevType(Map params) {
        return alarmTab2Mapper.analyseDevType(params);
    }
    public List<Map> analyseDev(Map params) {
        return alarmTab2Mapper.analyseDev(params);
    }
    public List<Map> analyseAlarmType(Map params) {
        return alarmTab2Mapper.analyseAlarmType(params);
    }
    public List<Map> alarmAnalyseByTime(Map params) {
        return alarmTab2Mapper.alarmAnalyseByTime(params);
    }
    public List<Map> alarmDev(Map params) {
        return alarmTab2Mapper.alarmDev(params);
    }
    public List<Map> alarmTime(Map params) {
        return alarmTab2Mapper.alarmTime(params);
    }
    public List<Map> groupByAlarmType(Map params) {
        return alarmTab2Mapper.groupByAlarmType(params);
    }
}
