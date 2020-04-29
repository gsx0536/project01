package com.tieda.alarm.service.testTableDesign;
import com.tieda.alarm.entity.testTableDesign.TestTableDesign;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-09-28
 */
public interface ITestTableDesignService extends IService<TestTableDesign> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  TestTableDesign
         */
    TestTableDesign getTestTableDesignById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<TestTableDesign>
         */
        List<TestTableDesign> getTestTableDesignList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addTestTableDesign(TestTableDesign obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchTestTableDesign(List<TestTableDesign> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateTestTableDesign(TestTableDesign obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchTestTableDesign(List<TestTableDesign> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteTestTableDesignById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchTestTableDesign(List<Long> ids);
        }
