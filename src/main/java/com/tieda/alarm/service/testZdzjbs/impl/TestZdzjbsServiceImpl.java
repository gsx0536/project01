package com.tieda.alarm.service.testZdzjbs.impl;

import com.tieda.alarm.entity.testZdzjbs.TestZdzjbs;
import com.tieda.alarm.mapper.testZdzjbs.TestZdzjbsMapper;
import com.tieda.alarm.service.testZdzjbs.ITestZdzjbsService;
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
        public class TestZdzjbsServiceImpl extends ServiceImpl<TestZdzjbsMapper, TestZdzjbs>implements ITestZdzjbsService {


        @Autowired
    TestZdzjbsMapper testZdzjbsMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestZdzjbs
         */
        @Override
        public TestZdzjbs getTestZdzjbsById(Long id){
        return testZdzjbsMapper.getTestZdzjbsById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestZdzjbs>
         */
        @Override
        public List<TestZdzjbs>getTestZdzjbsList(Map<String,Object>params){
        return testZdzjbsMapper.getTestZdzjbsList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestZdzjbs(TestZdzjbs obj){
    testZdzjbsMapper.addTestZdzjbs(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestZdzjbs(List<TestZdzjbs>list){
    testZdzjbsMapper.addBatchTestZdzjbs(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestZdzjbs(TestZdzjbs obj){
    testZdzjbsMapper.updateTestZdzjbs(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestZdzjbs(List<TestZdzjbs>list){
    testZdzjbsMapper.updateBatchTestZdzjbs(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestZdzjbsById(Long id){
    testZdzjbsMapper.deleteTestZdzjbsById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestZdzjbs(List<Long>ids){
    testZdzjbsMapper.deleteBatchTestZdzjbs(ids);
        }

        }
