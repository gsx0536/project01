package com.tieda.alarm.service.workdoor;

import com.tieda.alarm.entity.workdoor.Workdoor;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 作业门信息 服务类
 * </p>
 *
 * @author
 * @since 2019-05-22
 */
public interface IWorkdoorService extends IService<Workdoor> {

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

    String getTrafficImage(String staId, String devName);
}
