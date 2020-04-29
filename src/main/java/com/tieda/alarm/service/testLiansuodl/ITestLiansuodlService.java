package com.tieda.alarm.service.testLiansuodl;
import com.tieda.alarm.entity.testLiansuodl.TestLiansuodl;
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
public interface ITestLiansuodlService extends IService<TestLiansuodl> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestLiansuodl
         */
    TestLiansuodl getTestLiansuodlById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestLiansuodl>
         */
        List<TestLiansuodl> getTestLiansuodlList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addTestLiansuodl(TestLiansuodl obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestLiansuodl(List<TestLiansuodl> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestLiansuodl(TestLiansuodl obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestLiansuodl(List<TestLiansuodl> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestLiansuodlById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestLiansuodl(List<Long> ids);
        }
