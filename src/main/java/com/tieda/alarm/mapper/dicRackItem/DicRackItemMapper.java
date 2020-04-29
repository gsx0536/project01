package com.tieda.alarm.mapper.dicRackItem;

import com.tieda.alarm.entity.dicRackItem.DicRackItem;
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
 * @since 2019-05-11
 */
@Repository
@Mapper
public interface DicRackItemMapper extends BaseMapper<DicRackItem> {


    List<DicRackItem> queryByRackId(Long id);

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return DicRackItem
     */
    DicRackItem getDicRackItemById(Long id);

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<DicRackItem>
     */
    List<DicRackItem> getDicRackItemList(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addDicRackItem(DicRackItem obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchDicRackItem(List<DicRackItem> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateDicRackItem(DicRackItem obj);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchDicRackItem(List<DicRackItem> list);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deleteDicRackItemById(Long id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchDicRackItem(List<Long> ids);

}
