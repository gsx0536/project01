package com.tieda.alarm.mapper.testXhjls;
import com.tieda.alarm.entity.testXhjls.TestXhjls;
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
 * @since 2019-10-17
 */
@Repository
@Mapper
public interface TestXhjlsMapper extends BaseMapper<TestXhjls> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestXhjls
         */
    TestXhjls getTestXhjlsById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestXhjls>
         */
        List<TestXhjls> getTestXhjlsList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
        */
        void addTestXhjls(TestXhjls obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestXhjls(List<TestXhjls> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestXhjls(TestXhjls obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestXhjls(List<TestXhjls> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestXhjlsById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestXhjls(List<Long> ids);

        }
