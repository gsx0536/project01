package com.tieda.alarm.mapper.ymTMonthimpDKmn;
import com.tieda.alarm.entity.ymTMonthimpDKmn.YmTMonthimpDKmn;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 昆明南月重点工作子表 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2019-06-02
 */
@Repository
@Mapper
public interface YmTMonthimpDKmnMapper extends BaseMapper<YmTMonthimpDKmn> {

        /**
         * 根据 id 查询对象
         * @param id    对象 id
         * @return  YmTMonthimpDKmn
         */
    YmTMonthimpDKmn getYmTMonthimpDKmnById(Long id);

        /**
         * 查询对象列表信息
         * @param params    查询参数
         * @return List<YmTMonthimpDKmn>
         */
        List<YmTMonthimpDKmn> getYmTMonthimpDKmnList(Map<String, Object> params);

        /**
         * 添加对象实体
         * @param obj   对象实体
        */
        void addYmTMonthimpDKmn(YmTMonthimpDKmn obj);

        /**
         * 批量添加对象实体
         * @param list   对象实体集合
         */
        void addBatchYmTMonthimpDKmn(List<YmTMonthimpDKmn> list);

        /**
         * 更新对象实体
         * @param obj   对象实体
         */
        void updateYmTMonthimpDKmn(YmTMonthimpDKmn obj);

        /**
         * 批量更新对象实体
         * @param list  对象实体集合
         */
        void updateBatchYmTMonthimpDKmn(List<YmTMonthimpDKmn> list);

        /**
         * 根据ID删除对象实体
         * @param id 对象ID
         */
        void deleteYmTMonthimpDKmnById(Long id);

        /**
         * 批量删除对象实体
         * @param ids 对象实体ID集合
         * @return
         */
        void deleteBatchYmTMonthimpDKmn(List<Long> ids);

        List getWorkType();

        List getWorkProject();

    void checknorder(YmTMonthimpDKmn obj);

    void checknorderfordel(YmTMonthimpDKmn obj);

    void updatenNorderByNid(Map<String, Object> params);

    void updatenNorderByNorder(Map<String, Object> params);

    List getAllOrgByLvl(Map orgMap);


        }
