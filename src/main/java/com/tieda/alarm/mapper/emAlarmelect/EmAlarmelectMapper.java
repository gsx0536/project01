package com.tieda.alarm.mapper.emAlarmelect;

import com.tieda.alarm.entity.emAlarmelect.EmAlarmelect;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 报警电路图对应表 Mapper 接口
 * </p>
 *
 * @author
 * @since 2019-05-18
 */
@Repository
@Mapper
public interface EmAlarmelectMapper extends BaseMapper<EmAlarmelect> {

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return EmAlarmelect
     */
    EmAlarmelect getEmAlarmelectById(Long id);

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<EmAlarmelect>
     */
    List<EmAlarmelect> getEmAlarmelectList(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addEmAlarmelect(EmAlarmelect obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchEmAlarmelect(List<EmAlarmelect> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateEmAlarmelect(EmAlarmelect obj);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchEmAlarmelect(List<EmAlarmelect> list);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deleteEmAlarmelectById(Long id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchEmAlarmelect(List<Long> ids);

}
