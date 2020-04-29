package com.tieda.alarm.mapper.ymTMonthimpfinishKmn;
import com.tieda.alarm.entity.ymTMonthimpfinishKmn.YmTMonthimpfinishKmn;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 月度重点工作完成情况 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-06-05
 */
@Repository
@Mapper
public interface YmTMonthimpfinishKmnMapper extends BaseMapper<YmTMonthimpfinishKmn> {

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
