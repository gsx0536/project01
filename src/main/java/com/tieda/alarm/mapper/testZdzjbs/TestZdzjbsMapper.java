package com.tieda.alarm.mapper.testZdzjbs;
import com.tieda.alarm.entity.testZdzjbs.TestZdzjbs;
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
public interface TestZdzjbsMapper extends BaseMapper<TestZdzjbs> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestZdzjbs
         */
    TestZdzjbs getTestZdzjbsById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestZdzjbs>
         */
        List<TestZdzjbs> getTestZdzjbsList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
        */
        void addTestZdzjbs(TestZdzjbs obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestZdzjbs(List<TestZdzjbs> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestZdzjbs(TestZdzjbs obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestZdzjbs(List<TestZdzjbs> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestZdzjbsById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestZdzjbs(List<Long> ids);

        }
