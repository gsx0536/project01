package com.tieda.alarm.mapper.ymTMonthimpworkMKmn;
import com.tieda.alarm.entity.ymTMonthimpworkMKmn.YmTMonthimpworkMKmn;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 昆明月度重点工作主表 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-06-02
 */
@Repository
@Mapper
public interface YmTMonthimpworkMKmnMapper extends BaseMapper<YmTMonthimpworkMKmn> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YmTMonthimpworkMKmn
         */
    YmTMonthimpworkMKmn getYmTMonthimpworkMKmnById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YmTMonthimpworkMKmn>
         */
        List<YmTMonthimpworkMKmn> getYmTMonthimpworkMKmnList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
        */
        void addYmTMonthimpworkMKmn(YmTMonthimpworkMKmn obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchYmTMonthimpworkMKmn(List<YmTMonthimpworkMKmn> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateYmTMonthimpworkMKmn(YmTMonthimpworkMKmn obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchYmTMonthimpworkMKmn(List<YmTMonthimpworkMKmn> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteYmTMonthimpworkMKmnById(Long id);

    /**
     * 批量删除对象实体
     * @param ids 对象实体ID集合
     * @return
     */
    void deleteBatchYmTMonthimpworkMKmn(List<Long> ids);

    /**
     * 插入签收表
     * @param id 主表ID
     * @return
     */
    void insertymTMonthFinishKmn (String mid);

        }
