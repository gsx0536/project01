package com.tieda.alarm.mapper.checkRackItem;
import com.tieda.alarm.entity.checkRackItem.CheckRackItem;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-05-20
 */
@Repository
@Mapper
public interface CheckRackItemMapper extends BaseMapper<CheckRackItem> {

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

        List<CheckRackItem> getCheckRackItemListByItemId(Map<String, Object> params);

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


        void deleteCheckRackItemByCheckId(String id);

        void deleteCheckRackItemByNotItemId(List ids);

        }
