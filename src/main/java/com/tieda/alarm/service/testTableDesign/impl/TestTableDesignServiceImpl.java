package com.tieda.alarm.service.testTableDesign.impl;

import com.tieda.alarm.entity.testTableDesign.TestTableDesign;
import com.tieda.alarm.mapper.testTableDesign.TestTableDesignMapper;
import com.tieda.alarm.service.testTableDesign.ITestTableDesignService;
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
        public class TestTableDesignServiceImpl extends ServiceImpl<TestTableDesignMapper, TestTableDesign>implements ITestTableDesignService {


        @Autowired
    TestTableDesignMapper testTableDesignMapper;

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestTableDesign
         */
        @Override
        public TestTableDesign getTestTableDesignById(Long id){
        return testTableDesignMapper.getTestTableDesignById(id);
        }

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestTableDesign>
         */
        @Override
        public List<TestTableDesign>getTestTableDesignList(Map<String,Object>params){
        return testTableDesignMapper.getTestTableDesignList(params);
        }

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        @Override
        public void addTestTableDesign(TestTableDesign obj){
    testTableDesignMapper.addTestTableDesign(obj);
        }

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        @Override
        public void addBatchTestTableDesign(List<TestTableDesign>list){
    testTableDesignMapper.addBatchTestTableDesign(list);
        }

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        @Override
        public void updateTestTableDesign(TestTableDesign obj){
    testTableDesignMapper.updateTestTableDesign(obj);
        }

        /**
        * 批量更新对象实体
        * @param list  对象实体集合
        */
        @Override
        public void updateBatchTestTableDesign(List<TestTableDesign>list){
    testTableDesignMapper.updateBatchTestTableDesign(list);
        }

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        @Override
        public void deleteTestTableDesignById(Long id){
    testTableDesignMapper.deleteTestTableDesignById(id);
        }

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        @Override
        public void deleteBatchTestTableDesign(List<Long>ids){
    testTableDesignMapper.deleteBatchTestTableDesign(ids);
        }

        }
