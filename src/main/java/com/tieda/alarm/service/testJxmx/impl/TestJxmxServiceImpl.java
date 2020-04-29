package com.tieda.alarm.service.testJxmx.impl;

import com.tieda.alarm.entity.testJxmx.TestJxmx;
import com.tieda.alarm.mapper.testJxmx.TestJxmxMapper;
import com.tieda.alarm.service.testJxmx.ITestJxmxService;
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
        public class TestJxmxServiceImpl extends ServiceImpl<TestJxmxMapper, TestJxmx>implements ITestJxmxService {


        @Autowired
    TestJxmxMapper testJxmxMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestJxmx
         */
        @Override
        public TestJxmx getTestJxmxById(Long id){
        return testJxmxMapper.getTestJxmxById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestJxmx>
         */
        @Override
        public List<TestJxmx>getTestJxmxList(Map<String,Object>params){
        return testJxmxMapper.getTestJxmxList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestJxmx(TestJxmx obj){
    testJxmxMapper.addTestJxmx(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestJxmx(List<TestJxmx>list){
    testJxmxMapper.addBatchTestJxmx(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestJxmx(TestJxmx obj){
    testJxmxMapper.updateTestJxmx(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestJxmx(List<TestJxmx>list){
    testJxmxMapper.updateBatchTestJxmx(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestJxmxById(Long id){
    testJxmxMapper.deleteTestJxmxById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestJxmx(List<Long>ids){
    testJxmxMapper.deleteBatchTestJxmx(ids);
        }

        }
