package com.tieda.alarm.service.ymVMonthimpworkFinishKmn.impl;

import com.tieda.alarm.entity.ymVMonthimpworkFinishKmn.YmVMonthimpworkFinishKmn;
import com.tieda.alarm.mapper.ymVMonthimpworkFinishKmn.YmVMonthimpworkFinishKmnMapper;
import com.tieda.alarm.service.ymVMonthimpworkFinishKmn.IYmVMonthimpworkFinishKmnService;
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
 * @since 2019-06-11
 */
@Service
@Transactional
        public class YmVMonthimpworkFinishKmnServiceImpl extends ServiceImpl<YmVMonthimpworkFinishKmnMapper, YmVMonthimpworkFinishKmn>implements IYmVMonthimpworkFinishKmnService {


        @Autowired
    YmVMonthimpworkFinishKmnMapper ymVMonthimpworkFinishKmnMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YmVMonthimpworkFinishKmn
         */
        @Override
        public YmVMonthimpworkFinishKmn getYmVMonthimpworkFinishKmnById(Long id){
        return ymVMonthimpworkFinishKmnMapper.getYmVMonthimpworkFinishKmnById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YmVMonthimpworkFinishKmn>
         */
        @Override
        public List<YmVMonthimpworkFinishKmn>getYmVMonthimpworkFinishKmnList(Map<String,Object>params){
        return ymVMonthimpworkFinishKmnMapper.getYmVMonthimpworkFinishKmnList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addYmVMonthimpworkFinishKmn(YmVMonthimpworkFinishKmn obj){
    ymVMonthimpworkFinishKmnMapper.addYmVMonthimpworkFinishKmn(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchYmVMonthimpworkFinishKmn(List<YmVMonthimpworkFinishKmn>list){
    ymVMonthimpworkFinishKmnMapper.addBatchYmVMonthimpworkFinishKmn(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateYmVMonthimpworkFinishKmn(YmVMonthimpworkFinishKmn obj){
    ymVMonthimpworkFinishKmnMapper.updateYmVMonthimpworkFinishKmn(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchYmVMonthimpworkFinishKmn(List<YmVMonthimpworkFinishKmn>list){
    ymVMonthimpworkFinishKmnMapper.updateBatchYmVMonthimpworkFinishKmn(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteYmVMonthimpworkFinishKmnById(Long id){
    ymVMonthimpworkFinishKmnMapper.deleteYmVMonthimpworkFinishKmnById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchYmVMonthimpworkFinishKmn(List<Long>ids){
    ymVMonthimpworkFinishKmnMapper.deleteBatchYmVMonthimpworkFinishKmn(ids);
        }

        }
