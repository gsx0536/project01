package com.tieda.alarm.mapper.testScheme;
import com.tieda.alarm.entity.testScheme.TestScheme;
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
public interface TestSchemeMapper extends BaseMapper<TestScheme> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestScheme
         */
    TestScheme getTestSchemeById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestScheme>
         */
        List<TestScheme> getTestSchemeList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
        */
        void addTestScheme(TestScheme obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestScheme(List<TestScheme> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestScheme(TestScheme obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestScheme(List<TestScheme> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestSchemeById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestScheme(List<Long> ids);

        }
