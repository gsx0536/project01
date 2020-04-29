package com.tieda.alarm.service.checkRack;

import com.tieda.alarm.entity.checkRack.CheckRack;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 作业主表 服务类
 * </p>
 *
 * @author
 * @since 2019-05-20
 */
public interface ICheckRackService extends IService<CheckRack> {

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return CheckRack
     */
    CheckRack getCheckRackById(Long id);

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<CheckRack>
     */
    List<CheckRack> getCheckRackList(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addCheckRack(CheckRack obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchCheckRack(List<CheckRack> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateCheckRack(CheckRack obj);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchCheckRack(List<CheckRack> list);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deleteCheckRackById(Long id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchCheckRack(List<Long> ids);
}
