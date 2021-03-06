package com.tieda.alarm.mapper.testZdzbs;
import com.tieda.alarm.entity.testZdzbs.TestZdzbs;
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
 * @since 2019-10-18
 */
@Repository
@Mapper
public interface TestZdzbsMapper extends BaseMapper<TestZdzbs> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestZdzbs
         */
    TestZdzbs getTestZdzbsById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestZdzbs>
         */
        List<TestZdzbs> getTestZdzbsList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
        */
        void addTestZdzbs(TestZdzbs obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestZdzbs(List<TestZdzbs> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestZdzbs(TestZdzbs obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestZdzbs(List<TestZdzbs> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestZdzbsById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestZdzbs(List<Long> ids);

        }
