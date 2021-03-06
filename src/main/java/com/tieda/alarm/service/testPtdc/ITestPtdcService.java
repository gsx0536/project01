package com.tieda.alarm.service.testPtdc;
import com.tieda.alarm.entity.testPtdc.TestPtdc;
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
public interface ITestPtdcService extends IService<TestPtdc> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestPtdc
         */
    TestPtdc getTestPtdcById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestPtdc>
         */
        List<TestPtdc> getTestPtdcList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addTestPtdc(TestPtdc obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestPtdc(List<TestPtdc> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestPtdc(TestPtdc obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestPtdc(List<TestPtdc> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestPtdcById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestPtdc(List<Long> ids);
        }
