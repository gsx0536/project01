package com.tieda.alarm.service.dicRackItem.impl;

import com.tieda.alarm.entity.dicRackItem.DicRackItem;
import com.tieda.alarm.mapper.dicRackItem.DicRackItemMapper;
import com.tieda.alarm.service.dicRackItem.IDicRackItemService;
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
 * @since 2019-05-11
 */
@Service
@Transactional
public class DicRackItemServiceImpl extends ServiceImpl<DicRackItemMapper, DicRackItem> implements IDicRackItemService {


    @Autowired
    DicRackItemMapper dicRackItemMapper;


    @Override
    public List<DicRackItem> queryByRackId(Long id) {
        return dicRackItemMapper.queryByRackId(id);
    }

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return DicRackItem
     */
    @Override
    public DicRackItem getDicRackItemById(Long id) {
        return dicRackItemMapper.getDicRackItemById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<DicRackItem>
     */
    @Override
    public List<DicRackItem> getDicRackItemList(Map<String, Object> params) {
        return dicRackItemMapper.getDicRackItemList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addDicRackItem(DicRackItem obj) {
        dicRackItemMapper.addDicRackItem(obj);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchDicRackItem(List<DicRackItem> list) {
        dicRackItemMapper.addBatchDicRackItem(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateDicRackItem(DicRackItem obj) {
        dicRackItemMapper.updateDicRackItem(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchDicRackItem(List<DicRackItem> list) {
        dicRackItemMapper.updateBatchDicRackItem(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteDicRackItemById(Long id) {
        dicRackItemMapper.deleteDicRackItemById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchDicRackItem(List<Long> ids) {
        dicRackItemMapper.deleteBatchDicRackItem(ids);
    }

}
