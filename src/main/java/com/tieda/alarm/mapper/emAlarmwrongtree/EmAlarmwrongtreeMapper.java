package com.tieda.alarm.mapper.emAlarmwrongtree;

import com.tieda.alarm.entity.emAlarmwrongtree.EmAlarmwrongtree;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 设备故障树对应关系表 Mapper 接口
 * </p>
 *
 * @author
 * @since 2019-05-18
 */
@Repository
@Mapper
public interface EmAlarmwrongtreeMapper extends BaseMapper<EmAlarmwrongtree> {

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return EmAlarmwrongtree
     */
    EmAlarmwrongtree getEmAlarmwrongtreeById(Long id);

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<EmAlarmwrongtree>
     */
    List<EmAlarmwrongtree> getEmAlarmwrongtreeList(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addEmAlarmwrongtree(EmAlarmwrongtree obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchEmAlarmwrongtree(List<EmAlarmwrongtree> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateEmAlarmwrongtree(EmAlarmwrongtree obj);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchEmAlarmwrongtree(List<EmAlarmwrongtree> list);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deleteEmAlarmwrongtreeById(Long id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchEmAlarmwrongtree(List<Long> ids);


    /**
     * 根据报警ID获得故障树
     *
     * @param ids 对象实体ID集合
     * @return
     */
    List<Map> getWrongTreeIdByAlarmId(String alarmtypeid);


    /**
     * 根据报警ID获得节点ID
     *
     * @param ids 对象实体ID集合
     * @return
     */
    List<Map> getNodeIdByAlarmId(String alarmtypeid);


    /**
     * 根据设备ID获得故障树
     *
     * @param ids 对象实体ID集合
     * @return
     */
    List<Map> getWrongTreeIdByDevId(String devtypeid);

}
