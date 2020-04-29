package com.tieda.alarm.mapper.testZnypdm;
import com.tieda.alarm.entity.testZnypdm.TestZnypdm;
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
public interface TestZnypdmMapper extends BaseMapper<TestZnypdm> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestZnypdm
         */
    TestZnypdm getTestZnypdmById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestZnypdm>
         */
        List<TestZnypdm> getTestZnypdmList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
        */
        void addTestZnypdm(TestZnypdm obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestZnypdm(List<TestZnypdm> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestZnypdm(TestZnypdm obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestZnypdm(List<TestZnypdm> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestZnypdmById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestZnypdm(List<Long> ids);

        }
