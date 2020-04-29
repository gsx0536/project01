package com.tieda.alarm.service.testSchemePerson.impl;

import com.tieda.alarm.entity.testSchemePerson.TestSchemePerson;
import com.tieda.alarm.mapper.testSchemePerson.TestSchemePersonMapper;
import com.tieda.alarm.service.testSchemePerson.ITestSchemePersonService;
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
 * @since 2019-12-11
 */
@Service
@Transactional
        public class TestSchemePersonServiceImpl extends ServiceImpl<TestSchemePersonMapper, TestSchemePerson>implements ITestSchemePersonService {


        @Autowired
    TestSchemePersonMapper testSchemePersonMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestSchemePerson
         */
        @Override
        public TestSchemePerson getTestSchemePersonById(Long id){
        return testSchemePersonMapper.getTestSchemePersonById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestSchemePerson>
         */
        @Override
        public List<TestSchemePerson>getTestSchemePersonList(Map<String,Object>params){
        return testSchemePersonMapper.getTestSchemePersonList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestSchemePerson(TestSchemePerson obj){
    testSchemePersonMapper.addTestSchemePerson(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestSchemePerson(List<TestSchemePerson>list){
    testSchemePersonMapper.addBatchTestSchemePerson(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestSchemePerson(TestSchemePerson obj){
    testSchemePersonMapper.updateTestSchemePerson(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestSchemePerson(List<TestSchemePerson>list){
    testSchemePersonMapper.updateBatchTestSchemePerson(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestSchemePersonById(Long id){
    testSchemePersonMapper.deleteTestSchemePersonById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestSchemePerson(List<Long>ids){
    testSchemePersonMapper.deleteBatchTestSchemePerson(ids);
        }

        }
