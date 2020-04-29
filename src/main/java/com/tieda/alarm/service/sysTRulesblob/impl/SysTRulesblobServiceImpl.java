package com.tieda.alarm.service.sysTRulesblob.impl;

import com.tieda.alarm.entity.sysTRulesblob.SysTRulesblob;
import com.tieda.alarm.mapper.sysTRulesblob.SysTRulesblobMapper;
import com.tieda.alarm.service.sysTRulesblob.ISysTRulesblobService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 技术规章文件表 服务实现类
 * </p>
 *
 * @author
 * @since 2019-09-03
 */
@Service
@Transactional
public class SysTRulesblobServiceImpl extends ServiceImpl<SysTRulesblobMapper, SysTRulesblob> implements ISysTRulesblobService {


    @Autowired
    SysTRulesblobMapper sysTRules$blobMapper;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return SysTRules$blob
     */
    @Override
    public SysTRulesblob getSysTRulesblobById(Long id) {
        return sysTRules$blobMapper.getSysTRulesblobById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<SysTRules$blob>
     */
    @Override
    public List<SysTRulesblob> getSysTRulesblobList(Map<String, Object> params) {
        return sysTRules$blobMapper.getSysTRulesblobList(params);
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addSysTRulesblob(SysTRulesblob obj) {
        sysTRules$blobMapper.addSysTRulesblob(obj);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchSysTRulesblob(List<SysTRulesblob> list) {
        sysTRules$blobMapper.addBatchSysTRulesblob(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateSysTRulesblob(SysTRulesblob obj) {
        sysTRules$blobMapper.updateSysTRulesblob(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchSysTRulesblob(List<SysTRulesblob> list) {
        sysTRules$blobMapper.updateBatchSysTRulesblob(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteSysTRulesblobById(Long id) {
        sysTRules$blobMapper.deleteSysTRulesblobById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchSysTRulesblob(List<Long> ids) {
        sysTRules$blobMapper.deleteBatchSysTRulesblob(ids);
    }

}
