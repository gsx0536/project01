package com.tieda.alarm.mapper.testSchemePerson;
import com.tieda.alarm.entity.testSchemePerson.TestSchemePerson;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-12-11
 */
@Repository
@Mapper
public interface TestSchemePersonMapper extends BaseMapper<TestSchemePerson> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestSchemePerson
         */
    TestSchemePerson getTestSchemePersonById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestSchemePerson>
         */
        List<TestSchemePerson> getTestSchemePersonList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
        */
        void addTestSchemePerson(TestSchemePerson obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestSchemePerson(List<TestSchemePerson> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestSchemePerson(TestSchemePerson obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestSchemePerson(List<TestSchemePerson> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestSchemePersonById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestSchemePerson(List<Long> ids);

        }
