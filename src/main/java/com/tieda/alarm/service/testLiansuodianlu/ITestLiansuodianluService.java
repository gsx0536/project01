package com.tieda.alarm.service.testLiansuodianlu;
import com.tieda.alarm.entity.testLiansuodianlu.TestLiansuodianlu;
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
public interface ITestLiansuodianluService extends IService<TestLiansuodianlu> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestLiansuodianlu
         */
    TestLiansuodianlu getTestLiansuodianluById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestLiansuodianlu>
         */
        List<TestLiansuodianlu> getTestLiansuodianluList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addTestLiansuodianlu(TestLiansuodianlu obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestLiansuodianlu(List<TestLiansuodianlu> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestLiansuodianlu(TestLiansuodianlu obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestLiansuodianlu(List<TestLiansuodianlu> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestLiansuodianluById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestLiansuodianlu(List<Long> ids);
        }
