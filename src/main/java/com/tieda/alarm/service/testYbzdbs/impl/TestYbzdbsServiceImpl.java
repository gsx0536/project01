package com.tieda.alarm.service.testYbzdbs.impl;

import com.tieda.alarm.entity.testYbzdbs.TestYbzdbs;
import com.tieda.alarm.mapper.testYbzdbs.TestYbzdbsMapper;
import com.tieda.alarm.service.testYbzdbs.ITestYbzdbsService;
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
 * @since 2019-10-18
 */
@Service
@Transactional
        public class TestYbzdbsServiceImpl extends ServiceImpl<TestYbzdbsMapper, TestYbzdbs>implements ITestYbzdbsService {


        @Autowired
    TestYbzdbsMapper testYbzdbsMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestYbzdbs
         */
        @Override
        public TestYbzdbs getTestYbzdbsById(Long id){
        return testYbzdbsMapper.getTestYbzdbsById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestYbzdbs>
         */
        @Override
        public List<TestYbzdbs>getTestYbzdbsList(Map<String,Object>params){
        return testYbzdbsMapper.getTestYbzdbsList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestYbzdbs(TestYbzdbs obj){
    testYbzdbsMapper.addTestYbzdbs(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestYbzdbs(List<TestYbzdbs>list){
    testYbzdbsMapper.addBatchTestYbzdbs(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestYbzdbs(TestYbzdbs obj){
    testYbzdbsMapper.updateTestYbzdbs(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestYbzdbs(List<TestYbzdbs>list){
    testYbzdbsMapper.updateBatchTestYbzdbs(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestYbzdbsById(Long id){
    testYbzdbsMapper.deleteTestYbzdbsById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestYbzdbs(List<Long>ids){
    testYbzdbsMapper.deleteBatchTestYbzdbs(ids);
        }

        }
