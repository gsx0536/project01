package com.tieda.alarm.service.ymTMonthimpworkMKmn.impl;

import com.tieda.alarm.entity.ymTMonthimpworkMKmn.YmTMonthimpworkMKmn;
import com.tieda.alarm.mapper.ymTMonthimpworkMKmn.YmTMonthimpworkMKmnMapper;
import com.tieda.alarm.service.ymTMonthimpworkMKmn.IYmTMonthimpworkMKmnService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 昆明月度重点工作主表 服务实现类
 * </p>
 *
 * @author 
 * @since 2019-06-02
 */
@Service
@Transactional
        public class YmTMonthimpworkMKmnServiceImpl extends ServiceImpl<YmTMonthimpworkMKmnMapper, YmTMonthimpworkMKmn>implements IYmTMonthimpworkMKmnService {


        @Autowired
    YmTMonthimpworkMKmnMapper ymTMonthimpworkMKmnMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YmTMonthimpworkMKmn
         */
        @Override
        public YmTMonthimpworkMKmn getYmTMonthimpworkMKmnById(Long id){
        return ymTMonthimpworkMKmnMapper.getYmTMonthimpworkMKmnById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YmTMonthimpworkMKmn>
         */
        @Override
        public List<YmTMonthimpworkMKmn>getYmTMonthimpworkMKmnList(Map<String,Object>params){
        return ymTMonthimpworkMKmnMapper.getYmTMonthimpworkMKmnList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addYmTMonthimpworkMKmn(YmTMonthimpworkMKmn obj){
    ymTMonthimpworkMKmnMapper.addYmTMonthimpworkMKmn(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchYmTMonthimpworkMKmn(List<YmTMonthimpworkMKmn>list){
    ymTMonthimpworkMKmnMapper.addBatchYmTMonthimpworkMKmn(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateYmTMonthimpworkMKmn(YmTMonthimpworkMKmn obj){
    ymTMonthimpworkMKmnMapper.updateYmTMonthimpworkMKmn(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchYmTMonthimpworkMKmn(List<YmTMonthimpworkMKmn>list){
    ymTMonthimpworkMKmnMapper.updateBatchYmTMonthimpworkMKmn(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteYmTMonthimpworkMKmnById(Long id){
    ymTMonthimpworkMKmnMapper.deleteYmTMonthimpworkMKmnById(id);
        }

    /**
     * 批量删除对象实体
     * @param ids 对象实体ID集合
     * @return
     */
    @Override
    public void deleteBatchYmTMonthimpworkMKmn(List<Long>ids){
        ymTMonthimpworkMKmnMapper.deleteBatchYmTMonthimpworkMKmn(ids);
    }

    /**
     * 插入签收表
     * @param id 主表ID
     * @return
     */
    @Override
    public void insertymTMonthFinishKmn(String  mid){
        ymTMonthimpworkMKmnMapper.insertymTMonthFinishKmn(mid);
    }

        }
