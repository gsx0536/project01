package com.tieda.alarm.mapper.saTStandard;

import com.tieda.alarm.entity.saTStandard.SaTStandard;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 标准化规范化管理 Mapper 接口
 * </p>
 *
 * @author
 * @since 2019-09-02
 */
@Repository
@Mapper
public interface SaTStandardMapper extends BaseMapper<SaTStandard> {

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return SaTStandard
     */
    SaTStandard getSaTStandardById(Long id);
    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<SaTStandard>
     */
    List<SaTStandard> getSaTStandardList(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addSaTStandard(SaTStandard obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchSaTStandard(List<SaTStandard> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateSaTStandard(SaTStandard obj);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchSaTStandard(List<SaTStandard> list);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deleteSaTStandardById(Long id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchSaTStandard(List<Long> ids);

}
