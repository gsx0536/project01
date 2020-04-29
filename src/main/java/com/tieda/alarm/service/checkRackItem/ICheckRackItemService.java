package com.tieda.alarm.service.checkRackItem;
import com.tieda.alarm.entity.checkRackItem.CheckRackItem;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-05-20
 */
public interface ICheckRackItemService extends IService<CheckRackItem> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  CheckRackItem
         */
    CheckRackItem getCheckRackItemById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<CheckRackItem>
         */
        List<CheckRackItem> getCheckRackItemList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addCheckRackItem(CheckRackItem obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchCheckRackItem(List<CheckRackItem> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateCheckRackItem(CheckRackItem obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchCheckRackItem(List<CheckRackItem> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteCheckRackItemById(String id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchCheckRackItem(List<Long> ids);
        }
