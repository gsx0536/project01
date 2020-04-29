package com.tieda.alarm.service.testZdzbs;
import com.tieda.alarm.entity.testZdzbs.TestZdzbs;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-10-18
 */
public interface ITestZdzbsService extends IService<TestZdzbs> {

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
