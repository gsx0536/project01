package com.tieda.alarm.service.sysTRules.impl;

import com.tieda.alarm.entity.sysTRules.SysTRules;
import com.tieda.alarm.mapper.sysTRules.SysTRulesMapper;
import com.tieda.alarm.service.sysTRules.ISysTRulesService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 技术规章信息表 服务实现类
 * </p>
 *
 * @author
 * @since 2019-09-03
 */
@Service
@Transactional
public class SysTRulesServiceImpl extends ServiceImpl<SysTRulesMapper, SysTRules> implements ISysTRulesService {


    @Autowired
    SysTRulesMapper sysTRulesMapper;

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return SysTRules
     */
    @Override
    public SysTRules getSysTRulesById(Long id) {
        return sysTRulesMapper.getSysTRulesById(id);
    }

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<SysTRules>
     */
    @Override
    public List<SysTRules> getSysTRulesList(Map<String, Object> params) {
        Object keywordObj = params.get("keyword");
        if (keywordObj != null)
        {//关键字搜索
            return sysTRulesMapper.getSysTRulesListByKeyword(keywordObj.toString());
        } else {
            return sysTRulesMapper.getSysTRulesList(params);
        }
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void addSysTRules(SysTRules obj) {
        sysTRulesMapper.addSysTRules(obj);
    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void addBatchSysTRules(List<SysTRules> list) {
        sysTRulesMapper.addBatchSysTRules(list);
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    @Override
    public void updateSysTRules(SysTRules obj) {
        sysTRulesMapper.updateSysTRules(obj);
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    @Override
    public void updateBatchSysTRules(List<SysTRules> list) {
        sysTRulesMapper.updateBatchSysTRules(list);
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    @Override
    public void deleteSysTRulesById(Long id) {
        sysTRulesMapper.deleteSysTRulesById(id);
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchSysTRules(List<Long> ids) {
        sysTRulesMapper.deleteBatchSysTRules(ids);
    }

}
