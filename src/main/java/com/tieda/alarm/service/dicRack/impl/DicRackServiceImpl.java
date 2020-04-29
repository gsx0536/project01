package com.tieda.alarm.service.dicRack.impl;

import com.tieda.alarm.entity.dicRack.DicRack;
import com.tieda.alarm.mapper.dicRack.DicRackMapper;
import com.tieda.alarm.service.dicRack.IDicRackService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 机柜 服务实现类
 * </p>
 *
 * @author
 * @since 2019-05-11
 */
@Service
@Transactional
public class DicRackServiceImpl extends ServiceImpl<DicRackMapper, DicRack> implements IDicRackService {


    @Autowired
    DicRackMapper dicRackMapper;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return DicRack
     */
    @Override
    public DicRack getDicRackById(Long id) {
        return dicRackMapper.getDicRackById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<DicRack>
     */
    @Override
    public List<DicRack> getDicRackList(Map<String, Object> params) {
        return dicRackMapper.getDicRackList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addDicRack(DicRack obj) {
        dicRackMapper.addDicRack(obj);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchDicRack(List<DicRack> list) {
        dicRackMapper.addBatchDicRack(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateDicRack(DicRack obj) {
        dicRackMapper.updateDicRack(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchDicRack(List<DicRack> list) {
        dicRackMapper.updateBatchDicRack(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteDicRackById(Long id) {
        dicRackMapper.deleteDicRackById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchDicRack(List<Long> ids) {
        dicRackMapper.deleteBatchDicRack(ids);
    }

}
