package com.tieda.alarm.service.testZnypdm.impl;

import com.tieda.alarm.entity.testZnypdm.TestZnypdm;
import com.tieda.alarm.mapper.testZnypdm.TestZnypdmMapper;
import com.tieda.alarm.service.testZnypdm.ITestZnypdmService;
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
        public class TestZnypdmServiceImpl extends ServiceImpl<TestZnypdmMapper, TestZnypdm>implements ITestZnypdmService {


        @Autowired
    TestZnypdmMapper testZnypdmMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestZnypdm
         */
        @Override
        public TestZnypdm getTestZnypdmById(Long id){
        return testZnypdmMapper.getTestZnypdmById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestZnypdm>
         */
        @Override
        public List<TestZnypdm>getTestZnypdmList(Map<String,Object>params){
        return testZnypdmMapper.getTestZnypdmList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestZnypdm(TestZnypdm obj){
    testZnypdmMapper.addTestZnypdm(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestZnypdm(List<TestZnypdm>list){
    testZnypdmMapper.addBatchTestZnypdm(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestZnypdm(TestZnypdm obj){
    testZnypdmMapper.updateTestZnypdm(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestZnypdm(List<TestZnypdm>list){
    testZnypdmMapper.updateBatchTestZnypdm(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestZnypdmById(Long id){
    testZnypdmMapper.deleteTestZnypdmById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestZnypdm(List<Long>ids){
    testZnypdmMapper.deleteBatchTestZnypdm(ids);
        }

        }
