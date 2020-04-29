package com.tieda.alarm.service.tcdwPlan.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tieda.alarm.entity.tcdwPlan.TcdwPlan;
import com.tieda.alarm.mapper.tcdwPlan.TcdwPlanMapper;
import com.tieda.alarm.service.tcdwPlan.ITcdwPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 天窗点外维修作业计划审批单 服务实现类
 * </p>
 *
 * @author
 * @since 2019-06-19
 */
@Service
@Transactional
public class TcdwPlanServiceImpl extends ServiceImpl<TcdwPlanMapper, TcdwPlan> implements ITcdwPlanService {


    @Autowired
    TcdwPlanMapper tcdwPlanMapper;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return TcdwPlan
     */
    @Override
    public TcdwPlan getTcdwPlanById(Long id) {
        return tcdwPlanMapper.getTcdwPlanById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<TcdwPlan>
     */
    @Override
    public List<TcdwPlan> getTcdwPlanList(Map<String, Object> params) {
        return tcdwPlanMapper.getTcdwPlanList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addTcdwPlan(TcdwPlan obj) {
        tcdwPlanMapper.addTcdwPlan(obj);
    }

    public List getWorkarea(String workshopid) {
        return tcdwPlanMapper.getWorkarea(workshopid);
    }

    public List getWorkshopByWorkarea(String workareaid) {
        return tcdwPlanMapper.getWorkshopByWorkarea(workareaid);
    }

    public String getShortOrg(String org) {
        return tcdwPlanMapper.getShortOrg(org);
    }

    public String getByMaxNo(String code) {
        return tcdwPlanMapper.getByMaxNo(code);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchTcdwPlan(List<TcdwPlan> list) {
        tcdwPlanMapper.addBatchTcdwPlan(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateTcdwPlan(TcdwPlan obj) {
        tcdwPlanMapper.updateTcdwPlan(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchTcdwPlan(List<TcdwPlan> list) {
        tcdwPlanMapper.updateBatchTcdwPlan(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteTcdwPlanById(Long id) {
        tcdwPlanMapper.deleteTcdwPlanById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchTcdwPlan(List<Long> ids) {
        tcdwPlanMapper.deleteBatchTcdwPlan(ids);
    }

}
