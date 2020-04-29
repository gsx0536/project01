package com.tieda.alarm.service.ymVMonthimpworkFinishKmn;
import com.tieda.alarm.entity.ymVMonthimpworkFinishKmn.YmVMonthimpworkFinishKmn;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-06-11
 */
public interface IYmVMonthimpworkFinishKmnService extends IService<YmVMonthimpworkFinishKmn> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YmVMonthimpworkFinishKmn
         */
    YmVMonthimpworkFinishKmn getYmVMonthimpworkFinishKmnById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YmVMonthimpworkFinishKmn>
         */
        List<YmVMonthimpworkFinishKmn> getYmVMonthimpworkFinishKmnList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addYmVMonthimpworkFinishKmn(YmVMonthimpworkFinishKmn obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchYmVMonthimpworkFinishKmn(List<YmVMonthimpworkFinishKmn> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateYmVMonthimpworkFinishKmn(YmVMonthimpworkFinishKmn obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchYmVMonthimpworkFinishKmn(List<YmVMonthimpworkFinishKmn> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteYmVMonthimpworkFinishKmnById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchYmVMonthimpworkFinishKmn(List<Long> ids);
        }
