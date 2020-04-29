package com.tieda.alarm.service.testLiansuoCheck.impl;

import com.tieda.alarm.entity.testLiansuoCheck.TestLiansuoCheck;
import com.tieda.alarm.mapper.testLiansuoCheck.TestLiansuoCheckMapper;
import com.tieda.alarm.service.testLiansuoCheck.ITestLiansuoCheckService;
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
        public class TestLiansuoCheckServiceImpl extends ServiceImpl<TestLiansuoCheckMapper, TestLiansuoCheck>implements ITestLiansuoCheckService {


        @Autowired
    TestLiansuoCheckMapper testLiansuoCheckMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestLiansuoCheck
         */
        @Override
        public TestLiansuoCheck getTestLiansuoCheckById(Long id){
        return testLiansuoCheckMapper.getTestLiansuoCheckById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestLiansuoCheck>
         */
        @Override
        public List<TestLiansuoCheck>getTestLiansuoCheckList(Map<String,Object>params){
        return testLiansuoCheckMapper.getTestLiansuoCheckList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestLiansuoCheck(TestLiansuoCheck obj){
    testLiansuoCheckMapper.addTestLiansuoCheck(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestLiansuoCheck(List<TestLiansuoCheck>list){
    testLiansuoCheckMapper.addBatchTestLiansuoCheck(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestLiansuoCheck(TestLiansuoCheck obj){
    testLiansuoCheckMapper.updateTestLiansuoCheck(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestLiansuoCheck(List<TestLiansuoCheck>list){
    testLiansuoCheckMapper.updateBatchTestLiansuoCheck(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestLiansuoCheckById(Long id){
    testLiansuoCheckMapper.deleteTestLiansuoCheckById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestLiansuoCheck(List<Long>ids){
    testLiansuoCheckMapper.deleteBatchTestLiansuoCheck(ids);
        }

        }
