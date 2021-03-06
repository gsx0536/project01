package com.tieda.alarm.service.testBzd;
import com.tieda.alarm.entity.testBzd.TestBzd;
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
public interface ITestBzdService extends IService<TestBzd> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestBzd
         */
    TestBzd getTestBzdById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestBzd>
         */
        List<TestBzd> getTestBzdList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addTestBzd(TestBzd obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestBzd(List<TestBzd> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestBzd(TestBzd obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestBzd(List<TestBzd> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestBzdById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestBzd(List<Long> ids);
        }
