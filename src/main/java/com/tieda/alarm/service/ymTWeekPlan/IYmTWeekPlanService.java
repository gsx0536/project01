package com.tieda.alarm.service.ymTWeekPlan;
import com.tieda.alarm.entity.ymTWeekPlan.YmTWeekPlan;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2020-01-14
 */
public interface IYmTWeekPlanService extends IService<YmTWeekPlan> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YmTWeekPlan
         */
    YmTWeekPlan getYmTWeekPlanById(String id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YmTWeekPlan>
         */
        List<YmTWeekPlan> getYmTWeekPlanList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addYmTWeekPlan(YmTWeekPlan obj,String dates[]);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchYmTWeekPlan(List<YmTWeekPlan> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateYmTWeekPlan(YmTWeekPlan obj,String dates[]);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchYmTWeekPlan(List<YmTWeekPlan> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteYmTWeekPlanById(String id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchYmTWeekPlan(List<String> ids);
        }
