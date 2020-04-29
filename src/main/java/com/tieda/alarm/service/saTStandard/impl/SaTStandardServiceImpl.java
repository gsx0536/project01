package com.tieda.alarm.service.saTStandard.impl;

import com.tieda.alarm.entity.saTStandard.SaTStandard;
import com.tieda.alarm.mapper.saTStandard.SaTStandardMapper;
import com.tieda.alarm.service.saTStandard.ISaTStandardService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 标准化规范化管理 服务实现类
 * </p>
 *
 * @author
 * @since 2019-09-02
 */
@Service
@Transactional
public class SaTStandardServiceImpl extends ServiceImpl<SaTStandardMapper, SaTStandard> implements ISaTStandardService {


    @Autowired
    SaTStandardMapper saTStandardMapper;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return SaTStandard
     */
    @Override
    public SaTStandard getSaTStandardById(Long id) {
        return saTStandardMapper.getSaTStandardById(id);
    }
    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<SaTStandard>
     */
    @Override
    public List<SaTStandard> getSaTStandardList(Map<String, Object> params) {
        return saTStandardMapper.getSaTStandardList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addSaTStandard(SaTStandard obj) {
        saTStandardMapper.addSaTStandard(obj);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchSaTStandard(List<SaTStandard> list) {
        saTStandardMapper.addBatchSaTStandard(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateSaTStandard(SaTStandard obj) {
        saTStandardMapper.updateSaTStandard(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchSaTStandard(List<SaTStandard> list) {
        saTStandardMapper.updateBatchSaTStandard(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteSaTStandardById(Long id) {
        saTStandardMapper.deleteSaTStandardById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchSaTStandard(List<Long> ids) {
        saTStandardMapper.deleteBatchSaTStandard(ids);
    }

}
