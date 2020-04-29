package com.tieda.alarm.service.testBzd.impl;

import com.tieda.alarm.entity.testBzd.TestBzd;
import com.tieda.alarm.mapper.testBzd.TestBzdMapper;
import com.tieda.alarm.service.testBzd.ITestBzdService;
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
        public class TestBzdServiceImpl extends ServiceImpl<TestBzdMapper, TestBzd>implements ITestBzdService {


        @Autowired
    TestBzdMapper testBzdMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestBzd
         */
        @Override
        public TestBzd getTestBzdById(Long id){
        return testBzdMapper.getTestBzdById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestBzd>
         */
        @Override
        public List<TestBzd>getTestBzdList(Map<String,Object>params){
        return testBzdMapper.getTestBzdList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestBzd(TestBzd obj){
    testBzdMapper.addTestBzd(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestBzd(List<TestBzd>list){
    testBzdMapper.addBatchTestBzd(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestBzd(TestBzd obj){
    testBzdMapper.updateTestBzd(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestBzd(List<TestBzd>list){
    testBzdMapper.updateBatchTestBzd(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestBzdById(Long id){
    testBzdMapper.deleteTestBzdById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestBzd(List<Long>ids){
    testBzdMapper.deleteBatchTestBzd(ids);
        }

        }
