package com.tieda.alarm.service.testPtdc.impl;

import com.tieda.alarm.entity.testPtdc.TestPtdc;
import com.tieda.alarm.mapper.testPtdc.TestPtdcMapper;
import com.tieda.alarm.service.testPtdc.ITestPtdcService;
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
        public class TestPtdcServiceImpl extends ServiceImpl<TestPtdcMapper, TestPtdc>implements ITestPtdcService {


        @Autowired
    TestPtdcMapper testPtdcMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestPtdc
         */
        @Override
        public TestPtdc getTestPtdcById(Long id){
        return testPtdcMapper.getTestPtdcById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestPtdc>
         */
        @Override
        public List<TestPtdc>getTestPtdcList(Map<String,Object>params){
        return testPtdcMapper.getTestPtdcList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestPtdc(TestPtdc obj){
    testPtdcMapper.addTestPtdc(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestPtdc(List<TestPtdc>list){
    testPtdcMapper.addBatchTestPtdc(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestPtdc(TestPtdc obj){
    testPtdcMapper.updateTestPtdc(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestPtdc(List<TestPtdc>list){
    testPtdcMapper.updateBatchTestPtdc(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestPtdcById(Long id){
    testPtdcMapper.deleteTestPtdcById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestPtdc(List<Long>ids){
    testPtdcMapper.deleteBatchTestPtdc(ids);
        }

        }
