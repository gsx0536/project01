package com.tieda.alarm.service.ymTMonthimpfinishKmn.impl;

import com.tieda.alarm.entity.ymTMonthimpfinishKmn.YmTMonthimpfinishKmn;
import com.tieda.alarm.mapper.ymTMonthimpfinishKmn.YmTMonthimpfinishKmnMapper;
import com.tieda.alarm.service.ymTMonthimpfinishKmn.IYmTMonthimpfinishKmnService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 月度重点工作完成情况 服务实现类
 * </p>
 *
 * @author 
 * @since 2019-06-05
 */
@Service
@Transactional
        public class YmTMonthimpfinishKmnServiceImpl extends ServiceImpl<YmTMonthimpfinishKmnMapper, YmTMonthimpfinishKmn>implements IYmTMonthimpfinishKmnService {


        @Autowired
    YmTMonthimpfinishKmnMapper ymTMonthimpfinishKmnMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YmTMonthimpfinishKmn
         */
        @Override
        public YmTMonthimpfinishKmn getYmTMonthimpfinishKmnById(Long id){
        return ymTMonthimpfinishKmnMapper.getYmTMonthimpfinishKmnById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YmTMonthimpfinishKmn>
         */
        @Override
        public List<YmTMonthimpfinishKmn>getYmTMonthimpfinishKmnList(Map<String,Object>params){
        return ymTMonthimpfinishKmnMapper.getYmTMonthimpfinishKmnList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addYmTMonthimpfinishKmn(YmTMonthimpfinishKmn obj){
    ymTMonthimpfinishKmnMapper.addYmTMonthimpfinishKmn(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchYmTMonthimpfinishKmn(List<YmTMonthimpfinishKmn>list){
    ymTMonthimpfinishKmnMapper.addBatchYmTMonthimpfinishKmn(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateYmTMonthimpfinishKmn(YmTMonthimpfinishKmn obj){
    ymTMonthimpfinishKmnMapper.updateYmTMonthimpfinishKmn(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchYmTMonthimpfinishKmn(List<YmTMonthimpfinishKmn>list){
    ymTMonthimpfinishKmnMapper.updateBatchYmTMonthimpfinishKmn(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteYmTMonthimpfinishKmnById(Long id){
    ymTMonthimpfinishKmnMapper.deleteYmTMonthimpfinishKmnById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchYmTMonthimpfinishKmn(List<Long>ids){
    ymTMonthimpfinishKmnMapper.deleteBatchYmTMonthimpfinishKmn(ids);
        }

        }
