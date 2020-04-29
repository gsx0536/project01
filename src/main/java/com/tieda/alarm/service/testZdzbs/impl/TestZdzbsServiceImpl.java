package com.tieda.alarm.service.testZdzbs.impl;

import com.tieda.alarm.entity.testZdzbs.TestZdzbs;
import com.tieda.alarm.mapper.testZdzbs.TestZdzbsMapper;
import com.tieda.alarm.service.testZdzbs.ITestZdzbsService;
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
        public class TestZdzbsServiceImpl extends ServiceImpl<TestZdzbsMapper, TestZdzbs>implements ITestZdzbsService {


        @Autowired
    TestZdzbsMapper testZdzbsMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestZdzbs
         */
        @Override
        public TestZdzbs getTestZdzbsById(Long id){
        return testZdzbsMapper.getTestZdzbsById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestZdzbs>
         */
        @Override
        public List<TestZdzbs>getTestZdzbsList(Map<String,Object>params){
        return testZdzbsMapper.getTestZdzbsList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestZdzbs(TestZdzbs obj){
    testZdzbsMapper.addTestZdzbs(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestZdzbs(List<TestZdzbs>list){
    testZdzbsMapper.addBatchTestZdzbs(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestZdzbs(TestZdzbs obj){
    testZdzbsMapper.updateTestZdzbs(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestZdzbs(List<TestZdzbs>list){
    testZdzbsMapper.updateBatchTestZdzbs(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestZdzbsById(Long id){
    testZdzbsMapper.deleteTestZdzbsById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestZdzbs(List<Long>ids){
    testZdzbsMapper.deleteBatchTestZdzbs(ids);
        }

        }
