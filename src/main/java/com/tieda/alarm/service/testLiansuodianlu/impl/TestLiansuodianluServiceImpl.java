package com.tieda.alarm.service.testLiansuodianlu.impl;

import com.tieda.alarm.entity.testLiansuodianlu.TestLiansuodianlu;
import com.tieda.alarm.mapper.testLiansuodianlu.TestLiansuodianluMapper;
import com.tieda.alarm.service.testLiansuodianlu.ITestLiansuodianluService;
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
 * @since 2019-10-16
 */
@Service
@Transactional
        public class TestLiansuodianluServiceImpl extends ServiceImpl<TestLiansuodianluMapper, TestLiansuodianlu>implements ITestLiansuodianluService {


        @Autowired
    TestLiansuodianluMapper testLiansuodianluMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestLiansuodianlu
         */
        @Override
        public TestLiansuodianlu getTestLiansuodianluById(Long id){
        return testLiansuodianluMapper.getTestLiansuodianluById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestLiansuodianlu>
         */
        @Override
        public List<TestLiansuodianlu>getTestLiansuodianluList(Map<String,Object>params){
        return testLiansuodianluMapper.getTestLiansuodianluList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestLiansuodianlu(TestLiansuodianlu obj){
    testLiansuodianluMapper.addTestLiansuodianlu(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestLiansuodianlu(List<TestLiansuodianlu>list){
    testLiansuodianluMapper.addBatchTestLiansuodianlu(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestLiansuodianlu(TestLiansuodianlu obj){
    testLiansuodianluMapper.updateTestLiansuodianlu(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestLiansuodianlu(List<TestLiansuodianlu>list){
    testLiansuodianluMapper.updateBatchTestLiansuodianlu(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestLiansuodianluById(Long id){
    testLiansuodianluMapper.deleteTestLiansuodianluById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestLiansuodianlu(List<Long>ids){
    testLiansuodianluMapper.deleteBatchTestLiansuodianlu(ids);
        }

        }
