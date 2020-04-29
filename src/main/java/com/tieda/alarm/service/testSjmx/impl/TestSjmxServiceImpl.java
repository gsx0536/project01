package com.tieda.alarm.service.testSjmx.impl;

import com.tieda.alarm.entity.testSjmx.TestSjmx;
import com.tieda.alarm.mapper.testSjmx.TestSjmxMapper;
import com.tieda.alarm.service.testSjmx.ITestSjmxService;
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
        public class TestSjmxServiceImpl extends ServiceImpl<TestSjmxMapper, TestSjmx>implements ITestSjmxService {


        @Autowired
    TestSjmxMapper testSjmxMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestSjmx
         */
        @Override
        public TestSjmx getTestSjmxById(Long id){
        return testSjmxMapper.getTestSjmxById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestSjmx>
         */
        @Override
        public List<TestSjmx>getTestSjmxList(Map<String,Object>params){
        return testSjmxMapper.getTestSjmxList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestSjmx(TestSjmx obj){
    testSjmxMapper.addTestSjmx(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestSjmx(List<TestSjmx>list){
    testSjmxMapper.addBatchTestSjmx(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestSjmx(TestSjmx obj){
    testSjmxMapper.updateTestSjmx(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestSjmx(List<TestSjmx>list){
    testSjmxMapper.updateBatchTestSjmx(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestSjmxById(Long id){
    testSjmxMapper.deleteTestSjmxById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestSjmx(List<Long>ids){
    testSjmxMapper.deleteBatchTestSjmx(ids);
        }

        }
