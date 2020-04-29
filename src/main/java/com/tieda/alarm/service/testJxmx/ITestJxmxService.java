package com.tieda.alarm.service.testJxmx;
import com.tieda.alarm.entity.testJxmx.TestJxmx;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-10-17
 */
public interface ITestJxmxService extends IService<TestJxmx> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestJxmx
         */
    TestJxmx getTestJxmxById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestJxmx>
         */
        List<TestJxmx> getTestJxmxList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addTestJxmx(TestJxmx obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestJxmx(List<TestJxmx> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestJxmx(TestJxmx obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestJxmx(List<TestJxmx> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestJxmxById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestJxmx(List<Long> ids);
        }
