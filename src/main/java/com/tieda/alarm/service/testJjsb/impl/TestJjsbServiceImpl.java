package com.tieda.alarm.service.testJjsb.impl;

import com.tieda.alarm.entity.testJjsb.TestJjsb;
import com.tieda.alarm.mapper.testJjsb.TestJjsbMapper;
import com.tieda.alarm.service.testJjsb.ITestJjsbService;
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
        public class TestJjsbServiceImpl extends ServiceImpl<TestJjsbMapper, TestJjsb>implements ITestJjsbService {


        @Autowired
    TestJjsbMapper testJjsbMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestJjsb
         */
        @Override
        public TestJjsb getTestJjsbById(Long id){
        return testJjsbMapper.getTestJjsbById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestJjsb>
         */
        @Override
        public List<TestJjsb>getTestJjsbList(Map<String,Object>params){
        return testJjsbMapper.getTestJjsbList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestJjsb(TestJjsb obj){
    testJjsbMapper.addTestJjsb(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestJjsb(List<TestJjsb>list){
    testJjsbMapper.addBatchTestJjsb(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestJjsb(TestJjsb obj){
    testJjsbMapper.updateTestJjsb(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestJjsb(List<TestJjsb>list){
    testJjsbMapper.updateBatchTestJjsb(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestJjsbById(Long id){
    testJjsbMapper.deleteTestJjsbById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestJjsb(List<Long>ids){
    testJjsbMapper.deleteBatchTestJjsb(ids);
        }

        }
