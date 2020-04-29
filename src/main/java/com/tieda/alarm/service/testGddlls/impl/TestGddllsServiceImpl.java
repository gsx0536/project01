package com.tieda.alarm.service.testGddlls.impl;

import com.tieda.alarm.entity.testGddlls.TestGddlls;
import com.tieda.alarm.mapper.testGddlls.TestGddllsMapper;
import com.tieda.alarm.service.testGddlls.ITestGddllsService;
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
 * @since 2019-10-11
 */
@Service
@Transactional
        public class TestGddllsServiceImpl extends ServiceImpl<TestGddllsMapper, TestGddlls>implements ITestGddllsService {


        @Autowired
    TestGddllsMapper testGddllsMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestGddlls
         */
        @Override
        public TestGddlls getTestGddllsById(Long id){
        return testGddllsMapper.getTestGddllsById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestGddlls>
         */
        @Override
        public List<TestGddlls>getTestGddllsList(Map<String,Object>params){
        return testGddllsMapper.getTestGddllsList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestGddlls(TestGddlls obj){
    testGddllsMapper.addTestGddlls(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestGddlls(List<TestGddlls>list){
    testGddllsMapper.addBatchTestGddlls(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestGddlls(TestGddlls obj){
    testGddllsMapper.updateTestGddlls(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestGddlls(List<TestGddlls>list){
    testGddllsMapper.updateBatchTestGddlls(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestGddllsById(Long id){
    testGddllsMapper.deleteTestGddllsById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestGddlls(List<Long>ids){
    testGddllsMapper.deleteBatchTestGddlls(ids);
        }

        }
