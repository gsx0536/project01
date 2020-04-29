package com.tieda.alarm.service.testTsdc;
import com.tieda.alarm.entity.testTsdc.TestTsdc;
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
public interface ITestTsdcService extends IService<TestTsdc> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestTsdc
         */
    TestTsdc getTestTsdcById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestTsdc>
         */
        List<TestTsdc> getTestTsdcList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addTestTsdc(TestTsdc obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestTsdc(List<TestTsdc> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestTsdc(TestTsdc obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestTsdc(List<TestTsdc> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestTsdcById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestTsdc(List<Long> ids);
        }
