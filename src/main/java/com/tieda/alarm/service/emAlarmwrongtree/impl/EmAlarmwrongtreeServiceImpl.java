package com.tieda.alarm.service.emAlarmwrongtree.impl;

import com.tieda.alarm.entity.emAlarmwrongtree.EmAlarmwrongtree;
import com.tieda.alarm.mapper.emAlarmwrongtree.EmAlarmwrongtreeMapper;
import com.tieda.alarm.service.emAlarmwrongtree.IEmAlarmwrongtreeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 设备故障树对应关系表 服务实现类
 * </p>
 *
 * @author
 * @since 2019-05-18
 */
@Service
@Transactional
public class EmAlarmwrongtreeServiceImpl extends ServiceImpl<EmAlarmwrongtreeMapper, EmAlarmwrongtree> implements IEmAlarmwrongtreeService {


    @Autowired
    EmAlarmwrongtreeMapper emAlarmwrongtreeMapper;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return EmAlarmwrongtree
     */
    @Override
    public EmAlarmwrongtree getEmAlarmwrongtreeById(Long id) {
        return emAlarmwrongtreeMapper.getEmAlarmwrongtreeById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<EmAlarmwrongtree>
     */
    @Override
    public List<EmAlarmwrongtree> getEmAlarmwrongtreeList(Map<String, Object> params) {
        return emAlarmwrongtreeMapper.getEmAlarmwrongtreeList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addEmAlarmwrongtree(EmAlarmwrongtree obj) {
        emAlarmwrongtreeMapper.addEmAlarmwrongtree(obj);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchEmAlarmwrongtree(List<EmAlarmwrongtree> list) {
        emAlarmwrongtreeMapper.addBatchEmAlarmwrongtree(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateEmAlarmwrongtree(EmAlarmwrongtree obj) {
        emAlarmwrongtreeMapper.updateEmAlarmwrongtree(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchEmAlarmwrongtree(List<EmAlarmwrongtree> list) {
        emAlarmwrongtreeMapper.updateBatchEmAlarmwrongtree(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteEmAlarmwrongtreeById(Long id) {
        emAlarmwrongtreeMapper.deleteEmAlarmwrongtreeById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchEmAlarmwrongtree(List<Long> ids) {
        emAlarmwrongtreeMapper.deleteBatchEmAlarmwrongtree(ids);
    }


    /**
     * 根据报警ID获得故障树
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public List<Map> getWrongTreeIdByAlarmId(String alarmtypeid) {
        List<Map> nodelist = emAlarmwrongtreeMapper.getWrongTreeIdByAlarmId(alarmtypeid);
        return nodelist;
    }


    /**
     * 根据报警ID获得节点ID
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public List<Map> getNodeIdByAlarmId(String alarmtypeid) {
        return emAlarmwrongtreeMapper.getNodeIdByAlarmId(alarmtypeid);
    }


    /**
     * 根据设备ID获得故障树
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public List<Map> getWrongTreeIdByDevId(String devtypeid) {
        return emAlarmwrongtreeMapper.getWrongTreeIdByDevId(devtypeid);
    }
}
