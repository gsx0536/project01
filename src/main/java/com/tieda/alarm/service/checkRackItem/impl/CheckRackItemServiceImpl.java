package com.tieda.alarm.service.checkRackItem.impl;

import com.tieda.alarm.entity.checkRackItem.CheckRackItem;
import com.tieda.alarm.mapper.checkRackItem.CheckRackItemMapper;
import com.tieda.alarm.service.checkRackItem.ICheckRackItemService;
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
 * @since 2019-05-20
 */
@Service
@Transactional
public class CheckRackItemServiceImpl extends ServiceImpl<CheckRackItemMapper, CheckRackItem> implements ICheckRackItemService {


    @Autowired
    CheckRackItemMapper checkRackItemMapper;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return CheckRackItem
     */
    @Override
    public CheckRackItem getCheckRackItemById(Long id) {
        return checkRackItemMapper.getCheckRackItemById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<CheckRackItem>
     */
    @Override
    public List<CheckRackItem> getCheckRackItemList(Map<String, Object> params) {
        return checkRackItemMapper.getCheckRackItemList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addCheckRackItem(CheckRackItem obj) {
        checkRackItemMapper.addCheckRackItem(obj);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchCheckRackItem(List<CheckRackItem> list) {
        checkRackItemMapper.addBatchCheckRackItem(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateCheckRackItem(CheckRackItem obj) {
        checkRackItemMapper.updateCheckRackItem(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchCheckRackItem(List<CheckRackItem> list) {
        checkRackItemMapper.updateBatchCheckRackItem(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteCheckRackItemById(String id) {
        checkRackItemMapper.deleteCheckRackItemById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchCheckRackItem(List<Long> ids) {
        checkRackItemMapper.deleteBatchCheckRackItem(ids);
    }

}
