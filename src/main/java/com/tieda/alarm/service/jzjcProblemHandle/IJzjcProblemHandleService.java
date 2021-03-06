package com.tieda.alarm.service.jzjcProblemHandle;
import com.tieda.alarm.entity.jzjcProblemHandle.JzjcProblemHandle;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-11-16
 */
public interface IJzjcProblemHandleService extends IService<JzjcProblemHandle> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  JzjcProblemHandle
         */
    JzjcProblemHandle getJzjcProblemHandleById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<JzjcProblemHandle>
         */
        List<JzjcProblemHandle> getJzjcProblemHandleList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addJzjcProblemHandle(JzjcProblemHandle obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchJzjcProblemHandle(List<JzjcProblemHandle> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateJzjcProblemHandle(JzjcProblemHandle obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchJzjcProblemHandle(List<JzjcProblemHandle> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteJzjcProblemHandleById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchJzjcProblemHandle(List<Long> ids);
        }
