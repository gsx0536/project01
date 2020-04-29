package com.tieda.alarm.mapper.tcdwPlan;
import com.tieda.alarm.entity.tcdwPlan.TcdwPlan;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 天窗点外维修作业计划审批单 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-06-19
 */
@Repository
@Mapper
public interface TcdwPlanMapper extends BaseMapper<TcdwPlan> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TcdwPlan
         */
    TcdwPlan getTcdwPlanById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TcdwPlan>
         */
        List<TcdwPlan> getTcdwPlanList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
        */
        void addTcdwPlan(TcdwPlan obj);

        List getWorkarea(String workshopid);

        List getWorkshopByWorkarea(String workareaid);

        String getShortOrg(String org);

        String getByMaxNo(String code);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTcdwPlan(List<TcdwPlan> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTcdwPlan(TcdwPlan obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTcdwPlan(List<TcdwPlan> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTcdwPlanById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTcdwPlan(List<Long> ids);

        }
