package com.tieda.alarm.service.testTsdc.impl;

import com.tieda.alarm.entity.testTsdc.TestTsdc;
import com.tieda.alarm.mapper.testTsdc.TestTsdcMapper;
import com.tieda.alarm.service.testTsdc.ITestTsdcService;
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
        public class TestTsdcServiceImpl extends ServiceImpl<TestTsdcMapper, TestTsdc>implements ITestTsdcService {


        @Autowired
    TestTsdcMapper testTsdcMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestTsdc
         */
        @Override
        public TestTsdc getTestTsdcById(Long id){
        return testTsdcMapper.getTestTsdcById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestTsdc>
         */
        @Override
        public List<TestTsdc>getTestTsdcList(Map<String,Object>params){
        return testTsdcMapper.getTestTsdcList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestTsdc(TestTsdc obj){
    testTsdcMapper.addTestTsdc(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestTsdc(List<TestTsdc>list){
    testTsdcMapper.addBatchTestTsdc(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestTsdc(TestTsdc obj){
    testTsdcMapper.updateTestTsdc(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestTsdc(List<TestTsdc>list){
    testTsdcMapper.updateBatchTestTsdc(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestTsdcById(Long id){
    testTsdcMapper.deleteTestTsdcById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestTsdc(List<Long>ids){
    testTsdcMapper.deleteBatchTestTsdc(ids);
        }

        }
