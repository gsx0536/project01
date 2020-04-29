package com.tieda.alarm.mapper.workdoor;

import com.tieda.alarm.entity.workdoor.Workdoor;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 作业门信息 Mapper 接口
 * </p>
 *
 * @author
 * @since 2019-05-22
 */
@Repository
@Mapper
public interface WorkdoorMapper extends BaseMapper<Workdoor> {

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return Workdoor
     */
    Workdoor getWorkdoorById(Long id);

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<Workdoor>
     */
    List<Workdoor> getWorkdoorList(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addWorkdoor(Workdoor obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchWorkdoor(List<Workdoor> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateWorkdoor(Workdoor obj);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchWorkdoor(List<Workdoor> list);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deleteWorkdoorById(Long id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchWorkdoor(List<Long> ids);

    List<String> getTrafficImage(@Param("staId") String staId, @Param("devId") String devId);
}
