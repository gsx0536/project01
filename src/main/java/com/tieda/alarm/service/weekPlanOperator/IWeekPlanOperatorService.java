package com.tieda.alarm.service.weekPlanOperator;
import com.tieda.alarm.entity.weekPlanOperator.WeekPlanOperator;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2020-01-13
 */
public interface IWeekPlanOperatorService extends IService<WeekPlanOperator> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  WeekPlanOperator
         */
    WeekPlanOperator getWeekPlanOperatorById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<WeekPlanOperator>
         */
        List<WeekPlanOperator> getWeekPlanOperatorList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addWeekPlanOperator(WeekPlanOperator obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchWeekPlanOperator(List<WeekPlanOperator> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateWeekPlanOperator(WeekPlanOperator obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchWeekPlanOperator(List<WeekPlanOperator> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteWeekPlanOperatorById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchWeekPlanOperator(List<Long> ids);
        }
