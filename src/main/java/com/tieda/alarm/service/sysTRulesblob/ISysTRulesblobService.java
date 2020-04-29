package com.tieda.alarm.service.sysTRulesblob;
import com.tieda.alarm.entity.sysTRulesblob.SysTRulesblob;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 技术规章文件表 服务类
 * </p>
 *
 * @author 
 * @since 2019-09-03
 */
public interface ISysTRulesblobService extends IService<SysTRulesblob> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  SysTRules$blob
         */
    SysTRulesblob getSysTRulesblobById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<SysTRules$blob>
         */
        List<SysTRulesblob> getSysTRulesblobList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addSysTRulesblob(SysTRulesblob obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchSysTRulesblob(List<SysTRulesblob> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateSysTRulesblob(SysTRulesblob obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchSysTRulesblob(List<SysTRulesblob> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteSysTRulesblobById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchSysTRulesblob(List<Long> ids);
        }
