package com.tieda.alarm.mapper.testSchemeProject;
import com.tieda.alarm.entity.testSchemeProject.TestSchemeProject;
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
public interface TestSchemeProjectMapper extends BaseMapper<TestSchemeProject> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestSchemeProject
         */
    TestSchemeProject getTestSchemeProjectById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestSchemeProject>
         */
        List<TestSchemeProject> getTestSchemeProjectList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
        */
        void addTestSchemeProject(TestSchemeProject obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestSchemeProject(List<TestSchemeProject> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestSchemeProject(TestSchemeProject obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestSchemeProject(List<TestSchemeProject> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestSchemeProjectById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestSchemeProject(List<Long> ids);

        }
