package com.tieda.alarm.service.dicRack;

import com.tieda.alarm.entity.dicRack.DicRack;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 机柜 服务类
 * </p>
 *
 * @author
 * @since 2019-05-11
 */
public interface IDicRackService extends IService<DicRack> {

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return DicRack
     */
    DicRack getDicRackById(Long id);

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<DicRack>
     */
    List<DicRack> getDicRackList(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addDicRack(DicRack obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchDicRack(List<DicRack> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateDicRack(DicRack obj);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchDicRack(List<DicRack> list);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deleteDicRackById(Long id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchDicRack(List<Long> ids);
}
