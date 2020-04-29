package com.tieda.alarm.service.testGddlls;
import com.tieda.alarm.entity.testGddlls.TestGddlls;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-10-11
 */
public interface ITestGddllsService extends IService<TestGddlls> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestGddlls
         */
    TestGddlls getTestGddllsById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestGddlls>
         */
        List<TestGddlls> getTestGddllsList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addTestGddlls(TestGddlls obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestGddlls(List<TestGddlls> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestGddlls(TestGddlls obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestGddlls(List<TestGddlls> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestGddllsById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestGddlls(List<Long> ids);
        }
