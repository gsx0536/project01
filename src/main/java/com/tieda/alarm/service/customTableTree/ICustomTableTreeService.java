package com.tieda.alarm.service.customTableTree;
import com.tieda.alarm.entity.customTableTree.CustomTableTree;
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
public interface ICustomTableTreeService extends IService<CustomTableTree> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  CustomTableTree
         */
    CustomTableTree getCustomTableTreeById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<CustomTableTree>
         */
        List<CustomTableTree> getCustomTableTreeList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addCustomTableTree(CustomTableTree obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchCustomTableTree(List<CustomTableTree> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateCustomTableTree(CustomTableTree obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchCustomTableTree(List<CustomTableTree> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteCustomTableTreeById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchCustomTableTree(List<Long> ids);
        }
