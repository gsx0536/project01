package com.tieda.alarm.mapper.testYbzdbs;
import com.tieda.alarm.entity.testYbzdbs.TestYbzdbs;
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
public interface TestYbzdbsMapper extends BaseMapper<TestYbzdbs> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestYbzdbs
         */
    TestYbzdbs getTestYbzdbsById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestYbzdbs>
         */
        List<TestYbzdbs> getTestYbzdbsList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
        */
        void addTestYbzdbs(TestYbzdbs obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestYbzdbs(List<TestYbzdbs> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestYbzdbs(TestYbzdbs obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestYbzdbs(List<TestYbzdbs> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestYbzdbsById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestYbzdbs(List<Long> ids);

        }
