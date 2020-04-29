package com.tieda.alarm.service.ymTMonthimpfinishKmn;
import com.tieda.alarm.entity.ymTMonthimpfinishKmn.YmTMonthimpfinishKmn;
import com.baomidou.mybatisplus.service.IService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 月度重点工作完成情况 服务类
 * </p>
 *
 * @author 
 * @since 2019-06-05
 */
public interface IYmTMonthimpfinishKmnService extends IService<YmTMonthimpfinishKmn> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YmTMonthimpfinishKmn
         */
    YmTMonthimpfinishKmn getYmTMonthimpfinishKmnById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YmTMonthimpfinishKmn>
         */
        List<YmTMonthimpfinishKmn> getYmTMonthimpfinishKmnList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
         */
        void addYmTMonthimpfinishKmn(YmTMonthimpfinishKmn obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchYmTMonthimpfinishKmn(List<YmTMonthimpfinishKmn> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateYmTMonthimpfinishKmn(YmTMonthimpfinishKmn obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchYmTMonthimpfinishKmn(List<YmTMonthimpfinishKmn> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteYmTMonthimpfinishKmnById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchYmTMonthimpfinishKmn(List<Long> ids);
        }
