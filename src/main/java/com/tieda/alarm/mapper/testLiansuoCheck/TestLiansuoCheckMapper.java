package com.tieda.alarm.mapper.testLiansuoCheck;
import com.tieda.alarm.entity.testLiansuoCheck.TestLiansuoCheck;
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
 * @since 2019-09-28
 */
@Repository
@Mapper
public interface TestLiansuoCheckMapper extends BaseMapper<TestLiansuoCheck> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestLiansuoCheck
         */
    TestLiansuoCheck getTestLiansuoCheckById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestLiansuoCheck>
         */
        List<TestLiansuoCheck> getTestLiansuoCheckList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
        */
        void addTestLiansuoCheck(TestLiansuoCheck obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestLiansuoCheck(List<TestLiansuoCheck> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestLiansuoCheck(TestLiansuoCheck obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestLiansuoCheck(List<TestLiansuoCheck> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestLiansuoCheckById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestLiansuoCheck(List<Long> ids);

        }
