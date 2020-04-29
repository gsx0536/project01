package com.tieda.alarm.service.testJjsb;
import com.tieda.alarm.entity.testJjsb.TestJjsb;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-10-16
 */
public interface ITestJjsbService extends IService<TestJjsb> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestJjsb
         */
    TestJjsb getTestJjsbById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestJjsb>
         */
        List<TestJjsb> getTestJjsbList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addTestJjsb(TestJjsb obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestJjsb(List<TestJjsb> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestJjsb(TestJjsb obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestJjsb(List<TestJjsb> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestJjsbById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestJjsb(List<Long> ids);
        }
