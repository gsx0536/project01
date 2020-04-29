package com.tieda.alarm.mapper.jzjcProblemLog;

import com.tieda.alarm.entity.jzjcProblemLog.JzjcProblemLog;
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
 * @since 2019-11-16
 */
@Repository
@Mapper
public interface JzjcProblemLogMapper extends BaseMapper<JzjcProblemLog> {

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return JzjcProblemLog
     */
    JzjcProblemLog getJzjcProblemLogById(Long id);

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<JzjcProblemLog>
     */
    List<JzjcProblemLog> getJzjcProblemLogList(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addJzjcProblemLog(JzjcProblemLog obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchJzjcProblemLog(List<JzjcProblemLog> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateJzjcProblemLog(JzjcProblemLog obj);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchJzjcProblemLog(List<JzjcProblemLog> list);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deleteJzjcProblemLogById(Long id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchJzjcProblemLog(List<Long> ids);

}
