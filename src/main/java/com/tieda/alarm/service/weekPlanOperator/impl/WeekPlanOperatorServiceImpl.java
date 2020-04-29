package com.tieda.alarm.service.weekPlanOperator.impl;

import com.tieda.alarm.entity.weekPlanOperator.WeekPlanOperator;
import com.tieda.alarm.mapper.weekPlanOperator.WeekPlanOperatorMapper;
import com.tieda.alarm.service.weekPlanOperator.IWeekPlanOperatorService;
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
 * @since 2020-01-13
 */
@Service
@Transactional
        public class WeekPlanOperatorServiceImpl extends ServiceImpl<WeekPlanOperatorMapper, WeekPlanOperator>implements IWeekPlanOperatorService {


        @Autowired
    WeekPlanOperatorMapper weekPlanOperatorMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  WeekPlanOperator
         */
        @Override
        public WeekPlanOperator getWeekPlanOperatorById(Long id){
        return weekPlanOperatorMapper.getWeekPlanOperatorById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<WeekPlanOperator>
         */
        @Override
        public List<WeekPlanOperator>getWeekPlanOperatorList(Map<String,Object>params){
        return weekPlanOperatorMapper.getWeekPlanOperatorList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addWeekPlanOperator(WeekPlanOperator obj){
    weekPlanOperatorMapper.addWeekPlanOperator(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchWeekPlanOperator(List<WeekPlanOperator>list){
    weekPlanOperatorMapper.addBatchWeekPlanOperator(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateWeekPlanOperator(WeekPlanOperator obj){
    weekPlanOperatorMapper.updateWeekPlanOperator(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchWeekPlanOperator(List<WeekPlanOperator>list){
    weekPlanOperatorMapper.updateBatchWeekPlanOperator(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteWeekPlanOperatorById(Long id){
    weekPlanOperatorMapper.deleteWeekPlanOperatorById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchWeekPlanOperator(List<Long>ids){
    weekPlanOperatorMapper.deleteBatchWeekPlanOperator(ids);
        }

        }
