package com.tieda.alarm.service.testLiansuodl.impl;

import com.tieda.alarm.entity.testLiansuodl.TestLiansuodl;
import com.tieda.alarm.mapper.testLiansuodl.TestLiansuodlMapper;
import com.tieda.alarm.service.testLiansuodl.ITestLiansuodlService;
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
        public class TestLiansuodlServiceImpl extends ServiceImpl<TestLiansuodlMapper, TestLiansuodl>implements ITestLiansuodlService {


        @Autowired
    TestLiansuodlMapper testLiansuodlMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestLiansuodl
         */
        @Override
        public TestLiansuodl getTestLiansuodlById(Long id){
        return testLiansuodlMapper.getTestLiansuodlById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestLiansuodl>
         */
        @Override
        public List<TestLiansuodl>getTestLiansuodlList(Map<String,Object>params){
        return testLiansuodlMapper.getTestLiansuodlList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestLiansuodl(TestLiansuodl obj){
    testLiansuodlMapper.addTestLiansuodl(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestLiansuodl(List<TestLiansuodl>list){
    testLiansuodlMapper.addBatchTestLiansuodl(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestLiansuodl(TestLiansuodl obj){
    testLiansuodlMapper.updateTestLiansuodl(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestLiansuodl(List<TestLiansuodl>list){
    testLiansuodlMapper.updateBatchTestLiansuodl(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestLiansuodlById(Long id){
    testLiansuodlMapper.deleteTestLiansuodlById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestLiansuodl(List<Long>ids){
    testLiansuodlMapper.deleteBatchTestLiansuodl(ids);
        }

        }
