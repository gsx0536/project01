package com.tieda.alarm.service.testXhjls.impl;

import com.tieda.alarm.entity.testXhjls.TestXhjls;
import com.tieda.alarm.mapper.testXhjls.TestXhjlsMapper;
import com.tieda.alarm.service.testXhjls.ITestXhjlsService;
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
 * @since 2019-10-17
 */
@Service
@Transactional
        public class TestXhjlsServiceImpl extends ServiceImpl<TestXhjlsMapper, TestXhjls>implements ITestXhjlsService {


        @Autowired
    TestXhjlsMapper testXhjlsMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestXhjls
         */
        @Override
        public TestXhjls getTestXhjlsById(Long id){
        return testXhjlsMapper.getTestXhjlsById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestXhjls>
         */
        @Override
        public List<TestXhjls>getTestXhjlsList(Map<String,Object>params){
        return testXhjlsMapper.getTestXhjlsList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestXhjls(TestXhjls obj){
    testXhjlsMapper.addTestXhjls(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestXhjls(List<TestXhjls>list){
    testXhjlsMapper.addBatchTestXhjls(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestXhjls(TestXhjls obj){
    testXhjlsMapper.updateTestXhjls(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestXhjls(List<TestXhjls>list){
    testXhjlsMapper.updateBatchTestXhjls(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestXhjlsById(Long id){
    testXhjlsMapper.deleteTestXhjlsById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestXhjls(List<Long>ids){
    testXhjlsMapper.deleteBatchTestXhjls(ids);
        }

        }
