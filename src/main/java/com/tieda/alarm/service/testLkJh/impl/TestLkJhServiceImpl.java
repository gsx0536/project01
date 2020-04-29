package com.tieda.alarm.service.testLkJh.impl;

import com.tieda.alarm.entity.testLkJh.TestLkJh;
import com.tieda.alarm.mapper.testLkJh.TestLkJhMapper;
import com.tieda.alarm.service.testLkJh.ITestLkJhService;
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
 * @since 2019-10-09
 */
@Service
@Transactional
        public class TestLkJhServiceImpl extends ServiceImpl<TestLkJhMapper, TestLkJh>implements ITestLkJhService {


        @Autowired
    TestLkJhMapper testLkJhMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestLkJh
         */
        @Override
        public TestLkJh getTestLkJhById(Long id){
        return testLkJhMapper.getTestLkJhById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestLkJh>
         */
        @Override
        public List<TestLkJh>getTestLkJhList(Map<String,Object>params){
        return testLkJhMapper.getTestLkJhList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestLkJh(TestLkJh obj){
    testLkJhMapper.addTestLkJh(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestLkJh(List<TestLkJh>list){
    testLkJhMapper.addBatchTestLkJh(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestLkJh(TestLkJh obj){
    testLkJhMapper.updateTestLkJh(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestLkJh(List<TestLkJh>list){
    testLkJhMapper.updateBatchTestLkJh(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestLkJhById(Long id){
    testLkJhMapper.deleteTestLkJhById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestLkJh(List<Long>ids){
    testLkJhMapper.deleteBatchTestLkJh(ids);
        }

        }
