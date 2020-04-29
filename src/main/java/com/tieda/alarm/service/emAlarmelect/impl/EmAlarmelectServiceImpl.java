package com.tieda.alarm.service.emAlarmelect.impl;

import com.tieda.alarm.entity.emAlarmelect.EmAlarmelect;
import com.tieda.alarm.mapper.emAlarmelect.EmAlarmelectMapper;
import com.tieda.alarm.service.emAlarmelect.IEmAlarmelectService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 报警电路图对应表 服务实现类
 * </p>
 *
 * @author
 * @since 2019-05-18
 */
@Service
@Transactional
public class EmAlarmelectServiceImpl extends ServiceImpl<EmAlarmelectMapper, EmAlarmelect> implements IEmAlarmelectService {


    @Autowired
    EmAlarmelectMapper emAlarmelectMapper;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return EmAlarmelect
     */
    @Override
    public EmAlarmelect getEmAlarmelectById(Long id) {
        return emAlarmelectMapper.getEmAlarmelectById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<EmAlarmelect>
     */
    @Override
    public List<EmAlarmelect> getEmAlarmelectList(Map<String, Object> params) {
        return emAlarmelectMapper.getEmAlarmelectList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addEmAlarmelect(EmAlarmelect obj) {
        emAlarmelectMapper.addEmAlarmelect(obj);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchEmAlarmelect(List<EmAlarmelect> list) {
        emAlarmelectMapper.addBatchEmAlarmelect(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateEmAlarmelect(EmAlarmelect obj) {
        emAlarmelectMapper.updateEmAlarmelect(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchEmAlarmelect(List<EmAlarmelect> list) {
        emAlarmelectMapper.updateBatchEmAlarmelect(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteEmAlarmelectById(Long id) {
        emAlarmelectMapper.deleteEmAlarmelectById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchEmAlarmelect(List<Long> ids) {
        emAlarmelectMapper.deleteBatchEmAlarmelect(ids);
    }

}
