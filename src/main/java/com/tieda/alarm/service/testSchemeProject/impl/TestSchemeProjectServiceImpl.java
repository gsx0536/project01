package com.tieda.alarm.service.testSchemeProject.impl;

import com.tieda.alarm.entity.testSchemeProject.TestSchemeProject;
import com.tieda.alarm.mapper.testSchemeProject.TestSchemeProjectMapper;
import com.tieda.alarm.service.testSchemeProject.ITestSchemeProjectService;
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
        public class TestSchemeProjectServiceImpl extends ServiceImpl<TestSchemeProjectMapper, TestSchemeProject>implements ITestSchemeProjectService {


        @Autowired
    TestSchemeProjectMapper testSchemeProjectMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestSchemeProject
         */
        @Override
        public TestSchemeProject getTestSchemeProjectById(Long id){
        return testSchemeProjectMapper.getTestSchemeProjectById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestSchemeProject>
         */
        @Override
        public List<TestSchemeProject>getTestSchemeProjectList(Map<String,Object>params){
        return testSchemeProjectMapper.getTestSchemeProjectList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestSchemeProject(TestSchemeProject obj){
    testSchemeProjectMapper.addTestSchemeProject(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestSchemeProject(List<TestSchemeProject>list){
    testSchemeProjectMapper.addBatchTestSchemeProject(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestSchemeProject(TestSchemeProject obj){
    testSchemeProjectMapper.updateTestSchemeProject(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestSchemeProject(List<TestSchemeProject>list){
    testSchemeProjectMapper.updateBatchTestSchemeProject(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestSchemeProjectById(Long id){
    testSchemeProjectMapper.deleteTestSchemeProjectById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestSchemeProject(List<Long>ids){
    testSchemeProjectMapper.deleteBatchTestSchemeProject(ids);
        }

        }
