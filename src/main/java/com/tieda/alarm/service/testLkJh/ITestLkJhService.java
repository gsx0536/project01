package com.tieda.alarm.service.testLkJh;
import com.tieda.alarm.entity.testLkJh.TestLkJh;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-10-09
 */
public interface ITestLkJhService extends IService<TestLkJh> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestLkJh
         */
    TestLkJh getTestLkJhById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestLkJh>
         */
        List<TestLkJh> getTestLkJhList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addTestLkJh(TestLkJh obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestLkJh(List<TestLkJh> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestLkJh(TestLkJh obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestLkJh(List<TestLkJh> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestLkJhById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestLkJh(List<Long> ids);
        }
