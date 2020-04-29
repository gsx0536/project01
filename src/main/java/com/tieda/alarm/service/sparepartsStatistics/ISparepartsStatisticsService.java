package com.tieda.alarm.service.sparepartsStatistics;
import com.tieda.alarm.entity.sparepartsStatistics.SparepartsStatistics;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-05-26
 */
public interface ISparepartsStatisticsService extends IService<SparepartsStatistics> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  SparepartsStatistics
         */
    SparepartsStatistics getSparepartsStatisticsById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<SparepartsStatistics>
         */
        List<SparepartsStatistics> getSparepartsStatisticsList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addSparepartsStatistics(SparepartsStatistics obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchSparepartsStatistics(List<SparepartsStatistics> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateSparepartsStatistics(SparepartsStatistics obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchSparepartsStatistics(List<SparepartsStatistics> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteSparepartsStatisticsById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchSparepartsStatistics(List<Long> ids);
        }
