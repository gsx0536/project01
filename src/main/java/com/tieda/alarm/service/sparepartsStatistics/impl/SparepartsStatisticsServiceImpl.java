package com.tieda.alarm.service.sparepartsStatistics.impl;

import com.tieda.alarm.entity.sparepartsStatistics.SparepartsStatistics;
import com.tieda.alarm.mapper.sparepartsStatistics.SparepartsStatisticsMapper;
import com.tieda.alarm.service.sparepartsStatistics.ISparepartsStatisticsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2019-05-26
 */
@Service
@Transactional
public class SparepartsStatisticsServiceImpl extends ServiceImpl<SparepartsStatisticsMapper, SparepartsStatistics> implements ISparepartsStatisticsService {

    
    @Autowired
    SparepartsStatisticsMapper sparepartsStatisticsMapper;

    /**
     * 根据 id 查询对象
     * @param id    对象 id
     * @return  SparepartsStatistics
     */
    @Override
    public SparepartsStatistics getSparepartsStatisticsById(Long id) {
        return sparepartsStatisticsMapper.getSparepartsStatisticsById(id);
    }

    /**
     * 查询对象列表信息
     * @param params    查询参数
     * @return List<SparepartsStatistics>
     */
    @Override
    public List<SparepartsStatistics> getSparepartsStatisticsList(Map<String, Object> params) {
        return sparepartsStatisticsMapper.getSparepartsStatisticsList(params);
    }

    /**
     * 添加对象实体
     * @param obj   对象实体
     */
    @Override
    public void addSparepartsStatistics(SparepartsStatistics obj) {
        sparepartsStatisticsMapper.addSparepartsStatistics(obj);
    }

    /**
     * 批量添加对象实体
     * @param list   对象实体集合
     */
    @Override
    public void addBatchSparepartsStatistics(List<SparepartsStatistics> list) {
        sparepartsStatisticsMapper.addBatchSparepartsStatistics(list);
    }

    /**
     * 更新对象实体
     * @param obj   对象实体
     */
    @Override
    public void updateSparepartsStatistics(SparepartsStatistics obj) {
        sparepartsStatisticsMapper.updateSparepartsStatistics(obj);
    }

    /**
    * 批量更新对象实体
    * @param list  对象实体集合
    */
    @Override
    public void updateBatchSparepartsStatistics(List<SparepartsStatistics> list) {
        sparepartsStatisticsMapper.updateBatchSparepartsStatistics(list);
    }

    /**
     * 根据ID删除对象实体
     * @param id 对象ID
     */
    @Override
    public void deleteSparepartsStatisticsById(Long id) {
        sparepartsStatisticsMapper.deleteSparepartsStatisticsById(id);
    }

    /**
     * 批量删除对象实体
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchSparepartsStatistics(List<Long> ids) {
        sparepartsStatisticsMapper.deleteBatchSparepartsStatistics(ids);
    }

}
