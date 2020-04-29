package com.tieda.alarm.service.customTableTree.impl;

import com.tieda.alarm.entity.customTableTree.CustomTableTree;
import com.tieda.alarm.mapper.customTableTree.CustomTableTreeMapper;
import com.tieda.alarm.service.customTableTree.ICustomTableTreeService;
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
 * @since 2019-09-28
 */
@Service
@Transactional
        public class CustomTableTreeServiceImpl extends ServiceImpl<CustomTableTreeMapper, CustomTableTree>implements ICustomTableTreeService {


        @Autowired
    CustomTableTreeMapper customTableTreeMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  CustomTableTree
         */
        @Override
        public CustomTableTree getCustomTableTreeById(Long id){
        return customTableTreeMapper.getCustomTableTreeById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<CustomTableTree>
         */
        @Override
        public List<CustomTableTree>getCustomTableTreeList(Map<String,Object>params){
        return customTableTreeMapper.getCustomTableTreeList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addCustomTableTree(CustomTableTree obj){
    customTableTreeMapper.addCustomTableTree(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchCustomTableTree(List<CustomTableTree>list){
    customTableTreeMapper.addBatchCustomTableTree(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateCustomTableTree(CustomTableTree obj){
    customTableTreeMapper.updateCustomTableTree(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchCustomTableTree(List<CustomTableTree>list){
    customTableTreeMapper.updateBatchCustomTableTree(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteCustomTableTreeById(Long id){
    customTableTreeMapper.deleteCustomTableTreeById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchCustomTableTree(List<Long>ids){
    customTableTreeMapper.deleteBatchCustomTableTree(ids);
        }

        }
