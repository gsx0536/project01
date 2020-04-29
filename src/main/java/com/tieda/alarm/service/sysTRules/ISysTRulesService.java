package com.tieda.alarm.service.sysTRules;

import com.tieda.alarm.entity.sysTRules.SysTRules;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 技术规章信息表 服务类
 * </p>
 *
 * @author
 * @since 2019-09-03
 */
public interface ISysTRulesService extends IService<SysTRules> {

    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return SysTRules
     */
    SysTRules getSysTRulesById(Long id);

    /**
     * 查询对象列表信息
     *
     * @param params 查询参数
     * @return List<SysTRules>
     */
    List<SysTRules> getSysTRulesList(Map<String, Object> params);

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     */
    void addSysTRules(SysTRules obj);

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     */
    void addBatchSysTRules(List<SysTRules> list);

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     */
    void updateSysTRules(SysTRules obj);

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     */
    void updateBatchSysTRules(List<SysTRules> list);

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     */
    void deleteSysTRulesById(Long id);

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchSysTRules(List<Long> ids);
}
